package Java8.interfaces;

public interface TestInterface1 {
	
	default void show() {
		System.out.println("Default Method Interface1 !");
	}
	
	static void print1() {
		
		System.out.println("Interface1 static method !");
	}

}
