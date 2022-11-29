package Programming;

public class Account {
	long Accno;
	private int pin;
	String acholder;
	private double balance;
	
	public Account(long accno, int pin, String acholder, double balance) {
		super();
		Accno = accno;
		this.pin = pin;
		this.acholder = acholder;
		this.balance = balance;
	}
	public int getPin() {
		return pin;
	}

	public void setPin(int pin,int newpin) {
	if (this.pin==pin) {
		this.pin=newpin;
	}
	else
		System.out.println("invalid pin");
	}

	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double amount) {
		balance=balance+amount;
		System.out.println("Balance update successfull");
	}
	
	
	
	

}
