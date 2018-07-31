package com.yi.design.adapter.classAdapter;

import com.yi.design.adapter.Targetable;

public class Adapter extends Source implements Targetable {

	public void method2() {
		System.out.println("this target method2");
	}

}
