package leetCodeProblem;
import java.util.List;
import java.util.ArrayList;
public class BuildAnArrayWithStackOperations {
	public static void main(String[] args) {
		int []target= {1,3};
		int n=3;
		System.out.println("The StackOperation is : "+buildArray(target,n));
	}
		public static List<String> buildArray(int[] target, int n) {

	        List<String> list=new ArrayList<>();
	        int index=0;
	        for(int i=0;i<n&&index<target.length;i++){
	            if(i+1==target[index]){
	                list.add("Push");
	                index++;
	            }else if(i+1!=target[index]){
	                list.add("Push");
	                list.add("Pop");
	            }
	        }
	        return list;
	    }
	}