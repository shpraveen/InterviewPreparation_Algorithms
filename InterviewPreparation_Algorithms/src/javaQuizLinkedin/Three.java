package javaQuizLinkedin;

public class Three implements One,Two {
	public void method() {
		One.super.method();	
		//super.One.method();
	}
	
}
