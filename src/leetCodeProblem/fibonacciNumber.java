package leetCodeProblem;
import java.util.Scanner;
public class fibonacciNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an Number : ");
		int n=sc.nextInt();
		System.out.println(fib(n));
	}
	public static int fib(int n) {
		int a=0,b=1;
		int c=0;
		if(n<=1) {
			return n;
		}
		for(int i=1;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			//System.out.println(c);
		}
		return c;
	}

}
