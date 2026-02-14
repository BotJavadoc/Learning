package collectionlearn;
import java.util.*;

public class Substring {

    public static void main(String[] args) {
        String s = "aab";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        List<String> result = new ArrayList<>();
        printSub(arr, 0, new StringBuilder(), result);

        System.out.println("All subsequences: " + result);
    }

    public static void printSub(char[] arr, int index,
                                StringBuilder current,
                                List<String> result) {

        if (index == arr.length) {
            result.add(current.toString());
            return;
        }

        current.append(arr[index]);
        printSub(arr, index + 1, current, result);
        current.deleteCharAt(current.length() - 1);
        printSub(arr, index + 1, current, result);
    }
}
