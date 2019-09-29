public class Centre {
    public static int centeredArray(int [] list) {

        if (list == null || list.length % 2 == 0) {
            return 0;
        }
        int midIndex = list.length / 2;
        int middleElement = list[midIndex];
        for (int i = 0; i < list.length; i++) {
            if (i != midIndex && middleElement >= list[i]) {
                return 0;
            }
        }

        return 1;
    }

}
