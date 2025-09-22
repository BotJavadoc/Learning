package collectionlearn;



public class DSAPlayaera {
    public static void main(String[] args) {
        int nums[] = {2,6,5,8,11};
        int n = nums.length;
        int k = 14;
        int left =0;
        int right =0;
        int sum=0;

        while(n > left) {
            if(left>right) {
                left+=1;
                right = n-1;
            }
            sum = nums[left]+nums[right];
            System.out.println("Sum for each stage "+sum);
            if(sum == k) {
                System.out.println(left+" "+right);
            }
            right-=1;
        }
       
}
}