package collectionlearn;

public class DSAPlayaera {
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        int min =nums[0];
        int pos=0;
        int maxProf =0;

        for(int i=0;i<nums.length;i++) {
            if(min>nums[i]) {
                min=nums[i];
                pos = i+1;
            }
        }
        for(int i=pos;i<nums.length;i++) {
            if(maxProf<nums[i]) {
                maxProf = nums[i];
            }
        }
        System.out.println("Max profit is "+maxProf);

        System.out.println("Min number is "+min+" and its position is "+pos);
}
}