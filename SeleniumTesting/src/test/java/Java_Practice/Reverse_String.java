package Java_Practice;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the value : ");
	   String val= sc.next();
	   
//	   String rev=" ";
//	   
//	   for (int i = 0; i < val.length(); i++) 
//	   {
//		   rev=val.charAt(i) + rev;
//		  
//		
//	}
	   
	   StringBuffer bf=new StringBuffer(val);
	   System.out.println(bf.reverse());
//	   System.out.println("The reverse string is : " +rev);

	}

}
