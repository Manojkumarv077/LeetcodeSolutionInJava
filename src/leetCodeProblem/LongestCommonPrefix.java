package leetCodeProblem;
import java.util.Arrays;
public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs= {"flower","flow","flight"};
		System.out.println(longestCommonPrefix(strs));
	}
	  public static String longestCommonPrefix(String[] strs) {
          Arrays.sort(strs);
  String a=strs[0];
  String b=strs[strs.length-1];
  int index=0;
  for(int i=0;i<a.length();i++){
      if(a.charAt(i)==b.charAt(i)){
          index++;
      }
      else{
          break;
      }
  }
  if(index==0){
      return "";
  }

  return a.substring(0,index);
}
}
