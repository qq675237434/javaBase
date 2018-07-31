package com.yi.design;

import java.util.concurrent.TimeUnit;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Integer kk = new Integer(100);
        /*Integer a1 = new Integer(100);
        Integer a2 = new Integer(100);
        
        Integer a3 = new Integer(1000);
        Integer a4 = new Integer(1000);
        
        System.out.println(a1 == a2);
        System.out.println(a3 == a4);*/
    	
    	
    	 /*new App().start();  
         System.out.println("The Application is doing something");  
           
         try  
         {  
             TimeUnit.MILLISECONDS.sleep(5000);  
         }  
         catch (Exception e)  
         {  
             e.printStackTrace();  
         }  
         
         System.out.println("The Application is end");*/
    	System.out.println(3*0.1);
    	
    	System.out.println(3*0.1 == 0.3);
    }
    
    
    public void start()  
    {  
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {  
            public void run()  
            {  
                System.out.println("Execute Hook.....");  
            }  
        }));  
    }    
}
