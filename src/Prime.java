import java.util.ArrayList;
import java.util.List;

public class Prime {

    static int isPrimeHappy(int n) {

        List<Integer> primeNumbers = new ArrayList<>();

        int count;

        if (n == 2) {
            return 0;
        }

        for (int j = 2; j <n; j++) {
            count = 0;

            for (int i = 1; i <= j; i++) {
                if (j%i == 0) {
                    count++;
                }
            }

            if (count == 2) {
                primeNumbers.add(j);
            }
        }

        int total = 0;
        for (int val: primeNumbers) {
            total += val;
        }

        if (total%n == 0) {
            return 1;
        }

        return 0;
    }
}
