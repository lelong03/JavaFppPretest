package src.fpp.pretest.java.FillArray;

public class FillArray {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};
        int[] re = fill(arr , 3, 10);
        for (int n : re) {
            System.out.print(n);
        }
        System.out.println();

        int[] arr2 = new int[] {4, 2, -3, 12};
        int[] re2 = fill(arr2 , 1, 5);
        for (int n : re2) {
            System.out.print(n);
        }
    }

    static int[] fill(int[] arr, int k, int n){
        int[] result = new int[n];
        for (int i = 0; i < k; i++ ) {
            int j = i;
            while (j < n) {
                result[j] = arr[i];
                j = j + k;
            }
        }
        return result;
    }
}
