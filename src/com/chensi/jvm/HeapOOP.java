package com.chensi.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * VM Args: -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError
* 2019Äê3ÔÂ14ÈÕ
* chensi
**/
public class HeapOOP {
	
	static class OOMObject {
		
	}

	public static void main(String[] args) {
		List<OOMObject> list = new ArrayList<>();
		while(true) {
			list.add(new OOMObject());
		}

	}

}
