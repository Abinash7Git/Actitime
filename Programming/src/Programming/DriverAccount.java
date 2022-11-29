package Programming;

public class DriverAccount {

	public static void main(String[] args) {
		Account ac=new Account(4545674554l,3435,"Abinash",50000d);
		System.out.println(ac.getPin());
		ac.setPin(3435,5050);
		System.out.println(ac.getPin());
		System.out.println(ac.getBalance());
		ac.setBalance(20000d);
		System.out.println(ac.getBalance());

	}

}
