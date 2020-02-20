package src.fpp.pretest.java.IsDigitSum;

public class IsDigitSum {
    public static void main(String[] args) {
        System.out.println(isDigitSum(32121,10));
        System.out.println(isDigitSum(32121,9));
        System.out.println(isDigitSum(13,6));
        System.out.println(isDigitSum(3,3));
        System.out.println(isDigitSum(-543,3));
    }

    static int isDigitSum(int n, int m) {
        if (n < 0) {
            return -1;
        }
        int sumOfDigit = getSumDigitOfNumber(n);
        if (sumOfDigit < m) {
            return 1;
        }
        return  0;
    }

    static int getSumDigitOfNumber(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }


}
