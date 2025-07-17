package leetCodeProblem;

public class ScoreofaString {

	public static void main(String[] args) {
		String s="hello";
		System.out.println("The Score Of String is : "+(score(s)));
	}
	public static int score(String s) {
		int result=0;
		for(int i=0;i<s.length()-1;i++) {
			result+=Math.abs(s.charAt(i)-s.charAt(i+1));
		}
		return result;
	}

}
