package Programming;

public class Lion  extends Animal{
	
	int weight;
	

	public Lion(String name, String color,int weight) {
		super(name, color);
		this.weight=weight;
		
	}
	
	public void hunt() {
		super.Eat();
		System.out.println("Lion is hunting");
	}
	

}
