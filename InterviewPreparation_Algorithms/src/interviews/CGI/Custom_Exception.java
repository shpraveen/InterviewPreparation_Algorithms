package interviews.CGI;


//Q> Custom Exception:
//what to extend Exception or RunTimeException
//:: Ans:: RunTimeException or Exception as EXception is superclass of RunTimeException
// can extend anyone of them, better to extend Exception as it is the parent

class MyException extends Exception{

    public MyException(String s){
        super(s);
    }
}

public class Custom_Exception{

    public static void main(String[] args) throws MyException {
        try {
            throw new MyException("Custom Exception thrown");
        }catch(MyException e){
            System.out.println("Custom Exception Caught");
            System.out.println(e.getStackTrace());
            System.out.println(e.getMessage());
        }
    }

}

