package leetCodeProblem;
import java.util.HashMap;
public class RomanToInt {

	public static void main(String[] args) {
		String s="III";
		int finalRes=MapToInt(s);
		System.out.println(finalRes);
	}
	public static int MapToInt(String s) {
		 int result=0;
	        HashMap<Character,Integer> roman=new HashMap<>();
	        roman.put('I',1);
	        roman.put('V',5);
	        roman.put('X',10);
	        roman.put('L',50);
	        roman.put('C',100);
	        roman.put('D',500);
	        roman.put('M',1000);
	        int i=0;
	        while(i<s.length()-1){
	            if(roman.get(s.charAt(i))<roman.get(s.charAt(i+1))){
	                result-=roman.get(s.charAt(i));
	            }
	            else{
	                result+=roman.get(s.charAt(i));
	            }
	            i++;
	        }
	        return result + roman.get(s.charAt(s.length()-1));
	}

}
