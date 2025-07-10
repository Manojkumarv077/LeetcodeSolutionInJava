package leetCodeProblem;

public class MaximunProductSubArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,-2,4};
		System.out.println(maximunProduct(arr));
	}
	public static int maximunProduct(int []arr) {
		int res=Integer.MIN_VALUE;
		for(int n:arr) {
			res=Math.max(n, res);
		}
		int curMax=1,curMin=1;
		for(int n:arr) {
			int temp=curMax*n;
			curMax=Math.max(temp,Math.max(curMin*n, n));
		    curMin=Math.min(temp, Math.min(curMax*n, n));
		    res = Math.max(curMax, res);
		}
		return res;
		}

}
