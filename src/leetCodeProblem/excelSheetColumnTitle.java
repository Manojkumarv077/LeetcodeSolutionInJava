package leetCodeProblem;
import java.util.*;
public class excelSheetColumnTitle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		System.out.print(ColumnTitle(n));
	}
	public static String ColumnTitle(int n) {
		StringBuilder res =new StringBuilder();
		while(n>0) {
			n--;
			res.insert(0,(char)((n%26)+'A'));
		    n/=26;
		}
		return res.toString();
	}

}
