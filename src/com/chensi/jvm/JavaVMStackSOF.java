package com.chensi.jvm;

/**
 * VM Args: -Xss128k 2019��3��14�� chensi
 **/
public class JavaVMStackSOF {
	private int stackLength = 1;

	public void stackLeak() {
		stackLength++;
		stackLeak();
	}

	public static void main(String[] args) throws Throwable {
		JavaVMStackSOF oom = new JavaVMStackSOF();
		try {
			oom.stackLeak();
		} catch (Exception e) {
			System.out.println("stack length: " + oom.stackLength);
			throw e;
		}
	}

}
