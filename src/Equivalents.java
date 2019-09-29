import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Equivalents {
    static int equivalentArrays(int[ ] a1, int[ ] a2) {

        int [] max = a1.length > a2.length ? a1 : a2;
        int [] min = a1.length < a2.length ? a2 : a1;


        List<Integer> list = new ArrayList<>(max.length);

        for (int i : a1) {
            list.add(i);
        }

        List<Integer> list1 = new ArrayList<>(min.length);

        for (int i : a2) {
            list1.add(i);
        }

        Set<Integer> maxSet = new HashSet<>(list);

        Set<Integer> minSet = new HashSet<>(list1);

        maxSet.removeAll(minSet);

        if (maxSet.isEmpty()) {
            return 1;
        }

        return 0;

    }
}
