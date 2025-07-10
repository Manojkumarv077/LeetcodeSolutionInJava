package leetCodeProblem;
import java.util.*;
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {3,2,1,5,7,6,8};
		System.out.println(find(a));
	}
	static int find(int []a) {
		int num=0;
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			if(a[i]!=i+1) {
				num=i;
			}
		}
		return num;
	}
	

}
