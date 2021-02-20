package Java8.interfaces.diamondProblem;

public interface A {
	
	default void test() {
		
		System.out.println("Inside B: ");
		
	}

}
