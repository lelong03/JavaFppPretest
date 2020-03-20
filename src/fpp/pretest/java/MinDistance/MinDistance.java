package src.fpp.pretest.java.MinDistance;

import java.util.ArrayList;
import java.util.List;

public class MinDistance {
    public static void main(String[] args) {
        System.out.println(minDistance(13013));
    }

    static int minDistance(int n) {
        List<Integer> factors = new ArrayList<Integer>();
        for (int i=1; i<=n/2; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        factors.add(n);
        System.out.println(factors);
        int min = n;
        for (int i=0; i<factors.size()-1; i++) {
            int distance = factors.get(i+1) - factors.get(i);
            if ( distance < min) {
                min = distance;
            }
        }

        return min;
    }
}
