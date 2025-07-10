package leetCodeProblem;
import java.util.Arrays;
import java.util.Scanner;
public class IntegerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("enter the Number :");
		int num=in.nextInt();
		Palindrome(num);
	}
	static void Palindrome(int x) {
		int num=x;
		
		int reverse=0;
		while(x<0) {
			System.out.print("It is Not Palindrome..?");
		}
		while(x>0) {
			reverse=(reverse*10)+(x%10);
			x/=10;
		}
		if(reverse==num) {
			System.out.println("It is Palindrome...!");
		}
		else {
			System.out.println("It is Not Palindrome...?");
		}
		int a=7,b=4,c=11,d=17;
	       System.out.println((a>b?a:b)<(c>d?c:d));
       Object []obj= {1,2,3,4,"manoj","kishor",'v','j',7.7,true,72.48};
       System.out.print(Arrays.toString(obj));
	}
}
