package src.fpp.pretest.java.IsNormal;

public class IsNormal {
    public static void main(String[] args) {
        System.out.println(isNormal(3));
        System.out.println(isNormal(4));
        System.out.println(isNormal(5));
        System.out.println(isNormal(7));
        System.out.println(isNormal(8));

        System.out.println(isNormal(6));
        System.out.println(isNormal(9));
        System.out.println(isNormal(10));
        System.out.println(isNormal(100));
    }

    static int isNormal(int n) {
        if (n <= 3) {
            return 1;
        }
        int i = 3;
        while (i <= n/2) {
            if (n % i == 0) {
                return 0;
            }
            i = i + 2;
        }
        return 1;
    }
}
