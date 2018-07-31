package com.yi.design.proxy.example1;

import com.yi.design.proxy.Sourceable;

public class Proxy implements Sourceable{
	
	private Sourceable  source;
	
	public Proxy(Sourceable source1){
		this.setSource(source1);
	}

	public void method() {
		System.out.println("before method");
		source.method();
		System.out.println("after method");
		
	}
	
	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}

}
