package collectionlearn;

import java.util.*;

public class ArrayListLearn {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        li.add(1);
        li.add(20);
        li.add(202);
        li.add(201);
        li.add(2);
         li2.add(1);
        li2.add(20);
        li2.add(202);
        li2.add(201);
        li2.add(2);
        for(int item : li) {
            System.out.println(" : " + item);
           
            if((item%2)==0) {
                System.out.print("Even number");
            } else System.out.print("Odd number");
        }
        li.remove(1);
        System.out.println("After delete the array elemnt"+li);

        li2.addAll(5,li);
        System.out.println("After adding li elements to li2"+li2);
        
        li2.set(1,3);
        System.out.println("After set the element"+li2);

        System.out.println(li2.indexOf(2));
        System.out.println(li2.contains(2));       
        
        List<Integer> dub = new ArrayList<>();
        dub.add(4);       
        dub.add(2);
        dub.add(5);
        dub.add(2);
        dub.add(3);
        dub.add(1);
        dub.add(4);
        dub.add(3);
        System.out.println("Before prefroming the action"+dub);
        Collections.sort(dub);
        System.err.println("After Sorting  :"+dub);
        Set s = new HashSet();
        for(int items : dub) {
        s.add(items);
        }
        dub.clear();
        dub.addAll(s);
        System.out.println("Final result "+dub);

        li2 = dub.subList(1, 4);
        System.out.println("Sublist extraction "+li2);
    }
    
}
