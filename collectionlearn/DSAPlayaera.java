package collectionlearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DSAPlayaera {

    public static void main(String[] args) {
        int[] nums = {2,5,2,1,2};
        int k = 5;
        Arrays.sort(nums);
        int currSum = 0;
        List<List<Integer>> list = new ArrayList<>();
        printSub(nums, 0, new ArrayList<>(), list, k,currSum);
        Set<List<Integer>> set = new HashSet<>(list);
         List<List<Integer>> uniqueList = new ArrayList<>(set);
        System.out.println("All subsequences:"+list);
        System.out.println(set.size());
    }

    public static void printSub(int[] nums,int index,List<Integer> current,List<List<Integer>> result, int k,int currSum) {
        if(index == nums.length) {
            System.err.println(" index on each rec "+index);
          //  result.add(new ArrayList<>(current));
              System.out.println(current);
           
            return;
        }
            if(currSum > k) {
                return;
            }

            if(currSum == k) {
                 result.add(new ArrayList<>(current));
            }

        current.add(nums[index]);
        printSub(nums, index+1, current, result,k, currSum + nums[index]);
        current.remove(current.size()-1);
        System.err.println(" index on each rec "+index);
        printSub(nums, index+1, current, result,k, currSum);
    }
}
