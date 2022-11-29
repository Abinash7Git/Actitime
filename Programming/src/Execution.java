 interface Shape {
	void draw( );

}
 class Rectangle implements Shape{
	 public void draw() {
		 System.out.println("Rectangle");
		 
	 }
 }
	class Triangle implements Shape{
		public void draw() {
			System.out.print("Trianle");
		}
	}
		class Circle implements Shape{
			public void draw(){
				System.out.println("Circle");
			}
		}
        public class Execution {

	       public static void main(String[] args) {
		Shape ob=new Rectangle();
		ob.draw();
		Shape oc=new Triangle();
		oc.draw();
		Shape od=new Circle();
		od.draw();


	}

}
