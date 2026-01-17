package collectionlearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DSAPlayaera {

    public static void main(String[] args) {
        int[] nums = {3,5,6,7};
        Arrays.sort(nums);
        int k = 9;
        List<List<Integer>> list = new ArrayList<>();
        printSub(nums, 0, new ArrayList<>(), list, k);

        System.out.println("All subsequences:");
        System.out.println(list.size());
    }

    public static void printSub(int[] nums,int index,List<Integer> current,List<List<Integer>> result, int k) {
        if(index == nums.length) {
            if(helper(k,current)){
            System.err.println(" index on each rec "+index);
            result.add(new ArrayList<>(current));
            System.out.println(current);
            }
          //  System.out.println(result);
            return;
        }
        current.add(nums[index]);
        printSub(nums, index+1, current, result,k);
        current.remove(current.size()-1);
        System.err.println(" index on each rec "+index);
        printSub(nums, index+1, current, result,k);
    }

   public static Boolean helper(int k, List<Integer> list) {
    if (list.isEmpty()) return false;
    int sum = 0;

    if(list.size()==1) {
        sum = list.get(0) +list.get(0);
        System.err.println("single val "+sum);
        if(sum<=k) {
            return true;
        }
    }
    
    sum = list.get(0) + list.get(list.size()-1);
 System.err.println("outside unique val "+sum);
    return sum <= k;
}

}
