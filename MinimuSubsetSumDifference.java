package brijeshdsa;

import java.util.Arrays;

public class MinimuSubsetSumDifference {
	     public static int [] SubsetSum(int [] arr,int range) {
	    	 int n=arr.length;
	    	 boolean [][] matrix =new boolean[n+1][range+1];
	    	 for(int i=0;i<n+1;i++) {
	    		 for(int j=0;j<range+1;j++) {
	    			 if(j==0) {
	    				 matrix[i][j]=true;
	    			 }
	    			 else if(j!=0 && i==0) {
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
	    	
	    	int cnt=0;
	    	for(int i=n;i<n+1;i++) {
	    		for(int j=0;j<range+1;j++) {
	    			if(matrix[i][j]) {
	    				if(matrix[i][j]) {
	    					cnt++;
	    				}
	    			}
	    		}
	    	}
	    	int res[] =new int[cnt];
	    	int k=0;
	    	for(int i=n;i<n+1;i++) {
	    		for(int j=0;j<range+1;j++) {
	    			if(matrix[i][j]) {
	    				if(matrix[i][j]) {
	    					res[k]=j;
	    					k++;
	    				}
	    			}
	    		}
	    	}
	    	return res;
	     }
         public static void main(String [] args) {
        	 int [] arr= {1,6,11,5};
        	 int rangee=0;
        	 for(int i=0;i<arr.length;i++) {
        		 rangee+=arr[i];
        	 }
        	 int [] arr1=SubsetSum(arr,rangee);
        	 System.out.println(Arrays.toString(arr1));
        	 int minn=Integer.MAX_VALUE;
        	 for(int i=0;i<arr1.length;i++) {
        		 minn=Math.min( Math.abs((rangee)-2*(arr1[i])), minn);
        	 }
        	 System.out.println("Minimun Subset Sum Difference is :  "+minn );
         }
}
