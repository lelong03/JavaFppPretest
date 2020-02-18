package src.fpp.pretest.java.AllPossibilities;

public class AllPossibilities {
    public static void main(String[] args) {
        System.out.println(isAllPossibilities(new int[] {1,2,0,3}));
        System.out.println(isAllPossibilities(new int[] {3,2,1,0}));
        System.out.println(isAllPossibilities(new int[] {1,2,4,3}));
        System.out.println(isAllPossibilities(new int[] {0,2,3}));
        System.out.println(isAllPossibilities(new int[] {0}));
        System.out.println(isAllPossibilities(new int[] {}));
    }

    static int isAllPossibilities(int[] a) {
        if (a.length == 0) {
            return 0;
        }

        if (a.length == 1) {
            if (a[0] != 0)
                return 0;
            return 1;
        }

        boolean[] checked = new boolean[a.length];
        for (int number : a){
            if (number > a.length-1 || number < 0) {
                return 0;
            }
            checked[number] = true;
        }

        for (boolean c : checked){
            if (!c) {
                return 0;
            }
        }
        return 1;
    }
}
