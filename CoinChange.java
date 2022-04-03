package brijeshdsa;

public class CoinChange {
   public static void main(String []args) {
	   int w=15;
	   int [] coins= {2,3,5,10};
	   int n=coins.length;
	   int [][]matrix=new int[n][w+1];
	   for(int i=0;i<n;i++) {
		   for(int j=0;j<=w;j++) {
			   if(i==0) {
				   if(j%coins[i]==0) {
					   matrix[i][j]=1;
				   }
				   else {
					   matrix[i][j]=0;
				   }
			   }
			   if(i!=0) {
				   if(coins[i]>j) {
					   matrix[i][j]=matrix[i-1][j];
				   }
				   if(coins[i]<=j) {
					   matrix[i][j]=matrix[i-1][j]+matrix[i][j-coins[i]];
				   }
			   }
		   }
	   }
	   for(int i=0;i<n;i++) {
		   for(int j=0;j<=w;j++) {
			   System.out.print(matrix[i][j]+" ");
		   }
		   System.out.println();
	   }
	   System.out.println(matrix[n-1][w]);
   }
}
