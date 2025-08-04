package collectionlearn;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class HashSetLeaarning {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        System.out.println("linkedHashSet:" +linkedHashSet);
        System.out.println(set);
}
}
