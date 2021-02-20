package interviews.overloading_overriding;

// Compilation error -The overriding method must have same signature, which includes,
//the argument list and the return type 

class Derived2  
{ 
    public void getDetails(String temp) 
    { 
        System.out.println("Derived class " + temp); 
    } 
} 
  
public class Test2 extends Derived2
{ 
//    public int getDetails(String temp) 
	public void getDetails(String temp)
    { 
        System.out.println("Test class " + temp); 
       // return 0; 
    } 
    public static void main(String[] args) 
    { 
        Test2 obj = new Test2(); 
        obj.getDetails("GFG"); 
    } 
} 