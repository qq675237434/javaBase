package com.yi.design.adapter.interfaceAdapter;

import com.yi.design.adapter.Targetable;

public class Adapter implements Targetable {
	
	private Wrapper1 wrapper1;
	
	public void method1() {
		wrapper1.method1();
	}

	public void method2() {

		wrapper1.method2();
	}

	public Wrapper1 getWrapper1() {
		return wrapper1;
	}

	public void setWrapper1(Wrapper1 wrapper1) {
		this.wrapper1 = wrapper1;
	}
	

}
