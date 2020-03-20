package src.fpp.pretest.java.BunkerPrimeArray;

public class BunkerArray {
    public static void main(String[] args) {
        System.out.println(isBunker(new int[] {7, 6, 10, 1}));
        System.out.println(isBunker(new int[] {6, 10, 1}));
        System.out.println(isBunker(new int[] {7, 6, 10}));
    }

    static int isBunker(int[] a) {
        boolean hasPrime=false, hasOne=false;
        for (int number:a) {
            if (!hasOne && number == 1) {
                hasOne = true;
            }
            if (!hasPrime && isPrime(number)==1) {
                hasPrime = true;
            }
        }
        if (hasOne && hasPrime) {
            return 1;
        }
        return 0;
    }

    static int isPrime(int n) {
        if (n == 1) {
            return 0;
        }
        for (int i=2; i<=n/2; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
