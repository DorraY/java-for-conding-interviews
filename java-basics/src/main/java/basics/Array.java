package basics;

public class Array {

    public static int find(int[] numbers) {
        if (numbers==null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element");
        }
        int max = numbers[0];
        for (int i=1;i<=numbers.length-1;i++) {
            if (numbers[i]>max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static void reverse(int[] numbers ) {
        if (numbers==null) {
            throw new IllegalArgumentException("Array must contain at least one element");
        }
        int start =0;
        int end = numbers.length-1;
        while (start<end) {
            int tmp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = tmp;
            start++;
            end--;
        }
    }
}
