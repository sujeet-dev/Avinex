package Java;

import java.util.Scanner;

public class ReverseString_ForLoop {

	public static void main(String[] args) 
	{
//	  Scanner sc=new Scanner(System.in);
//	  System.out.println("Enter the value is : ");
//	   String val= sc.next();
//	   
//	   String rev=" ";
//	   
//	   for (int i = 0; i <val.length() ; i++) 
//	   {
//		   rev=val.charAt(i) + rev;
//		
//	}
//	   System.out.println(rev);
	   
	  // Reverse string through BufferClass
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the value : ");
		 String val= sc1.next();
		 
		 StringBuffer sb=new StringBuffer();
		 sb.append(val);
		 System.out.println(sb.reverse());
	}

}
