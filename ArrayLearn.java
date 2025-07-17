
import java.util.Arrays;
import java.util.List;

public class ArrayLearn {

    public static void main(String[] args) {
        int sortArry [] = {100,24,4,45,0,7};
        
        //for sorting
        Arrays.sort(sortArry);
        for(int i=0;i<sortArry.length;i++) {
            System.out.print(" "+sortArry[i]);
        }
        System.out.println("");
        String[] fruits = {"apple", "banana"};
        List<String> list = Arrays.asList(fruits);
        System.out.println(list);
        int binaryArr [] = {100,24,4,45,0,7};
        Arrays.sort(binaryArr);
        int index = Arrays.binarySearch(binaryArr, 100);
        System.out.println(index);
       int copyArr[] = Arrays.copyOf(binaryArr, index);
        for(int i : copyArr) {
         System.out.print(" "+i);
        }
        System.out.println("");
        String res = Arrays.toString(binaryArr);
        System.out.println(res);
        
        }
      

}
