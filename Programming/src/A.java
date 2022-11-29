
public class A {
	 int a=20;
	public static  void add()
	{
		float a=10.5f;
		System.out.println(a+2);
		A ob=new A();
		System.out.println(ob.a);
	}


	public static void main(String[] args) {
		A ob=new A();
		add();
		System.out.println(ob.a);
	   //System.out.println(a);
	}

}
