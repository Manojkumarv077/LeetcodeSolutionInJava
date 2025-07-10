package leetCodeProblem;
import java.math.BigInteger;
import java.util.Arrays;
public class multiplyStrings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1="7";
		String num2="11";
		System.out.print(Multiply(num1,num2));	
		}
	public static String Multiply(String num1,String num2) {
		BigInteger a=new BigInteger(num1);
		BigInteger b=new BigInteger(num2);
		BigInteger multi=a.multiply(b);
		return multi.toString();
	}

}
