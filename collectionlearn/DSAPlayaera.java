package collectionlearn;

public class DSAPlayaera {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 1, 2};
        DSAPlayaera dsaPlayaera = new DSAPlayaera();

        boolean ans = dsaPlayaera.checkSort(arr);
        System.err.println(ans);

        boolean checkkrot = dsaPlayaera.checkRot(arr);
        System.out.println(checkkrot);
    }

    public boolean checkRot(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (checkSort(arr)) { 
                return true;
            }
            rotate(arr); 
        }
        return false;
    }

    public boolean checkSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public int[] rotate(int arr[]) {
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        return arr;
    }
}
