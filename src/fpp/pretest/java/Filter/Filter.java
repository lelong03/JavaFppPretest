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
         boolean found9=false, found7=false, found13=false;

         for (int i = 0; i < a.length; i++) {
             if (a[i] == 9) {
                 found9 = true;
             }
             if (a[i] == 11 && found9) {
                 return 1;
             }
             if (a[i] == 7 && found7==false) {
                 found7 = true;
             }
             if (a[i] == 13 && found13==false) {
                 found13 = true;
             }
         }
         if (found7 ^ found13) {
             return 1;
         }
         return 0;

    }
}
