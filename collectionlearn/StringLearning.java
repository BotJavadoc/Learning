package collectionlearn;

import java.util.*;;

public class StringLearning {
public static void main(String[] args) {
    String s = "abcde"; 
    String t = "abced";
    char sArry [] = s.toCharArray();
    char tArry [] = t.toCharArray();
    for(int i=0;i<sArry.length;i++) {
    
        if(Arrays.equals(sArry, tArry)) {
            
        } else {
                rotate(sArry);
        }
    }
   
}
public static char [] rotate(char [] sArry) {
    char lastElement = sArry[sArry.length - 1];
     for (int i = sArry.length - 1; i > 0; i--) {
            sArry[i] = sArry[i - 1];
        }
        sArry[0] = lastElement;
    return sArry;
}
}