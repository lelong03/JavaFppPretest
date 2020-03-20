package src.fpp.pretest.java.WaveArray;

public class IsWaveArray {
    public static void main(String[] args) {
        System.out.println(isWave(new int[] {7, 2, 9, 10, 5}));
        System.out.println(isWave(new int[] {4, 11, 12, 1, 6}));
        System.out.println(isWave(new int[] {1, 0, 5}));
        System.out.println(isWave(new int[] {2}));
        System.out.println(isWave(new int[] {2, 6, 3, 4} ));
    }

    static int isWave(int[] a) {
        for (int i=0; i<a.length-1; i++) {
            if (!(isEven(a[i]) ^ isEven(a[i+1]))) {
                return 0;
            }
        }
        return 1;
    }

    static boolean isEven(int number) {
        return (number % 2) == 0;
    }
}
