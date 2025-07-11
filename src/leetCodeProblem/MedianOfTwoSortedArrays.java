package leetCodeProblem;
import java.util.Arrays;
public class MedianOfTwoSortedArrays {
	public static void main(String[] args) {
		int []nums1= {1,2};
		int []nums2= {3,4};
		System.out.println("The Median of Two Sorted Arrays : "+medianOfArray(nums1,nums2));
	}
	public static double medianOfArray(int []nums1,int []nums2) {
		  int num3[]=new int [nums1.length+nums2.length];
	        int store=0;
	        int i=0;
	        while(i<nums1.length){
	            num3[store++]=nums1[i++];
	        }
	        int j=0;
	        while(j<nums2.length){
	            num3[store++]=nums2[j++];
	        }
	        Arrays.sort(num3);
	        if(num3.length%2==0){
	            return(double) (num3[(num3.length/2)-1]+num3[num3.length/2])/2;
	        }
	        return (double)num3[num3.length/2];
	}

}
