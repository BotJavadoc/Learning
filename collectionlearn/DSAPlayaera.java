package collectionlearn;
import java.util.*;
public class DSAPlayaera {
    public static void main(String[] args) {
        int nums[] = {61 ,61 ,17};
        int maxi = nums[nums.length-1];
        ArrayList<Integer> res = new ArrayList<>();
        res.add(maxi);
        for(int i=nums.length-2;i>=0;i--) {
           if(maxi<=nums[i]) {
            maxi = nums[i];
            res.add(nums[i]);
           }
        }
        Collections.reverse(res);
        System.out.println(res);
    }
}