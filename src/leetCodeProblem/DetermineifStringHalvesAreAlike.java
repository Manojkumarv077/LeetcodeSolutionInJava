package leetCodeProblem;

public class DetermineifStringHalvesAreAlike {

	public static void main(String[] args) {
		String s="book";
		System.out.println("The Halves Strings Output is : "+halvesAreAlike(s));
	}
		 public static boolean halvesAreAlike(String s) {
		        int count1 = 0;
		        int count2 = 0;
		        String str = "aeiouAEIOU";
		        int j = s.length() / 2;
		        for (int i = 0; i < s.length() / 2 && j < s.length(); i++, j++) {
		            if (str.indexOf(s.charAt(i)) != -1) {
		                count1++;
		            }
		            if (str.indexOf(s.charAt(j)) != -1) {
		                count2++;
		            }
		        }
		        return count1 == count2;
		    }
		}