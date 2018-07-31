package com.yi.vm.oom;

public class FinalizeEscapseGC {
	
	public static FinalizeEscapseGC self = null;

	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		FinalizeEscapseGC.self = this ;
		System.out.println("finalize is run");
	}
	
	public void isAlive(){
		System.out.println("i am is alive ");
	}
	
	public static void main(String[] args) throws InterruptedException {
		self = new FinalizeEscapseGC();
		self = null ;
		System.gc();
		
		//finalize 优先级比较低
		Thread.sleep(500);
		
		if(self != null){
			self.isAlive();
		}else {
			System.out.println(" self is dead");
		}
		
		
		self = null; 
		System.gc();
		//finalize 优先级比较低
		Thread.sleep(500);
		
		if(self != null){
			self.isAlive();
		}else {
			System.out.println(" self is dead");
		}
		
		
		
		
	}
	

}
