package Lecture3;

import java.util.Scanner;

public class Looping_Demo {

	public static void main(String[] args) 
	{
		// Switch case
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the days value : ");
//		int day= sc.nextInt();
//		
//		
//		switch (day) {
//		case 2:
//			System.out.println("Tuesday");
//			break;
//			
//		case 1:
//			System.out.println("Monday");
//			break;
//			
//		case 3:
//			System.out.println("Wednesday");
//			break;
//			
//		case 4:
//			System.out.println("Thursday");
//			break;
//			
//		case 5:
//			System.out.println("Friday");
//			break;
//			
//		case 6:
//			System.out.println("Satuday");
//			break;
//			
//		case 7:
//			System.out.println("Sunday");
//			break;
//
//		default:System.out.println("Please enter the valid number");
//			break;
//		}
//		
//		
//		///While case
//		int i=1;
//		while (i<10) 
//		{
//			i++;
//			System.out.println(i);
//			
//		}

		
		
		/// Nested if Else  (Homework)
		
//		int j=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the days value : ");
		 int day= sc.nextInt();
		
			
			if (day==1) 
			{
				System.out.println("monday");
				
			}
			else if (day==2) {
				System.out.println("tuesday");
			}
			else if (day==3) {
				System.out.println("wednesday");
			}
			else if (day==4) {
				System.out.println("thursday");
			}
			else if (day==5) {
				System.out.println("friday");
			}
			else if (day==6) {
				System.out.println("saturday");
			}
			else if (day==7) {
				System.out.println("sunday");
			}
			else {
				System.out.println("You must be entered the value from 1 to 7");
			}
			
		}
	}


