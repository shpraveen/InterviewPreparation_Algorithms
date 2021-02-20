package Java8.interfaces;

public interface TestInterface2 {
	
	default void show() {
		System.out.println("Default Method Interface2 !");
		
	}
	
	static void print1() {
		
		System.out.println("Interface2 static method !");
	}


}
