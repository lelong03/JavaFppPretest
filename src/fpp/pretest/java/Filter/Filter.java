package src.fpp.pretest.java.Filter;

public class Filter {
    public static void main(String[] args) {
        System.out.println(isFilter(new int[] {1, 2, 3, 9, 6, 11} ));
        System.out.println(isFilter(new int[] {3, 4, 6, 7, 14, 16}));
        System.out.println(isFilter(new int[] {1, 2, 3, 4, 10, 11, 13} ));
        System.out.println(isFilter(new int[] {3, 6, 5, 5, 13, 6, 13} ));
        System.out.println(isFilter(new int[] {9, 6, 18} ));
        System.out.println(isFilter(new int[] {4, 7, 13} ));

    }

    static int isFilter(int[] a){
        boolean flag9, flag11, flag7, flag13;
        flag7 = flag9 = flag11 = flag13 = false;

        for (int number : a) {
            flag7 = (number == 7) ? true : false;
            flag9 = (number == 9) ? true : false;
            flag11 = (number == 11) ? true : false;
            flag13 = (number == 13) ? true : false;
            if (flag9 && flag11){
                return 1;
            }
            if (flag7 && flag13){
                return 0;
            }
        }
        if (flag7 || flag13) {
            return 1;
        }
        return 0;
    }
}
