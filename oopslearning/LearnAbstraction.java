package oopslearning;

abstract class Calucator {

    abstract int sum(int a, int b);

    abstract int multiply(int a, int b);

    abstract int sub(int a, int b);

    public void cal(int a, int b) {
        int sumRes = sum(a, b);
        int mulRes = multiply(a, b);
        int subRes = sub(a, b);
        System.out.println("Sum of two number is " + sumRes);
        System.out.println("Multiplication of two number is " + mulRes);
        System.out.println("Substraction of two number is " + subRes);
    }

}

class DoCalucation extends Calucator {

    @Override
    int sum(int a, int b) {
        return a + b;
    }

    @Override
    int multiply(int a, int b) {
        return a * b;
    }

    @Override
    int sub(int a, int b) {
        return a - b;
    }

}

public class LearnAbstraction {

    public static void main(String[] args) {
        Calucator doCalucation = new DoCalucation();
        doCalucation.cal(100, 20);
    }
}
