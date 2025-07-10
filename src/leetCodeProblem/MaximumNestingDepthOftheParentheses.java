package leetCodeProblem;

public class MaximumNestingDepthOftheParentheses {

	public static void main(String[] args) {
		String s="(1)+((2))+(((3)))";
		System.out.println("The Maximum Depth Is : "+maxDepth(s));
		}
	public static int maxDepth(String s) {
		int depth=0,max=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='(') {
				depth++;
				max=Math.max(max, depth);
			}
			else if(c==')'){
				if(depth==0)
					return -1;
				depth--;
			}
		}
		return max;
	}
}
