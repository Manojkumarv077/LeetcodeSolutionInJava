package leetCodeProblem;
import java.util.*;
public class Arary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []a= {"c","a","b"};
		Arrays.sort(a);
		for(String b:a) {
		System.out.print(b+" ");
		int[] source = {1, 2, 3, 4, 5};
		int[] destination = new int[7];
		System.arraycopy(source, 0, destination, 0, 5);
		System.out.println(Arrays.toString(destination));  // Output: [1, 2, 3, 4, 5]

	}}

}
