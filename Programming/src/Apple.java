
public class Apple {
	int a=10;
	static int b=20;

	public static void print() {
		System.out.println(b);
		Apple ob=new Apple();
		System.out.println(ob.a);

	}
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
		
	}

}
class Change{
	void print()
	{
		System.out.println(Apple.b);
		Apple ob1=new Apple();
		System.out.println(ob1.a);
	}
	static void define() {
		System.out.println(Apple.b);
		Apple ob2=new Apple();
		System.out.println(ob2.a);
		}
}
class GreenApple extends Apple
{
	void m1() {
		System.out.println(b);
		System.out.println(a);
		
	}
  public static void main(String[] args)
	{
		System.out.println(b);
		Apple ob3=new Apple();
		System.out.println(ob3.a);
	}
}
