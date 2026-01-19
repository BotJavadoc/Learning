package oopslearning;

abstract class Calucator implements MyInterface {
    abstract void method();
}

interface MyInterface {
    void method2();
}
class DoCalucation extends Calucator {

    @Override
    void method() {
        System.out.println("hit the method 1");
    }

    @Override
    public void method2() {
       System.out.println("hit the method 2");
    }
   
}

public class LearnAbstraction {

    public static void main(String[] args) {
        Calucator cal = new DoCalucation();
        cal.method();
        cal.method2();
    }
}
