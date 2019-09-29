public class Calc {
    static int oddEven(int [] list) {
        if (list == null) return 0;

        int sumOdd = 0;
        int sumEven = 0;
        for (int i : list) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        return sumOdd - sumEven;
    }
}
