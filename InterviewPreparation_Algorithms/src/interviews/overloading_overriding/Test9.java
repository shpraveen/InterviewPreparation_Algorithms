package interviews.overloading_overriding;


public class Test9 
{ 
//    public int getData(String temp) throws IOException 
//    { 
//        return 0; 
//    } 
    public int getData(String temp) throws Exception 
    { 
        return 1; 
    } 
    public static void main(String[] args) 
    { 
        Test9 obj = new Test9(); 
        try {
			System.out.println(obj.getData("GFG"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}     
    } 
} 

//Compilation error

//Explanation: Methods that throws different exceptions are not overloaded as their signature are still the same.

