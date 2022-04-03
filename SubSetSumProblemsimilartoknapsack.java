package brijeshdsa;

public class SubSetSumProblemsimilartoknapsack {
     public static void main(String [] args) {
    	 int [] arr= {3,4,7,2,4,8,9};
    	 int sum=14;
    	 int n=arr.length;
    	 boolean [][] matrix=new boolean [n+1][sum+1];
    	 for(int i=0;i<n+1;i++) {
    		 for(int j=0;j<sum+1;j++) {
    			 if(j==0) {
    				 matrix[i][j]=true;
    			 }
    			 else if(i==0 && j!=0) {
    				 matrix[i][j]=false;
    			 }
    			 else if(arr[i-1]<=j) {
    				 matrix[i][j]=matrix[i-1][j-arr[i-1]] || matrix[i-1][j];
    			 }
    			 else {
    				 matrix[i][j]=matrix[i-1][j];
    			 }
    		 }
    		 
    	 }
    	 System.out.println(matrix[n][sum]);
     }
}
