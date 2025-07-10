package leetCodeProblem;

public class FindtheIndexOfTheOccurrenceinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" The Index String :"+strIndex("manwilltoman","to"));
	}
	public static int strIndex(String haystack,String needle) {
		int count=0;
		for(int i=0;i<haystack.length()-needle.length();i++) {
			if(haystack.charAt(i)==needle.charAt(0)) {
				if(haystack.substring(i,needle.length()+i).equals(needle)) {
				   return i;
				}
			}}
			return -1;
	}

}
