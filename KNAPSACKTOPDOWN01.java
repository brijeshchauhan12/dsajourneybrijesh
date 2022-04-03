package brijeshdsa;

public class KNAPSACKTOPDOWN01 {
      public static void main(String [] args) {
    	  int [] wt= {3,1,2,6,2,8};
    	  int [] val= {1,2,1,3,4,1};
    	  int W=12;
    	  int n=wt.length;
    	  int [][] matrix=new int [n+1][W+1];
    	  for(int i=0;i<n+1;i++) {
    		  for(int j=0;j<W+1;j++) {
    			  if(i==0 || j==0) {
    				  matrix[i][j]=0;
    			  }
    			  else if(wt[i-1]<=j) {
    				  matrix[i][j]=Math.max(val[i-1]+matrix[i-1][j-wt[i-1]], matrix[i-1][j]);
    			  }
    			  else {
    				  matrix[i][j]=matrix[i-1][j];
    			  }
    		  }
    	  }
    	  System.out.println("Maximum profit -> "+matrix[n][W]);
    	for(int i=0;i<n+1;i++) {
    		for(int j=0;j<W+1;j++) {
    			System.out.print(matrix[i][j]+" ");
    		}
    		System.out.println();
    	}
      }
}
