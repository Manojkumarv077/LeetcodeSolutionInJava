package leetCodeProblem;
import java.util.HashMap;
public class WordPattern {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wordPattern("abba","Dog Cat Cat Fish"));
	}
	 public static boolean wordPattern(String pattern, String s) {
	        // Split the input string into words
	        String[] words = s.split(" ");

	        // If number of words != number of pattern characters, return false
	        if (words.length != pattern.length()) {
	            return false;
	        }

	        // Create a single HashMap to store both character -> word and word -> character mappings
	        HashMap<Character, String> map = new HashMap<>();

	        for (int i = 0; i < pattern.length(); i++) {
	            char patternChar = pattern.charAt(i);
	            String word = words[i];

	            // If patternChar already mapped
	            if (map.containsKey(patternChar)) {
	                if (!map.get(patternChar).equals(word)) {
	                    return false; // Mismatch mapping
	                }
	            } 
	            // Else if word already mapped to some other character
	            else if (map.containsKey(word)) {
	                if (!map.get(word).equals(patternChar)) {
	                    return false; // Reverse mapping mismatch
	                }
	            }

	            // Create mappings
	            map.put(patternChar, word);
	            //map.put(word, patternChar);
	        }

	        // If all mappings matched correctly
	        return true;
	    }
}
