package leetCodeProblem;
import java.util.Arrays;
public class NumJewelsInStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String jewels="aA";
		String stones="aAAbbBBc";
		System.out.println("The Jewels in Stones : "+numJewelsInStones(jewels,stones));
	}
	public static int numJewelsInStones(String jewels,String stones) {
		int count=0;
        char []a=jewels.toCharArray();
        char []b=stones.toCharArray();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
            if(a[i]==b[j]){
                count++;
            }
            else{
                continue;
            }
            }
        }
        return count;
    }
}
