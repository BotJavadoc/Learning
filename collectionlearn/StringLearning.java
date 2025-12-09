package collectionlearn;

import java.util.HashMap;

public class StringLearning {
public static void main(String[] args) {
    String s = "badc"; 
    String t = "baba";
    HashMap<Character,Character> map = new HashMap<>();
    for(int i=0;i<s.length();i++) {
        if(map.containsKey(s.charAt(i))) {
            System.err.println(s.charAt(i));
            if(map.get(s.charAt(i))!= t.charAt(i)) {       
            break;
        }
        } else {
            map.put(s.charAt(i),t.charAt(i));
        }
    }
    System.err.println(map);
}
}