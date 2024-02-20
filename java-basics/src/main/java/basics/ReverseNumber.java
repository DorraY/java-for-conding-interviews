package basics;

public class ReverseNumber {

    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number!=0) {
            int lastDigit =number%10;
            reversed = reversed *10+lastDigit;
            number = number/10;
        }



        return reversed;
    }
}
