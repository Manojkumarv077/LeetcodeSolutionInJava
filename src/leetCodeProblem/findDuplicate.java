package leetCodeProblem;
import java.util.Arrays;
public class findDuplicate {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {3,1,3,4,2};
		Arrays.sort(arr);
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==arr[i-1]) {
				System.out.print("The Duplicate number in Array Is :"+arr[i]);
			}
		}
	}

}
