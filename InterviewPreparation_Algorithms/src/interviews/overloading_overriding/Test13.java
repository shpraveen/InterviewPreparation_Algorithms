package interviews.overloading_overriding;


public class Test13 
{ 
	private String function(float i, int f) 
	{ 
		return ("gfg"); 
	} 
	private String function(double i, double f) 
	{ 
		return ("GFG"); 
	} 
	public static void main(String[] args) 
	{ 
		Test13 obj = new Test13(); 
		System.out.println(obj.function(1., 20));	 
	} 
} 


//GFG

//Explanation: This one is really simple. Different type of arguments contribute towards method overloading as the signature of methods is changed with type of attributes. Whichever matches the attributes is obviously called in Method Overloading. Here we are pass first attributes double not float.

