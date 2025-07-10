
package leetCodeProblem;

public class RemoveDuplicatedFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,1,2,3,4,5,6,7,7};
		int n=a.length;
		int k=1;
		for(int i=1;i<n;i++) {
			if(a[i]!=a[i-1]) {
				a[k]=a[i];
				k++;
			}
		}
		for(int i=0;i<k;i++) {
			System.out.println(a[i]);
		}
		
	}
}
