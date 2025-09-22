package oopslearning;
 
public class Weight {
int kg;
int gram;
int miligram;

    public Weight(int kg) {
        this.kg=kg;
    }   
    public Weight(int gram, int miligram) {
        this.gram=gram;
        this.miligram = miligram;
    }

}

class Main {
public static void main(String[] args) {
    Weight weight = new Weight(10);
    Weight weight1 = new Weight(10, 10);
    System.out.println(weight.kg * weight.kg);
    System.out.println(weight1.gram + weight1.miligram);
}

}