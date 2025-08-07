package collectionlearn;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsLearning {
    public static void main(String args[]) {
        Map<String,String> map = new HashMap();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        map.put("5", "five");
     List<String> a= map.entrySet()
        .stream()
        .filter(entry -> entry.getValue().endsWith("e")).map(entry -> entry.getValue()).toList();
          System.out.println(a);
          List<String> b = map.entrySet().stream().filter(entry -> "one".equals(entry.getValue())).map(entry->entry.getValue()+"A").toList();
          System.out.println(b);
    }
}
