package oopslearning;

 class InhertenceLearning {
 int b =100;
    public InhertenceLearning(int a) {
        System.err.println("Excuted " +a);
    }

    

    public int convertToKG(int weight) {
        return weight/1000;
    }
    
    public int convertTogram(int weight) {
        return weight*1000;
    }
    
}

 class Conversions extends InhertenceLearning {


    public Conversions(int a,int b) {
         super(a);
        int c = super.b;
        System.err.println("parent value "+c);
    }

    @Override
    public int convertTogram(int weight) {
        return super.convertTogram(weight);
    }

    @Override
    public int convertToKG(int weight) {
        return weight;
    }
    
}
public class LearnInheretance {
    public static void main(String[] args) {
          InhertenceLearning c = new Conversions(100,100);
          System.err.println(c.convertToKG(100));
            System.err.println(c.convertTogram(1) ); 
    }
  
}