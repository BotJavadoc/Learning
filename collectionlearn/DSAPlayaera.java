package collectionlearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DSAPlayaera {

    public static void main(String[] args) {
        int[] nums = {1,2,2};
        int k = 8;
        Arrays.sort(nums);
        int currSum = 0;
        List<List<Integer>> list = new ArrayList<>();
        ArrayList<Integer> sum = new ArrayList<>();
        printSub(nums, 0, new ArrayList<>(), list);
        System.out.println("All subsequences:"+list);
        System.err.println("List of sum "+sum);
    }

  public static void printSub(int[] nums, int index,
                                  List<Integer> current,
                                  List<List<Integer>> result) {
       
                                    
    result.add(new ArrayList<>(current));                              
    for (int i = index; i < nums.length; i++) {

        if (i > index && nums[i] == nums[i - 1]) continue;

        current.add(nums[i]);
        printSub(nums, i + 1, current, result);
        current.remove(current.size() - 1);
    }
}

}
