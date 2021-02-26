package interviews.EY.MorganStanley;

public class Static_Inheritance2 extends Animal2{
	static String a="Cat";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(a);// what will print
		System.out.println(Static_Inheritance2.a);// what will print
		System.out.println(Animal2.a);// what will print
		
		//Static_Inheritance2.a=

	}

}

class Animal2{
	
	static String a="Animal";
	
}

//class Cat extends Animal{
//	
//	
//	
//	
//	
//}
