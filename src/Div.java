import java.util.HashMap;
import java.util.Map;

public class Div {
    static int is235Array(int[] a) {
        Map<Integer, Integer> divisors = new HashMap<>();

        int count = 1;
        int div2 = 1;
        int div3 = 1;
        int div5 = 1;

        for (int i : a) {
            if (i % 2 == 0) {
                divisors.put(2, div2);
                div2++;
            }

            if (i % 3 == 0) {
                divisors.put(3, div3);
                div3++;
            }

            if (i % 5 == 0) {
                divisors.put(5, div5);
                div5++;
            }

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                divisors.put(0, count);
                count++;
            }

        }

        int total = 0;
        for (Map.Entry<Integer, Integer> entry : divisors.entrySet()) {
            total += entry.getValue();
        }

        if (total == a.length) {
            return 1;
        }

        return 0;
    }
}
