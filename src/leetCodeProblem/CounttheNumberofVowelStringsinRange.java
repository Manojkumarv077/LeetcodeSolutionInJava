package leetCodeProblem;
public class CounttheNumberofVowelStringsinRange {

	public static void main(String[] args) {
		String []s= {"are","amy","u"};
		int left=0;
		int right=2;
		System.out.println("The Count of Vowels : "+countVowels(s,left,right));
	}
	public static int countVowels(String [] s,int left,int right) {
		int count=0;
		for(int i=left;i<=right;i++){
	           if((s[i].startsWith("a") || s[i].startsWith("i") || s[i].startsWith("e") || s[i].startsWith("o") || s[i].startsWith("u") )&& (s[i].endsWith("e") || s[i].endsWith("a") || s[i].endsWith("o") || s[i].endsWith("i") || s[i].endsWith("u"))){
	               count++;
	           }
	        }
	        return count;
	}
}
