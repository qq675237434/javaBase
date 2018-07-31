package com.yi.design.proxy.example2;

import java.lang.reflect.Proxy;

import com.yi.design.proxy.Sourceable;

public class Test {
	
	public static void main(String[] args) {
		
		Source source = new Source();
		ProxyInvocationHandler handler = new ProxyInvocationHandler(source);
		
		Sourceable proxy = (Sourceable)Proxy.newProxyInstance(handler.getClass().getClassLoader(), source.getClass().getInterfaces(), handler);
		
		proxy.method();
	}

}
