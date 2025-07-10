package leetCodeProblem;
import java.util.*;
public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num=17;
		double value=Math.sqrt(num);
		int ans=(int)value;
		System.out.println(ans);
		char []arr= {'a','b','c','d','e'};
		int []array=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			array[i]=(int)arr[i];
		}
		System.out.println(Arrays.toString(array));
		int []a1= {64,49,50,51,55,56,77};
		char []ch=new char[a1.length];
		for(int i=0;i<a1.length;i++) {
			ch[i]=(char)a1[i];
		}
		System.out.println(Arrays.toString(ch));
	}

}
