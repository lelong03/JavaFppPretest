package src.fpp.pretest.java.countOnes;

public class CountOnes {
    public static void main(String[] args) {
        System.out.println(countOnes(9));
        System.out.println(countOnes(5));
        System.out.println(countOnes(15));
    }

    static int countOnes(int n) {
        int count = 0;
        int m;
        while (n > 0) {
            m = n % 2;
            if (m == 1){
                count ++;
            }
            n = n / 2;
        }
        return count;
    }
}
