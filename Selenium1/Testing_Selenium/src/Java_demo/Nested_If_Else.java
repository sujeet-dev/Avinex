package Java_demo;

import java.util.Scanner;

public class Nested_If_Else {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the salary : ");
	 double sal= sc.nextDouble();
	 double comm;
	 double gsal;
	 
	 if (sal<20000) 
	 {
		 comm=10*sal/100;
		 gsal=sal+comm;
		 System.out.println("Gsal is : " + gsal);
		
	}else if (sal>20000 && sal<40000) 
	{
		comm=20*sal/100;
		gsal=sal+comm;
		System.out.println("Gsal is : " + gsal);
		
	}else if (sal>40000) 
	{
	  comm=30*sal/100;
	  gsal=sal+comm;
	  System.out.println("Gsal is : " + gsal);
	}
	

	}

}
