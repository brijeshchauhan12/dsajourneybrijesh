package brijeshdsa;

public class CoinChangeProblem_MaximumNumberOfWays_ {
              public static void main(String [] args) {
            	  int coins[] = {1,2,3};//infinite supply of the coin is there so applying unbounded knapsack concept
            	  int sum=5;
            	  int n=coins.length;
            	  int [][] matrix=new int[n+1][sum+1];
            	  for(int i=0;i<n+1;i++) {
            		  for(int j=0;j<sum+1;j++) {
            			  if(j==0) {
            				  matrix[i][j]=1;
            			  }
            			  else if(j!=0 && i==0) {
            				  matrix[i][j]=0;
            			  }
            			  else if(coins[i-1]<=j) {
            				  matrix[i][j]=matrix[i][j-coins[i-1]]+matrix[i-1][j];//unbounded knapsack thats why i-1->i
            			  }
            			  else {
            				  matrix[i][j]=matrix[i-1][j];
            			  }
            		  }
            	  }
            	  System.out.println("The maximum number of ways to make the sum using infinite supply of the given coins is : "+matrix[n][sum]);
              }
}
