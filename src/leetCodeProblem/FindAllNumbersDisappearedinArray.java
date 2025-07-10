package leetCodeProblem;
import java.util.ArrayList;
import java.util.HashSet;
public class FindAllNumbersDisappearedinArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,1,3,2,6,5,6,8,9};
		System.out.println(findAll(arr));
	}
	public static ArrayList<Integer> findAll(int []arr){
		HashSet<Integer>hash=new HashSet<>();
		ArrayList<Integer>list=new ArrayList<>();
		for(int num:arr) {
			hash.add(num);
		}
		for(int i=1;i<arr.length;i++) {
			if(!hash.contains(i)) {
				list.add(i);
			}
		}
		return list;
	}
}
