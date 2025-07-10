package leetCodeProblem;
import java.util.*;

public class AddToArrayFormOfInteger {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0};  // Example input
        int k = 1234;                // Number to add

        // Call the function to add K to the array form and print the result
        List<Integer> result = toAddInteger(arr, k);
        
        // Print the result in a user-friendly way
        System.out.print("Result: ");
        
         System.out.print(result);
    }

    // Function to add integer k to the array form of the number represented by 'num'
    public static List<Integer> toAddInteger(int[] num, int k) {
        List<Integer> list = new LinkedList<>();
        
        // Process each digit in the array from right to left
        for (int i = num.length - 1; i >= 0; --i) {
            list.add(0, (num[i] + k) % 10);  // Add the digit and the carry
            k = (num[i] + k) / 10;           // Update the carry
        }

        // If there's any remaining carry, add it to the result list
        while (k > 0) {
            list.add(0, k % 10);  // Add the carry digit
            k /= 10;              // Update the carry
        }

        return list;  // Return the resulting list
    }
}
