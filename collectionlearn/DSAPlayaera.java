package collectionlearn;
import java.util.*;

public class DSAPlayaera {
    public static void main(String[] args) {
        int nums[] = {9,1,4,7,3,-1,0,5,8,-1,6};
        Arrays.sort(nums);
        
        int count = 0;
        int max =0;
        for(int i=1;i<nums.length;i++) {
            System.out.println("Incoming array nums[i] = "+nums[i]+" nums[i-1] "+nums[i-1] + " and diff is " + (nums[i]-nums[i-1]));
            if(nums[i]-nums[i-1]==1) {
                count++;
            } else {
                if(max<count) {
                    max = count;
                }
                count = 0; 
            }
        }
        System.err.println(count+1);
    }
}