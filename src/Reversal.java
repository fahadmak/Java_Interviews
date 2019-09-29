public class Reversal {

    static int reverseNumber (int number) {
        int num = number;
        int reverse = 0;
        while( num != 0 ) {
            int remainder = num % 10;
            reverse = (reverse * 10) + remainder;
            num /= 10;
        }

        return reverse;
    }
}
