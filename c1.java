import java.util.Arrays;

public class c1 {
    public static void main(String[] args) {
        int[] numbers = new int[5]; // Creates an array of 5 integers, all initialized to 0 by default
        Arrays.fill(numbers, 10); // Fills the array with 10
        System.out.print(Arrays.toString(numbers)); // Output: [10, 10, 10, 10, 10]
    }
}