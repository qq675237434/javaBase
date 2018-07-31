package com.yi.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE , ElementType.METHOD})
public @interface MyAnotation {
	
	//1.默认类型  value 属性为默认属性，可不写
	String value();
	
	//2.需要加名字的属性值
	String name() default "yif";
	
	//3.数组类型
	int[] arryAtt()default {1,2} ;
	
	//3.返回一个class
	Class<?> clazzAttr();
	
	//4.返回一个annotation
	
	MeterAnotation annos();

}
