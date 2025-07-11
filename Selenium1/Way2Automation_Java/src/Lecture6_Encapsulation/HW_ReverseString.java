package Lecture6_Encapsulation;

import java.util.Scanner;

public class HW_ReverseString {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the String : ");
	  String str= sc.next();
	  
	  StringBuffer s1=new StringBuffer(str);
	  System.out.println(s1.reverse());
	  System.out.println(s1.length());
	  System.out.println(s1.charAt(1));
	  System.out.println(s1.capacity());

	}

}
