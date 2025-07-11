package Java_demo;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String orgname = sc.nextLine();  // Use nextLine to allow spaces
        StringBuilder revname = new StringBuilder();

        for (int i = orgname.length() - 1; i >= 0; i--) {
            revname.append(orgname.charAt(i));  // Appending at the end is efficient

	}
        System.out.println("revname is: " + revname.toString());

}
}
