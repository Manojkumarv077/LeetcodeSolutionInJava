package leetCodeProblem;
public class MergeStringsAlternately {

	public static void main(String[] args) {
		String a="abc";
		String b="pqr";
		System.out.println("The Merged String is : "+mergeString(a,b));
		}
	public static String mergeString(String a,String b) {
		 StringBuilder str=new StringBuilder();
	       int i=0;
	       int j=0;
	       int m=a.length();
	       int n=b.length();
	      if(m==n){
	       while(i<a.length() || j<b.length() && i==j){
	           str.append(a.charAt(i));
	           str.append(b.charAt(j));
	           i++;
	           j++;
	       }}
	       else if(m>n){
	           while(i<n || j<n && i==j){
	               str.append(a.charAt(i));
	               str.append(b.charAt(j));
	               i++;
	               j++;
	           }
	           for(int k=i;k<m;k++){
	               str.append(a.charAt(k));
	           }
	       }
	       else{
	           while(i<m || j<m && i==j){
	               str.append(a.charAt(i));
	               str.append(b.charAt(j));
	               i++;
	               j++;
	           }
	           for(int k=i;k<n;k++){
	               str.append(b.charAt(k));
	           }
	       }
	       return str.toString();
	}
}
