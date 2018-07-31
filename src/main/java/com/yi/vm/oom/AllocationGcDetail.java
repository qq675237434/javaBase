package com.yi.vm.oom;

public class AllocationGcDetail {
	
	private static final int _1MB = 1024 * 1024 ;
	
	/**
	 * VM 参数 ：
	 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseSerialGC -XX:+PretenureSizeThreshold=3145728
	 * -XX:+PrintHeapAtGC +XX:+TraceClassLoading
	 * @param args
	 */
	public static void main(String[] args) {
		
		byte[] allocat1 , allocat2 , allocat3 ,allocat4 ;
		allocat1 = new byte[2 * _1MB];
		allocat2 = new byte[2 * _1MB];
		allocat3 = new byte[2 * _1MB];
		allocat4 = new byte[4 * _1MB];
		
		System.out.println("最大memory :" + Runtime.getRuntime().maxMemory()/1024/1024 + "M");
		
		System.out.println("最大 feee memory :" + Runtime.getRuntime().freeMemory()/1024/1024 + "M");
		
		System.out.println("最大 total memory" + Runtime.getRuntime().totalMemory()/1024/1024 + "M");
		
	}
	
	

}
