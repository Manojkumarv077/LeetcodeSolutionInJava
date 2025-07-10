package leetCodeProblem;
import java.util.HashMap;
public class FindTheDifference {
	public static void main(String[] args) {
		String s="abcd";
		String t="abcde";
		System.out.print(findDifference(s,t));
	}
	public static char findDifference(String s,String t) {
		int sum=0;
		for(char c:t.toCharArray()) {
			sum+=c;
		}
		for(char c:s.toCharArray()) {
			sum-=c;
		}
		return (char)sum;
	}

}
