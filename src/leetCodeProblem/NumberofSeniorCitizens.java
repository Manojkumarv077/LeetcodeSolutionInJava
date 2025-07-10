package leetCodeProblem;

public class NumberofSeniorCitizens {

	public static void main(String[] args) {
		String details[]= {"7868190130M7522","5303914400F9211","9273338290F4010"};
		System.out.println("Total Number of Senior Citizens : "+countSeniors(details));	
	   }
	 public static int countSeniors(String[] details) {
	        int seniors=0;
	        for(String s:details){
	            s=s.substring(11,13);
	            long count =Long.parseLong(s);
	            if(count>60){
	                seniors++;
	            }
	        }
	        return seniors;
	    }
	}
