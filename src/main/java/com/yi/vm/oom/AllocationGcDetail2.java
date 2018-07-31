package com.yi.vm.oom;

public class AllocationGcDetail2 {
	
	private static final int _1MB = 1024 * 1024 ;
	
	/**
	 * VM 参数 ：
	 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC -XX:PretenureSizeThreshold=3145728
	 * -XX:+printHeapAtGC
	 * @param args
	 */
	public static void main(String[] args) {
		
		byte[] allocat4 ;
		allocat4 = new byte[4 * _1MB];
		
	}
	
	

}
