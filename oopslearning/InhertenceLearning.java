package oopslearning;

public class InhertenceLearning {

    public int convertToKG(int weight) {
        return weight/1000;
    }
    
    public int convertTogram(int weight) {
        return weight*1000;
    }
    
}

 class Conversions extends InhertenceLearning {

    @Override
    public int convertTogram(int weight) {
        return super.convertTogram(weight);
    }
    
}
