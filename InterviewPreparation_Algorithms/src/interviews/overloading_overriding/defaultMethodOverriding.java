package interviews.overloading_overriding;

public class defaultMethodOverriding extends ABC{
	
//https://medium.com/javarevisited/these-4-examples-explains-all-about-java-polymorphism-6af22a38ba26

@Override
public StringBuilder m1() {
		StringBuilder s =new StringBuilder();
		s.append("StringBuilder");
		return s;	
	}
}
class ABC{
//	public StringBuffer m1() {	
//		StringBuffer s =new StringBuffer();
//		s.append("StringBuffer");
//		return s;		
//	}
	
	
	public Object m1() {	
		StringBuffer s =new StringBuffer();
		s.append("StringBuffer");
		return s;		
	}
}

