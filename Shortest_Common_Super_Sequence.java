package brijeshdsa;

public class Shortest_Common_Super_Sequence {
      public static void main(String [] args) {
    	  String x="geek";
    	  String y="eke";
    	  int z=(x+y).length();
    	  int n=x.length();
    	  int m=y.length();
    	  int [][] t=new int[n+1][m+1];
    	  for(int i=0;i<n+1;i++) {
    		  for(int j=0;j<m+1;j++) {
    			  if(i==0|| j==0) {
    				  t[i][j]=0;
    			  }
    			  else if(x.charAt(i-1)==y.charAt(j-1)) {
    				  t[i][j]=1+t[i-1][j-1];
    			  }
    			  else {
    				  t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
    			  }
    		  }
    	  }
    	  int res=z-t[n][m];
    	  System.out.println("The length of Shortest common super sequence is : "+res);
      }
}
