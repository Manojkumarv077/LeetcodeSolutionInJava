package leetCodeProblem;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,4,5};
		int targ=7;
	      int left = 0;
	        int right = a.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (a[mid] == targ) {
	                System.out.println(mid);
	            } else if (a[mid] > targ) {
	                right = mid - 1;
	            } else {
	                left = mid + 1;
	            }
	        }
	        System.out.println(left);        
	}
}
