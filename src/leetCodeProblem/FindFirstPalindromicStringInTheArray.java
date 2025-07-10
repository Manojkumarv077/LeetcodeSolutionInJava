package leetCodeProblem;

public class FindFirstPalindromicStringInTheArray {
    public static void main(String[] args) {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println("The First Palindrome String In Array: " + firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            String reversed = new StringBuilder(word).reverse().toString();
            if (word.equals(reversed)) {
                return word;
            }
        }
        return "";
    }
}
