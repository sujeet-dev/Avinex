package Java_demo;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the sal : " );
	  int sal= sc.nextInt();
	  
	  int asal;
	  
	  if (sal>20000) 
	  {
		  asal=12*sal;
		  System.out.println("Annual salary is : " +asal);
		
	} else {
		System.out.println("Salay must be more than 20k_________");
	}

	}

}
