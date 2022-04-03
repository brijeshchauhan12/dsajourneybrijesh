package brijeshdsa;

public class O1knapSack {
   public static int maxr(int a,int b) {
	   return a>b?a:b;
   }
   public static void main(String [] args) {
	  int [] weight= {0,3,4,6,5};
	  int  [] profit= {0,2,3,1,4};
	  int max=8;
	  int n=weight.length;
	  int [][] matrix=new int[n+1][max+1];
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<=max;j++) {
			  if(i==0 || j==0) {
				  matrix[i][j]=0;
			  }
			  if(i!=0 && j!=0) {
				  if(weight[i]>j) {
					  matrix[i][j]=matrix[i-1][j];
				  }
				  if(weight[i]<=j) {
					  matrix[i][j]=maxr(matrix[i-1][j],matrix[i-1][j-weight[i]]+profit[i]);
				  }
			  }
		  }
	  }
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<=max;j++) {
			  System.out.print(matrix[i][j]+" ");
		  }
		  System.out.println();
	  }
	  System.out.println(matrix[n-1][max]);
   }
}
