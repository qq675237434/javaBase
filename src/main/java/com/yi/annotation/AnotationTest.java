package com.yi.annotation;

@MyAnotation(annos=@MeterAnotation("kkk"), value = "yih" , arryAtt={1,2} , clazzAttr= AnotationTest.class)
public class AnotationTest {  
	
	public static void main(String[] args) {
		AnotationTest  myAnotation = new AnotationTest();
		if(myAnotation.getClass().isAnnotationPresent(MyAnotation.class)){
			MyAnotation annons = myAnotation.getClass().getAnnotation(MyAnotation.class);
			System.out.println(annons.value());
			System.out.println(annons.name());
			System.out.println(annons.arryAtt().length);
			System.out.println(annons.clazzAttr());
			System.out.println(annons.annos().value());
			
		}
		
	}

}
