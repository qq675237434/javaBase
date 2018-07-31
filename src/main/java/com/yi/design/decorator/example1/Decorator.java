package com.yi.design.decorator.example1;

public class Decorator implements Sourceable {

	private Sourceable source;
	
	public Decorator (Sourceable s){
		this.source = s;
	}
	
	public void method1() {
		this.before();
		source.method1();
		this.after();
		
	}
	
	private void before(){
		System.out.println("decorator before");
	}
	
	private void after(){
		System.out.println("decorator after");
	}

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}

}
