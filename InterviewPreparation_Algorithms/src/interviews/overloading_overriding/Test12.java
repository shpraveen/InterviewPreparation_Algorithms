package interviews.overloading_overriding;


public class Test12 
{ 
	private String function(String temp, int data, int sum) 
	{ 
		return ("GFG"); 
	} 
	private String function(String temp, int data) 
	{ 
		return ("GeeksforGeeks"); 
	} 
	public static void main(String[] args) 
	{ 
		Test12 obj = new Test12(); 
		System.out.println(obj.function("GFG", 0, 20));	 
	} 
} 

//GFG

//Explanation: The order of argument are an important parameter for determining method overloading.

