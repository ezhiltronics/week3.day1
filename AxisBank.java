package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit()
	{ 
		System.out.println("The deposit method in Axis bank class");
	}
	public static void main(String[] args) {
		BankInfo bi= new AxisBank();
		bi.saving();
		bi.fixed();
		bi.deposit();
		
		
	}
}
