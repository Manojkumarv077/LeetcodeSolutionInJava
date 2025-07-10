package leetCodeProblem;

//Online Java Compiler
//Use this editor to write, compile and run your Java code online

class Sum3 {
 public static void main(String[] args) {
     int []arr={0,0,0};
     int n=arr.length;
     int i=0,j=i+1,k=j+1;
     while(i<n-2 &&j<n-1 &&k<n){
         if(arr[i]+arr[j]+arr[k]==0){
             System.out.println("["+arr[i]+","+arr[j]+","+arr[k]+"]");
         }
         i++;
         j++;
         k++;
     }
 }
}