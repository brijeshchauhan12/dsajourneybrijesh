package brijeshdsa;

public class Longest_Common_Subsequence_Memoised_Version {
	      public static int LCSMEMOISED(String x,String y,int n,int m,int [][] matrix) {
	    	  if(n==0  || m==0) {
	    		 matrix[n][m]=0;
	    		  return 0;
	    	  } 
	    	  if(matrix[n][m]!=-1) {
	    			  return matrix[n][m];
	    		  }
	    	  else if(x.charAt(n-1)==y.charAt(m-1)) {

	    			  return matrix[n][m]=1+LCSMEMOISED(x,y,n-1,m-1,matrix);
	    		 
	    	  }
	    	  
	    	  else {
	    		  return matrix[n][m]=Math.max(LCSMEMOISED(x,y,n-1,m,matrix), LCSMEMOISED(x,y,n,m-1,matrix));
	    	  }
	      }
          public static void main(String[] args) {
        	  String x="abc";
        	  String y="abcdefc";
        	  int n=x.length();
        	  int m=y.length();
        	  int [][] matrix=new int[n+1][m+1];
        	  for(int i=0;i<n+1;i++) {
        		  for(int j=0;j<m+1;j++) {
        			  matrix[i][j]=-1;
        		  }
        	  }
        	  System.out.println("The length of the longest common subsequence is : "+LCSMEMOISED(x,y,n,m,matrix));
          }
}
