package leetCodeProblem;
import java.util.Arrays;
public class FirstUniqueCharacterinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Not Repeated char Index is : "+firstUniqChar("loveleetcode"));
	    int i;
	   // System.out.println(i);
	}
	public static int firstUniqChar(String s) {
		char[]ch=s.toCharArray();
		int []arr=new int[26];
		for(char c:ch) {
			arr[c-'a']++;
		}
		for(int i=0;i<ch.length;i++) {
			if(arr[ch[i]-'a']==1) {
				return i;
			}
		}
		return -1;
	}

}
