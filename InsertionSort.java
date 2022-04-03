package brijeshdsa;

public class InsertionSort {
         public static int [] insertionsort(int [] M) {
        	 int n=M.length;
        	 for(int i=0;i<n;i++) {
        		 int key=M[i];
        		 int j=i-1;
        		 while(j>=0 && key<M[j]) {
        			 M[j+1]=M[j];
        			 j-=1;
        		 }
        		 M[j+1]=key;
        	 }
        	 return M;
         }
         public static void main(String [] args) {
        	 int [] tobesorted= {0,-265,1,3,17,20};
        	 int [] sortedarray=insertionsort(tobesorted);
        	 for(int i=0;i<sortedarray.length;i++) {
        		 System.out.print(sortedarray[i]+" ");
        	 }
        	 int a=(int)Math.ceil(90.6);
         }
}
