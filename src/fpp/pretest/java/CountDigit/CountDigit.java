package src.fpp.pretest.java.CountDigit;

public class CountDigit {
    public static void main(String[] args) {
        System.out.println(countDigit(32121, 1));
        System.out.println(countDigit(33331, 3));
        System.out.println(countDigit(33331, 6));
        System.out.println(countDigit(3, 3));
        System.out.println(countDigit(-543, 3));
    }

    static int countDigit(int n, int digit) {
        if (n < 0) {
            return -1;
        }
        int count = 0;
        int lastDigit = 0;
        while (n > 0) {
            lastDigit = n % 10;
            if (lastDigit == digit) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
