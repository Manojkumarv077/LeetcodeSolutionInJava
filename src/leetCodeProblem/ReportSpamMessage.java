package leetCodeProblem;
import java.util.HashSet;
import java.util.Arrays;
public class ReportSpamMessage {

	public static void main(String[] args) {
		String []message= {"hello","world","leetcode"};
		String []bannedWords= {"world","hello"};
		System.out.println("The Message Spam is : "+spamMessage(message,bannedWords));
		}
	public static boolean spamMessage(String []message,String []bannedWords) {
		 HashSet<String> bannedSet = new HashSet<>(Arrays.asList(bannedWords));
	        int spam = 0;

	        for (String word : message) {
	            if (bannedSet.contains(word)) {
	                spam++;
	                if (spam >= 2) return true; // early exit
	            }
	        }
	        return false;
	    }
	}