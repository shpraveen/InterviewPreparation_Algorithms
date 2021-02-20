package interviews.CGI;

class A1{
public static void printName(){
    System.out.println("123");
}
        }

        class B extends A1{
public static void printName(){
    System.out.println("456");
}
        }

public class A{

    public static void main(String[] args) {
        A1 a = new B();
        //a.printName("In class A");
        a.printName();

        B b = new B();
       // b.printName("In class B");
        b.printName();

    }
}





