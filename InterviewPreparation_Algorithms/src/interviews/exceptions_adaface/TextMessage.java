package interviews.exceptions_adaface;

//public abstract class TextMessage implements Message {
//	public abstract void display(String msg) {}
//
//}

// abstract method do not imply a body

//public abstract class TextMessage implements Message {
//}

// correct

//public class TextMessage extends Message {
//public void display(Integer msg) {}
//
//}

// The type Message cannot be the superclass of TextMessage; a superclass must be a class for extends


//public class TextMessage implements Message {
//public void display(Integer msg) {}
//
//}

//The type TextMessage must implement the inherited abstract method Message.display(String)


public class TextMessage implements Message {
public void display(Integer msg) {}
public void display(String msg) {}

}

// correct