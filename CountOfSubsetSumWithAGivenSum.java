package brijeshdsa;

public class CountOfSubsetSumWithAGivenSum {
       public static void main(String [] args) {
    	   int [] arr= {2,3,5,6,8,10};
    	   int sum=10;
    	   int n=arr.length;
    	   int [][]matrix=new int[n+1][sum+1];
    	   for(int i=0;i<n+1;i++) {
    		   for(int j=0;j<sum+1;j++) {
    			   if(j==0) {
    				   matrix[i][j]=1;
    			   }
    			   else if(i==0 && j!=0) {
    				   matrix[i][j]=0;
    			   }
    			   
    			   else   if(arr[i-1]<=j) {
    				   matrix[i][j]=matrix[i-1][j] + matrix[i-1][j-arr[i-1]];
    			   }
    			   else {
    				   matrix[i][j]=matrix[i-1][j];
    			   }
    			   
    		   }
    	   }
    	   System.out.println("the number of subset whose sum is :  "+ matrix[n][sum]);
       }
}
