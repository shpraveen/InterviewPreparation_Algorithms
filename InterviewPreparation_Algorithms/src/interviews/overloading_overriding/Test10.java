package interviews.overloading_overriding;


public class Test10 
{ 
    private String function() 
    { 
        return ("GFG"); 
    } 
    public final static String function(int data) 
    { 
        return ("GeeksforGeeks"); 
    } 
    public static void main(String[] args) 
    { 
        Test10 obj = new Test10(); 
        System.out.println(obj.function());     
    } 
} 

//GFG

//Explanation: Access modifiers associated with methods doesn’t determine the criteria for overloading. The overloaded methods could also be declared as final or static without affecting the overloading criteria.

