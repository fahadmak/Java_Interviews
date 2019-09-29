public class CharArray {

    public static char [] getChar(char [] list, int startPosition, int len) {
        final int slice = len + startPosition;
        if (list.length < len || startPosition >= list.length || startPosition < 0) return null;

        char [] charList = new char[slice];
        for (int s = startPosition; s < list.length; s++) {
            if (s == slice) {
                return charList;
            }

            charList[s] = list[s];
        }

        return null;
    }
}
