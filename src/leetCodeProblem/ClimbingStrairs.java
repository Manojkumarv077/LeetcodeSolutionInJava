package leetCodeProblem;
import java.util.Scanner;
public class ClimbingStrairs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.print("enter the Number :");
		int n=in.nextInt();
		System.out.println(Climb(n));
	}
	public static int Climb(int n) {
		if(n<=3) {
			return n;
		}
		int start =2;
		int end=3;
		int mid=0;
		for(int i=3;i<n;i++) {
			mid=start+end;
			start=end;
			end=mid;
		}
		return end;
	}

}
