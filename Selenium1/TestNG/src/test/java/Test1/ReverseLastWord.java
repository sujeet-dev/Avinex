package Test1;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ReverseLastWord 
{
	@Test
	public void LastRev() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		String val= sc.next();
		
//		String val="I love Java";		
		
		String bf=val.replace("love" ,new StringBuffer("love").reverse().toString());
		System.out.println(bf);
		
		
	
		
//		 String output = val.replace("Java", new StringBuilder("Java").reverse().toString());
//	        
//	        System.out.println("Output: " + output);
		
		
//		String input = "I love Java";

        // Replace "Java" with its reversed form "avaJ"
//        String output = input.replace("Java", new StringBuilder("Java").reverse().toString());

//        System.out.println("Output: " + output);
		
	}

}
