package interviews.overloading_overriding;
public class Test8 
{ 
//    public int getData() //getdata() 1 
//    { 
//        return 0; 
//    } 
    public long getData() //getdata 2 
    { 
        return 1; 
    } 
    public static void main(String[] args) 
    { 
        Test8 obj = new Test8(); 
        System.out.println(obj.getData());     
    } 
} 

//Compilation error

//Explanation: For method overloading, methods must have different signatures. Return type of methods does not 
//contribute towards different method signature, 
//so the code above give compilation error. Both getdata 1 and getdata 2 only differ in return types and NOT 
//signatures.

