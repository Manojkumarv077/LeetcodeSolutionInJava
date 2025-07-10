package leetCodeProblem;
import java.util.HashMap;
import java.util.Scanner;
public class ContainsDuplicates2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("enter Array Size :");
		int n=in.nextInt();
		int []arr=new int[n];
		System.out.print("enter Array elements :");
		for(int i=0;i<n;i++) {
			arr[i]=in.nextInt();
		}
		int k=3;
		System.out.print(containDuplicates(arr,k));
	}
	public static boolean containDuplicates(int []nums,int k) {
		HashMap<Integer ,Integer>map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int val=nums[i];
			if(map.containsKey(val) && i-map.get(val)<=k) {
				return true;
			}
			map.put(val,i);
		}
		return false;
	}

}
