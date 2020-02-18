package src.fpp.pretest.java.IsOddValent;

import java.util.HashSet;
import java.util.Set;

public class IsOddValent {
    public static void main(String[] args) {
        int[] testCase1 = {9, 3, 4, 9, 1};
        System.out.println(isOddValent(testCase1));

        int[] testCase2 = {3, 3, 3, 3};
        System.out.println(isOddValent(testCase2));

        int[] testCase3 = {8, 8, 8, 4, 4, 7, 2};
        System.out.println(isOddValent(testCase3));

        int[] testCase4 = {1, 2, 3, 4, 5};
        System.out.println(isOddValent(testCase4));

        int[] testCase5 = {2, 2, 2, 4, 4};
        System.out.println(isOddValent(testCase5));
    }

    static int isOddValent(int[] a) {
        boolean isDuplicated = false;
        boolean isContainOddNumber = false;
        Set<Integer> existed = new HashSet<Integer>();
        for (int number : a) {
            if (number % 2 == 1) {
                isContainOddNumber = true;
            }
            if (existed.contains(number)) {
                isDuplicated = true;
            } else {
                existed.add(number);
            }
            if (isContainOddNumber && isDuplicated) {
                return 1;
            }
        }
        return 0;
    }
}
