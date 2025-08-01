package collectionlearn;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListLearn {
    public static void main(String[] args) {
        LinkedList <String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Elderberry");
        System.out.println(linkedList);
        linkedList.addFirst("Orange");
        System.out.println("After adding the first orange to linked list :"+linkedList);
        linkedList.addLast("JackFruit");
         System.out.println("After adding the LAST jackfruit to linked list :"+linkedList);
       Boolean g =   linkedList.contains("Banana");
        System.out.println("Contains Banana? :"+g);
        Iterator <String> iterator = linkedList.iterator();
       for (linkedList.iterator(); iterator.hasNext();) {
           Object elem = iterator.next();
           System.err.println(" "+elem);
       }
       System.out.println( linkedList.poll()+linkedList);
    }
}
