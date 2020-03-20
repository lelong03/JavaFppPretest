package src.fpp.pretest.java.MeeraNumber;

import java.util.ArrayList;
import java.util.List;

public class MeeraNumber {
    public static void main(String[] args) {
        System.out.println(isMeera(6));
        System.out.println(isMeera(30));
        System.out.println(isMeera(21));
        System.out.println(isMeera(12));
    }

    static int isMeera(int n) {
        List<Integer> nontrivialFactors = new ArrayList<>();
        for (int i = 2; i<=n/2; i++) {
            if (n % i == 0) {
                nontrivialFactors.add(i);
            }
        }

        if (n % nontrivialFactors.size() == 0) {
            return 1;
        }
        return 0;
    }

}
