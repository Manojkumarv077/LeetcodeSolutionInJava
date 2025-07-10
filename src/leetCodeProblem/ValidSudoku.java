package leetCodeProblem;
import java.util.HashSet;
public class ValidSudoku {
	public static void main(String[]args) {
		char [][]ch={{'5','3','.','.','7','.','.','.','.'}
		,{'6','.','.','1','9','5','.','.','.'}
		,{'.','9','8','.','.','.','.','6','.'}
		,{'8','.','.','.','6','.','.','.','3'}};
		System.out.print(isValidSudoku(ch));
	}
	public static boolean isValidSudoku(char[][] ch) {
        HashSet<String> see = new HashSet<>();
        for (int i = 0; i < ch.length; ++i) {
            for (int j = 0; j < ch.length; ++j) {
                if (ch[i][j] != '.') {
                    String s = "(" + ch[i][j] + ")";
                    // Check if the number has already been seen in the row, column, or sub-grid
                    if (!see.add(s + i) || !see.add(j + s) || !see.add(i / 3 + s + j / 3))
                        return false;
                }
            }
        }
        // If no duplicates are found, return true
        return true;
    }
}

