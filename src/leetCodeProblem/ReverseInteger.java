package leetCodeProblem;
public class ReverseInteger {

	public static void main(String[] args) {
		int n=120;
		System.out.println(reverseInteger(n));
	}
	public static int reverseInteger(int n) {
		int result=0;
		while(n!=0) {
			result=result*10+n%10;
			n/=10;
		}
		return result;
	}

}
