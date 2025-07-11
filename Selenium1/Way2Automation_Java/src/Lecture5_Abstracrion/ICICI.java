package Lecture5_Abstracrion;

public class ICICI implements RBI
{

	@Override
	public void deposit() {
		System.out.println("Deposit Money");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw Money");
		
	}

	@Override
	public void giveInterest() {
		System.out.println("Rate interest");
		
	}
	

}
