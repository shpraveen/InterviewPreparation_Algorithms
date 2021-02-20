package Java8.interfaces;


//We cannot instantiate Interface, however we can implement anonymous inner class
public interface TestInterface3 {
	
	public void square(int a);
	
	default void show() {
		System.out.println("Default Method Interface3 !");
		
	}
	
	static void print1() {
		
		System.out.println("Interface3 static method !");
	}


}
