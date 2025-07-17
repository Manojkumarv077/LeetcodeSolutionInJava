package leetCodeProblem;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		int nums[]= {10,9,2,5,3,7,101,18};
		System.out.println("The Length of Longest String : "+lengthOfLIS(nums));
	}
		public static int lengthOfLIS(int[] nums) {
	        int length = nums.length;
	        int max = 1;
	        int[] dp = new int[length];
	        dp[0] = 1;

	        for (int i = 1; i < length; i++) {
	            int longest = 1;
	            for (int j = 0; j < i; j++) {
	                if (nums[i] > nums[j]) {
	                    longest = Math.max(longest, dp[j] + 1);
	                }
	            }
	            dp[i] = longest;
	            max = Math.max(max, longest);
	        }

	        return max;
	    }
}