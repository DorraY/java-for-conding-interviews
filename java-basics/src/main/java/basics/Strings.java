package basics;

public class Strings {

    public static boolean isPalindrome(String str) {
        int startIndex = 0;
        int endIndex = str.length() -1;
        str = str.toLowerCase();
        while (startIndex<endIndex) {
            if (str.charAt(startIndex)!=str.charAt(endIndex)) {
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }
}
