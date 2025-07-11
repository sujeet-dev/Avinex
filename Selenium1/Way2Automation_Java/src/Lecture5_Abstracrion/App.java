package Lecture5_Abstracrion;

public class App {

	public static void main(String[] args) 
	{
	   HDFC h=new HDFC();
	   h.deposit();
	   h.withdraw();
	   h.giveInterest();
	   
	   ICICI ic=new ICICI();
	   ic.deposit();
	   ic.withdraw();

	}

}
