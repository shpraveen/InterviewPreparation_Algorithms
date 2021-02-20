package interviews.exceptions_adaface;


class CustomExceptions extends Exception{
	int num;
	CustomExceptions(int n){
		num=n;
	}
	
	public String toString() {
		return Integer.toString(num);
	}
}

public class ExecutingClass {
	static void calculate(int num) throws CustomExceptions{
		throw new CustomExceptions(num);
	}
	
public static void main(String[] args) {
	try {
		calculate(42);
	}catch(CustomExceptions e) {
		System.out.println("Catch22");
		
	}
}

}
