package leetCodeProblem;
import java.util.*;
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int []a= {1,1,2,3,3,4,4};
		Arrays.sort(a);
		System.out.println(pf(a));
		}
	public static int pf(int []b) {
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i]!=b[j]) {return b[i];
			}
		}
	}
		return 0;
	}}

