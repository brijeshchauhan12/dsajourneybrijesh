package brijeshdsa;

public class CountingSort {
    public static void main(String [] args) {
    	int [] A= {2,38,9,4,0,3,8,23,78,12,34};
    	int n=A.length;
    	int maz=A[0];
    	for(int i=0;i<n;i++) {
    		if(A[i]>maz) {
    			maz=A[i];
    		}
    	}
    	int [] count=new int[maz+1];
    	for(int i=0;i<maz+1;i++) {
    		count[i]=0;
    	}
    
    	for(int i=0;i<n;i++) {
    		count[A[i]]+=1;
    	}
    	
       for(int i=1;i<maz+1;i++) {
    		   count[i]=count[i]+count[i-1];
       }
       for(int i=0;i<=maz;i++) {
    	   System.out.print(count[i]+ " ");
       }
       int [] final_ae =new int[n];
       
       for(int i=n-1;i>=0;i--) {
    	   int a=A[i];
    	  int b= count[a]-1;
    	  count[a]-=1;
    	  final_ae[b]=a;
    	   
       }
       System.out.println("\nthe sorted array is \n");
       for( int i=0;i<n;i++) {
    	   System.out.print(final_ae[i]+"  ");
       }
       
     
    }
}
