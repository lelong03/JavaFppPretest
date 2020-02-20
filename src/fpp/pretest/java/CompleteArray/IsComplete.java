package src.fpp.pretest.java.CompleteArray;

import java.util.HashSet;
import java.util.Set;

public class IsComplete {
    public static void main(String[] args) {
        System.out.println(isComplete(new int[] {-5, 6, 2, 3, 2, 4, 5, 11, 8, 7}));
        System.out.println(isComplete(new int[] {5, 7, 9, 13}));
        System.out.println(isComplete(new int[] {2, 2}));
        System.out.println(isComplete(new int[] {2, 6, 3, 4}));
    }

    static int isComplete(int[] a) {
        boolean containEven = false;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        Set<Integer> visited = new HashSet<>();

        for (int number : a) {
            visited.add(number);
            if (!isEvenNumber(number)) {
                continue;
            }
            if (!containEven) {
                containEven = true;
            }
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        // condition: contain even numbers
        if (!containEven) {
            return 0;
        }

        // condition: min even number < max even number
        if (min == max) {
            return 0;
        }

        // condition: all numbers between min and max are in the array
        for (int i=min+1; i<max; i++) {
            if (!visited.contains(i)) {
                return 0;
            }
        }
        return 1;
    }

    static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
