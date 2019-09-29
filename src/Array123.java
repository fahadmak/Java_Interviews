

public class Array123 {

    static int is123Array(int [] a) {


        if (a.length%3 != 0) {
            return 0;
        }

        for (int t =0; t < a.length; t = t + 3) {
            if (a[t] != 1 || a[t+1] != 2 || a[t+2] != 3) {
                return 0;
            }
        }
        return 1;
    }
}
