package brijeshdsa;

public class Coin_change_Minimum_number_Of_coins_to_make_sum {
            public static void main(String [] args) {
            	int coins[]= {3,4,5,10,20};
            	int sum=50;
            	int mx=Integer.MAX_VALUE-1;
            	int n=coins.length;
            	int [][]matrix=new int[n+1][sum+1];
            	for(int i=0;i<n+1;i++) {
            		for(int j=0;j<sum+1;j++) {
            			if(i==0) {
            				matrix[i][j]=mx;
            			}
            			else if(j==0 && i!=0) {
            				matrix[i][j]=0;
            			}
            			else if(i==1 && j>0) {
            				if(j%coins[i]==0) {
            					matrix[i][j]=j/coins[i];
            				}
            				else {
            					matrix[i][j]=mx;
            				}
            			}
            			
            			else if(coins[i-1]<=j) {
            				matrix[i][j]=Math.min(matrix[i][j-coins[i-1]]+1, matrix[i-1][j]);
            			}
            			else {
            				matrix[i][j]=matrix[i-1][j];
            			}
            		}
            	}
            	System.out.println("minimum number of the coins to make the "+sum+" is : "+matrix[n][sum]);
            }
}
