package leetCodeProblem;
import java.util.HashSet;
public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		String s="pwwkew";
		System.out.println("The Length Of SubString is : "+lengthOfLongestSubstring(s));
	}
		public static int lengthOfLongestSubstring(String s) {
	        int start=0;
	        int end=0;
	        HashSet<Character>list=new HashSet<>();
	        int max_len=0;
	        while(end<s.length()){
	            if(!list.contains(s.charAt(end))){
	                list.add(s.charAt(end++));
	                max_len=Math.max(max_len,list.size());
	            }
	            else{
	                list.remove(Character.valueOf(s.charAt(start++)));
	            }
	        }
	        return max_len;
	    }
	}
