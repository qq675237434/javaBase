package com.yi.design.adapter.objectAdapter;

public class Test {

	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		Source source = new Source();
		adapter.setSoruce(source);
		
		adapter.method1();
		adapter.method2();
	}
}
