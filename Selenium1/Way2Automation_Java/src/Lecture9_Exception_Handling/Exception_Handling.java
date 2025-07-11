package Lecture9_Exception_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exception_Handling {

	public static void main(String[] args) 
	{
		//Comple time exception
	  String filepath= "C:\\Selenium1\\Way2Automation_Java\\src\\Lecture8_Hashmap\\Test";
       try {
		FileReader read=new FileReader(filepath);
	} catch (FileNotFoundException e) {
		System.out.println("Please try find the file location");
	}
       
       //Run Time Exception
       
       int id[] =new int[5];
       try {
    	   System.out.println(id[7]);
	} catch (Exception e) {
		System.out.println("Array Index bound Exception");
	}
       
       String name=null;
       try {
       System.out.println(name.length());
       }
       catch (Exception e) {
		System.out.println("NullPointerException");
	}
       
	}

}
