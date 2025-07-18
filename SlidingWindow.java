public class SlidingWindow {
    
    public static void main (String[] args) {
        int [] arr = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        int k =4;
     int maxSum = 0, windowSum = 0;
for (int i = 0; i < k; i++) {
    windowSum += arr[i];
}
maxSum = windowSum;

for (int i = k; i < arr.length; i++) {
    windowSum += arr[i] - arr[i - k];
    maxSum = Math.max(maxSum, windowSum);
}
System.out.println(maxSum);
    }
}
