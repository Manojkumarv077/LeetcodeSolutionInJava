package leetCodeProblem;
import java.util.Arrays;
public class MinimumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr= {{1,2,3},{1,1,1},{7,8,9}};
		System.out.print(minimumPathSum(arr));
	}
	public static int minimumPathSum(int [][]arr) {
		int m=arr.length;
		int n=arr[0].length;
		for(int i=1;i<m;i++) {
			arr[i][0]+=arr[i-1][0];
		}
		for(int j=1;j<n;j++) {
			arr[0][j]+=arr[0][j-1];
		}
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				arr[i][j]+=Math.min(arr[i][j-1],arr[i-1][j]);
			}
		}
		return arr[m-1][n-1];
	}

}
