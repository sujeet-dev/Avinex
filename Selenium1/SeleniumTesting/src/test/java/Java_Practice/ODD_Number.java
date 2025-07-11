package Java_Practice;

import java.util.Scanner;

public class ODD_Number {

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the Number : ");
	int number=  sc.nextInt();
	  
	  if (number %2 !=0) 
	  {
		  System.out.println("Number is odd : " + number);
		
	}else {
		
		System.out.println("Number is Even : " + number);
	}

	}

}
