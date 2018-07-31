package com.yi.design.adapter.interfaceAdapter;

public class Test {

	public static void main(String[] args) {
		Adapter adapter = new Adapter();
		Adapter adapter2 = new Adapter();
		Subclass1 subclass1 = new Subclass1();
		Subclass2 subclass2 = new Subclass2();
		
		adapter.setWrapper1(subclass1);
		adapter2.setWrapper1(subclass2);
		
		adapter.method1();
		adapter.method2();
		
		adapter2.method1();
		adapter2.method2();
		
	}
}
