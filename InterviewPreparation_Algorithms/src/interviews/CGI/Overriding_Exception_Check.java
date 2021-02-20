package interviews.CGI;

import java.io.IOException;

//method overrididng when
//base - p v m1() throws IOException
//child - p v m1() throws Exception
//will compiler thrwo an exception / or will it be allowed
// compiler will tnrow exception, compiler will tell to add exception also in overriden base method and remove IOException

class Overriding_Exception_Check {
    public void method1() throws IOException, Exception {

        throw new IOException();
    }
}

class Overriding_Exception_Check2 extends Overriding_Exception_Check {

    public void method1() throws Exception {

        throw new Exception();
    }

}

