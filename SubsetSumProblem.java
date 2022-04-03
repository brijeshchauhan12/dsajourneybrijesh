package brijeshdsa;

public class SubsetSumProblem {
         public static void main(String [] args) {
                  	int [] A= {2,3,5,7,10};
                    int n=A.length;
                    int w=14;
                    int matrix [][]=new int[n][w+1];
                     for(int i=0;i<n;i++) {
	                     for(int j=0;j<=w;j++) {
		                         if(j==0) {
		                        	 matrix[i][j]=1;
		                         }
		                         if(i==0 && j!=0) {
		                        	 if(j==A[i]) {
		                        		 matrix[i][j]=1;
		                        	 }
		                        	 else {
		                        		 matrix[i][j]=0;
		                        	 }
		                         }
		                         if(i!=0 && j!=0) {
		                        	 if(A[i]>j) {
		                        		 matrix[i][j]=matrix[i-1][j];
		                        	 }
		                        	 else if(A[i]==j) {
		                        		 matrix[i][j]=1;
		                        	 }
		                        	 else if(matrix[i-1][j]==1) {
		                        		 matrix[i][j]=1;
		                        	 }
		                        	 else if(matrix[i-1][j-A[i]]==1) {
		                        		 matrix[i][j]=1;
		                        	 }
		                        	 else {
		                        		 continue;
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
                     
          }
  
}
