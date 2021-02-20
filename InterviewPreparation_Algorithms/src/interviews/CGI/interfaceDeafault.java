package interviews.CGI;

interface MyInterface{

    default void newMethod(){
        System.out.println("Newly added default method");
        //return 1;
    }
    void existingMethod(String str);
}
interface MyInterface2{

    default void newMethod(){
        System.out.println("Newly added default method");
        //return "S";
    }
    void disp(String str);
}
public class interfaceDeafault implements MyInterface, MyInterface2{
    @Override
    public void newMethod() {

    }


    // implementing abstract methods
    public void existingMethod(String str){
        System.out.println("String is: "+str);
    }
    public void disp(String str){
        System.out.println("String is: "+str);
    }

    public static void main(String[] args) {
        interfaceDeafault obj = new interfaceDeafault();

        //calling the default method of interface
        obj.newMethod();


    }
}

