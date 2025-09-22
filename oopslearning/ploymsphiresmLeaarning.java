package oopslearning;
  class Onesum {
    public int sum(int a, int b) {
        return  a+b;
    }

}
 class ThreeSum extends Onesum {
    @Override
    public int sum(int a, int b) {
        int threeSum =10;
        threeSum = threeSum +a+b;
        return threeSum;
    }
}

class FourSum extends Onesum {

    @Override
    public int sum(int a, int b) {
        int fourSum = 10;
        fourSum = fourSum + fourSum +a+b;
        return fourSum;
    }

}

public class ploymsphiresmLeaarning  {

    public static void main(String args[]) {
        Onesum onesum = new Onesum();
        Onesum threeSumm = new ThreeSum();
        Onesum fourSum = new FourSum();
        System.out.println("One sum result is "+ onesum.sum(10, 20));
        System.out.println("One ThreeSum result is "+ threeSumm.sum(10, 20));
        System.out.println("One Foursum result is "+ fourSum.sum(10, 20));
        
    }
    
}