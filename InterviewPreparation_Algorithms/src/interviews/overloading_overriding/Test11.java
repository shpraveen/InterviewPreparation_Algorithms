package interviews.overloading_overriding;


public class Test11 
{ 
    private String function(String temp, int data) 
    { 
        return ("GFG"); 
    } 
    private String function(int data, String temp) 
    { 
        return ("GeeksforGeeks"); 
    } 
    public static void main(String[] args) 
    { 
        Test11 obj = new Test11(); 
        System.out.println(obj.function(4, "GFG"));     
    } 
} 
//GeeksforGeeks

//Explanation: The order of argument are an important parameter for determining method overloading. As the order of attributes are different, the methods are overloaded.

