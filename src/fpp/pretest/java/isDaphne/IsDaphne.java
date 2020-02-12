package src.fpp.pretest.java.isDaphne;

public class IsDaphne {
    public static void main(String[] args) {
        int[] a = {2, 4, 2};
        System.out.println(isDaphne(a));

        int[] b = {1, 3, 17, -5} ;
        System.out.println(isDaphne(b));

        int[] c = {3, 2, 5};
        System.out.println(isDaphne(c));

    }

    static int isDaphne(int[] a){
        boolean isOdd = false, isEven = false;
        for (int i=0; i<a.length; i++){
            if (a[i] % 2 == 0) {
                isEven = true;
            } else {
                isOdd = true;
            }
            if (isEven && isOdd) {
                return 0;
            }
        }
        return 1;
    }
}
