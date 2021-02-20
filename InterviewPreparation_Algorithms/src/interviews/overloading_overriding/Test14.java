package interviews.overloading_overriding;


class A 
{ 
	public A(String s) 
	{ 
		System.out.print("A"); 
	} 
} 

public class Test14 extends A 
{ 
	public Test14(String s) 
	{ 
		super("C");//Comment this
		System.out.print("B"); 
	} 
	
	public static void main(String[] args) 
	{ 
		new Test14("C"); 
		System.out.println(" "); 
	} 
} 
 


//Compilation fails

//Explanation: The implied super() call in B�s constructor cannot be satisfied because there isn�t a no-arg constructor in A. A default, no-arg constructor is generated by the compiler only if the class has no constructor defined explicitly

