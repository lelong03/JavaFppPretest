package src.fpp.pretest.java.BeanArray;

public class IsBeanArray {
    public static void main(String[] args) {
        System.out.println(isBean(new int[] {1, 2, 3, 9, 6, 13} ));
        System.out.println(isBean(new int[] {3, 4, 6, 7, 13, 15} ));
        System.out.println(isBean(new int[] {3, 6, 9, 5, 7, 13, 6, 17} ));
        System.out.println(isBean(new int[] { 9, 6, 18} ));
        System.out.println(isBean(new int[] {4, 7, 16} ));
    }

    static int isBean(int[] a) {
        boolean has9 = false, has13 = false, has7 = false, has16 = false;
        for (int number: a) {
            if (!has9 && number == 9) {
                has9 = true;
            }
            if (!has13 && number == 13) {
                has13 = true;
            }
            if (!has7 && number == 7) {
                has7 = true;
            }
            if (!has16 && number == 16) {
                has16 = true;
            }
        }
        if (has9 && has13) {
            return 1;
        }
        if (has7 && !has16) {
            return 1;
        }
        return 0;
    }
}
