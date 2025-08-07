package collectionlearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapLearning {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
         map.put("6", "two");
        map.put("3","three");
        System.out.println(map);
        ArrayList<String> a = new ArrayList<>();
        a.add("one");
        a.add("two");
        a.add("three");
        a.add("two");
        System.out.println(a);
        for(Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println("Key : " +entry.getKey() + " Value : "+ entry.getValue()+" "+Collections.frequency(a, entry.getValue()));
        }
        
    }
}
