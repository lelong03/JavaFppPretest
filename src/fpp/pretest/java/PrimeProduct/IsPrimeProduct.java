package src.fpp.pretest.java.PrimeProduct;


public class IsPrimeProduct {
    public static void main(String[] args) {
        System.out.println(isPrimeProduct(22));
        System.out.println(isPrimeProduct(33));
        System.out.println(isPrimeProduct(55));
        System.out.println(isPrimeProduct(1));
        System.out.println(isPrimeProduct(-3));
        System.out.println(isPrimeProduct(44));
    }

    static int isPrimeProduct(int number) {
        if (number <= 1) {
            return 0;
        }
        for (int factor=2; factor<=number/2; factor++){
            if ((number % factor == 0) && isPrime(factor) && isPrime(number/factor)) {
                return 1;
            }
        }
        return 0;
    }

    static boolean isPrime(int number) {
        for (int i =2; i<=number/2; i++){
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
