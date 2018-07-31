package com.yi.vm.ts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBTrace {

	public int add(int a , int b ){
		
		return a + b ; 
	}
	
	public static void main(String[] args) throws IOException {

		TestBTrace test = new TestBTrace() ;
		BufferedReader  reade = new BufferedReader(new InputStreamReader(System.in));
		for(int  i = 0 ; i < 10 ; i++){
			reade.readLine();
			int a = (int)Math.round(Math.random() * 1000);
			int b = (int)Math.round(Math.random() * 1000);
			
			test.add(a, b);
		}
	}

}
