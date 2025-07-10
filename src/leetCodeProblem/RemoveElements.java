package leetCodeProblem;
import java.util.Arrays;
public class RemoveElements {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {3,2,2,3};
		int value=3;
		int result=removeElements(arr,value);
		System.out.print((result));
	}
	public static int removeElements(int []arr,int value) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=value) {
				arr[count]=arr[i];
				count++;
			}
		}
		return count;
	}

}
