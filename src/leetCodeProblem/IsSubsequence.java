package leetCodeProblem;

public class IsSubsequence {

	public static void main(String[] args) {
		String s="abc";
		String t="ahbgdc";
		System.out.println(isSubsequence(s,t));
}
	 public static boolean isSubsequence(String s, String t) {
	        int i=0,j=0;
	        int count=0;
	        while(i<s.length() && j<t.length()){
	            if(s.charAt(i)==t.charAt(j)){
	                count++;
	                i++;
	                j++;
	            }
	            else {
	                j++;
	            }
	        }
	        return count==s.length();
	    }
	}