package Lecture5_Abstracrion;

public class HDFC implements RBI
{
	public void deposit() {
		System.out.println("Customer depositing the money");
	}

	@Override
	public void withdraw() {
		System.out.println("Customer withdrawing the money");
		
	}

	@Override
	public void giveInterest() {
		System.out.println("Rate of interest is 5%");
		
	}

}
