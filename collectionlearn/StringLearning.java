package collectionlearn;

import java.util.*;

public class StringLearning {
public static void main(String[] args) {
    String s = "rrrr    aaaajj"; 
    Map<Character, Integer> freq = new TreeMap<>();
    TreeMap<Integer, ArrayList<Character>> list = new TreeMap<>();
    for(int i=0;i<s.length();i++) {
        if(freq.containsKey(s.charAt(i))) {
            freq.put(s.charAt(i), freq.get(s.charAt(i))+1);
        } else{
            freq.put(s.charAt(i),1);
        }
    }
    for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
    list.computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
        .add(entry.getKey());
    }
   for (Map.Entry<Integer, ArrayList<Character>> entry : list.descendingMap().entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}


    System.err.println(list);
    }   

    
}