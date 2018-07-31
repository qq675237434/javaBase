package com.yi.reflect;

import java.lang.reflect.Field;

public class Person {
	
	private String str1 = "ball";
	private String str2 = "basketball";
	private String str3 = "yih";
	
	@Override
	public String toString(){
		
		return str1 + "|" + str2  + "|" + str3 ;
	}
	
	public static void main(String[] args) throws Exception, IllegalAccessException {
		Person per = new Person();
		
		System.out.println(per);
		Field[] fields = per.getClass().getDeclaredFields();
		for(Field feild : fields){
			if(feild.getType() == String.class){
				
				String oldVal = (String)feild.get(per);
				
				String newVal = oldVal.replace('b', 'a');
				
				feild.set(per, newVal);
				
			}
		}
		
		System.out.println(per);
		
	}

}
