package brijeshdsa;

public class Longest_Common_Subsequence_Recursive {
	   public static int LCS(String x,String y,int n,int m) {
		   if(n==0|| m==0) {
			   return 0;
		   }
		   if(x.charAt(n-1)==y.charAt(m-1)) {
			   return 1+LCS(x,y,n-1,m-1);
		   }
		   else {
			   return Math.max(LCS(x,y,n-1,m), LCS(x,y,n,m-1));
		   }
	   }
       public static void main(String [] args) {
    	   String x="Brijesh";
    	   String y="kumarchauhan";
    	   int n=x.length();
    	   int m=y.length();
    	   System.out.println("The length of the longest common subsequence is : "+LCS(x,y,n,m));
    	   }
}
