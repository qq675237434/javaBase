package com.yi.design.proxy.example2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.yi.design.proxy.Sourceable;

public class ProxyInvocationHandler implements InvocationHandler {
	
	private Sourceable source;
	
	public  ProxyInvocationHandler(Sourceable source){
		this.source = source;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("ProxyInvocationHandler before");
		System.out.println("Method:" + method);
		method.invoke(source, args);
		System.out.println("ProxyInvocationHandler after");
		return null;
	}

}
