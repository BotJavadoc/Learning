package collectionlearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DSAPlayaera {

    public static void main(String[] args) {
        int[] nums = {2,3,6,7};
        Arrays.sort(nums);
        int k = 7;
        
        List<List<Integer>> list = new ArrayList<>();
        printSub(nums, 0, new ArrayList<>(), list, k);

        System.out.println("All subsequences:"+list);
        System.out.println(list.size());
    }

    public static void printSub(int[] nums,int index,List<Integer> current,List<List<Integer>> result, int k) {
        if(index == nums.length) {
            System.err.println(" index on each rec "+index);
            if(k == 0) {
            result.add(new ArrayList<>(current));
            }
            System.out.println(current);
            return;
        }
        if(nums[index]<=k){
        current.add(nums[index]);
        printSub(nums, index, current, result,k-nums[index] );
        current.remove(current.size()-1);
        }
        System.err.println(" index on each rec "+index);
        printSub(nums, index+1, current, result,k);
    }

}
