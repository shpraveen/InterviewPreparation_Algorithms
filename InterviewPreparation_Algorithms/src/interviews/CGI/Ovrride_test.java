package interviews.CGI;

//Does below method form a set of of method overriding if defined in parent and child class?
//public Superclass getMethodA(){}
//public subclass getMethodA(){}


public class Ovrride_test{

    public static void main(String[] args) {
        Ovrride_test op= new Ovrride_test_Child();
        Ovrride_test op1= new Ovrride_test_Child();
        ((Ovrride_test_Child) op).getMethodA();
    }
}


class Ovrride_test1 {

    public Ovrride_test getMethodA(){
        Ovrride_test ovrride_test = new Ovrride_test();
        System.out.println("Parent Method");

        return ovrride_test;
    }


}

class Ovrride_test_Child extends Ovrride_test{

    Ovrride_test_Child ovrride_test_child = new Ovrride_test_Child();
    public Ovrride_test_Child getMethodA(){

        System.out.println("Child Method");

        return ovrride_test_child;
    }
    Ovrride_test_Child ovrride_test_child1=getMethodA();

//    public static void main(String[] args) {
//        ovrride_test_child.getMethodA();
//    }
}


