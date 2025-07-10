package leetCodeProblem;
public class reverseOnlyLetters {
	public static void main(String[] args) {
		String s="Test1ng-Leet=code-Q!";
		find obj= new find();
		System.out.println(find.ReverseOnlyLetters(s));
	}
}
class find{
	public static String ReverseOnlyLetters(String s) {
        String []a=s.split("");
      String match="^[a-zA-Z]";
      String c="a";
      int i=0;
      int j=a.length-1;
      while(i < j){
          if(a[i].matches("^[a-zA-Z]") && a[j].matches("^[a-zA-Z]") ){
              c=a[i];
              a[i]=a[j];
              a[j]=c;
              i++;
              j--;
          }
         else if(!a[i].matches("^[a-zA-Z]")){
             i++;
         }
         else if(!a[j].matches("^[a-zA-Z]")){
             j--;
         }
         
      }
      StringBuilder str=new StringBuilder();
      for(String sb:a){
          str.append(sb);
      }
       return str.toString();
   }
}
