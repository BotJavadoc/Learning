package collectionlearn;

import java.util.ArrayList;
import java.util.List;

public class DSAPlayaera {

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };

        List<List<Integer>> list = new ArrayList<>();
        printSub(nums, 0, new ArrayList<>(), list);

        System.out.println("All subsequences:");
        System.out.println(list);
    }

    public static void printSub(int[] nums,int index,List<Integer> current,List<List<Integer>> result) {
        if(index == nums.length) {
            System.err.println(" index on each rec "+index);
            result.add(new ArrayList<>(current));
            System.out.println(result);
            return;
        }
        current.add(nums[index]);
        printSub(nums, index+1, current, result);
        current.remove(current.size()-1);
        System.err.println(" index on each rec "+index);
        printSub(nums, index+1, current, result);
    }
}
