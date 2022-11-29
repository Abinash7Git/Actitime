package Programming;

public interface Human {
	public void eat();
	
	public static int earn() {
		return 5000;
	}
	default  void enjoy() {
		System.out.println("Alcohol");
	}

}
