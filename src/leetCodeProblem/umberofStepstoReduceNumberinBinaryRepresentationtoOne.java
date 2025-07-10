package leetCodeProblem;

public class umberofStepstoReduceNumberinBinaryRepresentationtoOne {

	public static void main(String[] args) {
		String s="1101";
		System.out.println("total Steps to required is : "+binaryRepresentation(s));
		}
	public static int binaryRepresentation(String s) {
		 int steps = 0;
	        int carry = 0;
	        for (int i = s.length() - 1; i > 0; i--) {
	            if (s.charAt(i) - '0' + carry == 1) {
	                carry = 1;
	                steps += 2; 
	            } else {
	                steps += 1;
	            }
	        }
	        return steps + carry;
	}

}
