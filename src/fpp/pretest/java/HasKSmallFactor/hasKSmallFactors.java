package src.fpp.pretest.java.HasKSmallFactor;

public class hasKSmallFactors {

    public static void main(String[] args) {
        System.out.println(hasKSmallFactors(7, 30));
        System.out.println(hasKSmallFactors(6, 14));
        System.out.println(hasKSmallFactors(6, 30));
    }

    static boolean hasKSmallFactors(int k, int number) {
        if (k < 0 || number < 0) {
            return false;
        }
        for (int factor=2; factor<k; factor++){
            if (number % factor == 0) {
                int nextFactor = number / factor;
                if (nextFactor < k && number % nextFactor == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
