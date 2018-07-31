package com.yi.design.adapter.objectAdapter;

import com.yi.design.adapter.Targetable;

public class Adapter implements Targetable{
	
	private Source soruce ;

	public void method1() {
		soruce.method1();
	}

	public void method2() {
		
		soruce.method2();
	}

	public Source getSoruce() {
		return soruce;
	}

	public void setSoruce(Source soruce) {
		this.soruce = soruce;
	}

}
