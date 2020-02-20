package src.fpp.pretest.java.IsFineArray;

import java.util.ArrayList;
import java.util.List;

public class IsFineArray {
    public static void main(String[] args) {
        System.out.println(isFineArray(new int[] {4, 7, 9, 6, 5} ));
        System.out.println(isFineArray(new int[] {4, 9, 6, 33}  ));
        System.out.println(isFineArray(new int[] {3, 8, 15}  ));
    }

    static int isFineArray(int[] a) {
        List<Integer> primeList = new ArrayList<>();
        for (int number : a) {
            if (isPrime(number) == 1){
                primeList.add(number);
            }
        }
        if (primeList.isEmpty()) {
            return 1;
        }
        if (primeList.size() % 2 == 1) {
            return 0;
        }
        int count = 0;
        for (int i=0; i<primeList.size()-1; i++) {
            if (primeList.get(i) < 0) {
                continue;
            }
            for (int j=i+1; j<primeList.size(); j++) {
                if (primeList.get(j) < 0)
                    continue;;
                if (Math.abs(primeList.get(i) - primeList.get(j)) == 2) {
                    count++;
                    primeList.set(i, -1);
                    primeList.set(j, -1);
                }
            }
        }
        if (count == primeList.size()/2) {
            return 1;
        }
        return 0;
    }

    static int isPrime(int n) {
        for (int i=2; i<=n/2; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
