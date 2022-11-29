package Programming;

public class Drivercast {

	public static void main(String[] args) {
		AnimalClass an=new Dog("white");
		an.eat();
		Dog d=(Dog)an;
		d.bark();

	}

}
