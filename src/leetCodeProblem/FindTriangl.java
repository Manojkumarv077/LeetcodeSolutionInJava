package leetCodeProblem;
import java.util.ArrayList;
public class FindTriangl {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>>traingle=new ArrayList<ArrayList<Integer>>();
		//traingle.add(2);
		System.out.print(minimumTotal(traingle));
	}
		    public static int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		        int row = triangle.size();
		        int[] memo = new int[row];

		        for (int i = 0; i < row; i++) {
		            memo[i] = triangle.get(row - 1).get(i);
		        }

		        for (int r = row-2; r >= 0; r--) {
		            for (int c = 0; c <= r; c++) {
		                memo[c] = Math.min(memo[c], memo[c+1]) + triangle.get(r).get(c);
		            }
		        }

		        return memo[0];       
	}

}
