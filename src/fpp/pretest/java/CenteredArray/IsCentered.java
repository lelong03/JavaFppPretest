package src.fpp.pretest.java.CenteredArray;

public class IsCentered {
    public static void main(String[] args) {
        System.out.println(isCentered(new int[] {5, 3, 3, 4, 5}));
        System.out.println(isCentered(new int[] {3, 2, 1, 4, 5}));
        System.out.println(isCentered(new int[] {3, 2, 1, 4, 1}));
        System.out.println(isCentered(new int[] {3, 2, 1, 1, 4, 6}));
        System.out.println(isCentered(new int[] {1}));
        System.out.println(isCentered(new int[] {}));
    }

    static int isCentered(int[] a) {
        int len = a.length;
        if (len == 0 || len % 2 == 0){
            return 0;
        }
        int middleIndex = (len / 2);
        for (int i=0; i< middleIndex; i++) {
            if ((a[i] <= a[middleIndex]) || (a[len-1-i] <= a[middleIndex])) {
                return 0;
            }
        }
        return 1;
    }
}
