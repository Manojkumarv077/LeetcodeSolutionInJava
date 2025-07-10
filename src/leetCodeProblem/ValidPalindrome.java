package leetCodeProblem;
public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
	 public static boolean isPalindrome(String s) {
	        s=s.replaceAll(" ","").trim().toLowerCase().replaceAll("[^a-z0-9]","");
	       int i=0;
	       int j=s.length()-1;
	       while(i<j) {
	       if(s.charAt(i)!=s.charAt(j)) {
	    	   return false;
	       }
	       i++;
	       j--;
	    }
	     return true;
	 }
}
