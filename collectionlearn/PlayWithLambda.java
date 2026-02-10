package collectionlearn;

public class PlayWithLambda {

    public static void main(String args[]) {
      int sum = PlayWithLambda.printAdd((a,b) -> (a+b), 10,20);
      System.err.println("sum is "+sum);
    }
       static int printAdd(MyInterface myInterface, int a , int b) {
            return  myInterface.add(a, b);
        }

}
@FunctionalInterface
 interface MyInterface {
    abstract int add(int a,int b);
}
