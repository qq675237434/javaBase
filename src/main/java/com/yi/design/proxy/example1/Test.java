package com.yi.design.proxy.example1;

import com.yi.design.proxy.Sourceable;

public class Test {

	public static void main(String[] args) {
		Sourceable source = new Source();
		Sourceable proxy = new Proxy(source);
		
		proxy.method();
		
	}
}
