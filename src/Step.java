import java.util.*;

public class Step {

    static int isStepped(int [] a) {

        Map<Integer, Integer> frequency = new HashMap<>();

        for (int c: a) {
            if (frequency.containsKey(c)) {
                frequency.put(c, frequency.get(c) + 1);
            } else {
                frequency.put(c, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry: frequency.entrySet()) {
            if (entry.getValue() < 3) {
                return 0;
            }
        }

        for (int n = 0; n < a.length - 1; n++) {
            if (a[n] > a[n+1]) {
                return 0;
            }
        }
        return 1;
    }
}
