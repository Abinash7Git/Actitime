package Programming;

public class DriverMultiple implements Human,Employee {
	public void eat() {
		System.out.println("sleeping");
	}

	public static void main(String[] args) {
		
     DriverMultiple d=new DriverMultiple();
     d.eat();
	}

}
