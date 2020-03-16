package src.fpp.pretest.java.HollowArray;

public class HollowArray {
    public static void main(String[] args) {
        System.out.println(isHollow(new int[]{1, 2, 4, 0, 0, 0, 3, 4, 5}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1, 1, 1, 1, 0, 0, 0, 0, 0, 2, 1, 2, 18}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 5}));
        System.out.println(isHollow(new int[]{3, 8, 3, 0, 0, 0, 3, 3}));
        System.out.println(isHollow(new int[]{1, 2, 0, 0, 0, 3, 4, 0}));
        System.out.println(isHollow(new int[]{0, 1, 2, 0, 0, 0, 3, 4}));
        System.out.println(isHollow(new int[]{0, 0, 0}));
    }



    static int isHollow(int[] a) {
        int left = 0, right = a.length-1;
        int preceded = 0, followed = 0, zeros = 0;

        while(left <= right) {
            if (a[left] == 0 ^ a[right] == 0) {
                return 0;
            }

            if (left == right && a[left] == 0){
                zeros++;
            }
            else {
                if (a[left] == 0) {
                    zeros++;
                } else {
                    preceded++;
                }
                if (a[right] == 0) {
                    zeros++;
                } else {
                    followed++;
                }
            }
            left++;
            right--;
        }
//        System.out.println(left);
//        System.out.println(right);
//        System.out.println(preceded);
//        System.out.println(followed);
//        System.out.println(zeros);

        if (zeros >=3 && preceded == followed && followed == zeros) {
            return 1;
        }
        return 0;
    }
}
