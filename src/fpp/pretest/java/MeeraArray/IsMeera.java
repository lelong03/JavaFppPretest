package src.fpp.pretest.java.MeeraArray;

import java.util.HashSet;
import java.util.Set;

public class IsMeera {
    public static void main(String[] args) {
        System.out.println(isMeera(new int[] {3, 5, -2} ));
        System.out.println(isMeera(new int[] {8, 3, 4}  ));
        System.out.println(isMeera(new int[] {2, 3, 4}  ));
    }

    static int isMeera(int[] a) {
        Set<Integer> track = new HashSet<Integer>();
        for (int number : a) {
            if (number % 2 == 0) {
                if (track.contains(number/2)) {
                    return 0;
                }
            }
            if (track.contains(number*2)) {
                return 0;
            }
            track.add(number);
        }
        return 1;
    }
}
