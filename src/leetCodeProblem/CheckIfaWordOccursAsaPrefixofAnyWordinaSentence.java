package leetCodeProblem;

public class CheckIfaWordOccursAsaPrefixofAnyWordinaSentence {

	public static void main(String[] args) {
		String sentence="This problem is easy problem";
		String searchWord="pro";
		System.out.println("The Prefix of String is : "+checkIf(sentence,searchWord));
	}
	public static int  checkIf(String sentence,String searchWord) {
		String []arr=sentence.split(" ");
		int count=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].contains(searchWord)) {
				count=i+1;
				break;
			}
		}
		return count;
	}
}
