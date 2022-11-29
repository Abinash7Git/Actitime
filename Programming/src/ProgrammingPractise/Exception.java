package ProgrammingPractise;

public class Exception {
	 static void method()  
	    {  
	        System.out.println("Inside the method()");  
	        throw new ArithmeticException("throwing ArithmeticException");  
	    }  
	    //main method  
	    public static void main(String args[])  
	    {  
	        try  
	        {  
	            method();  
	        }  
	        catch(ArithmeticException e)  
	        {  
	            System.out.println("caught in main() method");  
	        }  
	    }    
}

