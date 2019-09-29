import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Freq {

    static int isSelfReferential(int[ ] a) {
        List<Integer> list = new ArrayList<>(a.length);
        for (int i : a) {
            list.add(i);
        }

        for ( int z = 0; z < list.size(); z++) {
            if(list.get(z) != Collections.frequency(list, z)) {
                return 0;
            }
        }

        return 1;
    }
}
