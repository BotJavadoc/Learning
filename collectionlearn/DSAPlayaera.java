package collectionlearn;
public class DSAPlayaera {
    public static void main(String[] args) {
         int arr[] = {28078, 19451, 935 ,28892 ,2242, 3570, 5480, 231};
         int n=arr.length;
         int secondLargest = -1;
         int largest= arr[0];
        for(int i=1;i<n;i++) {
            if(arr[i]>largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i]>secondLargest && arr[i]!=largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
        }
}
