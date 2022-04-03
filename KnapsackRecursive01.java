package brijeshdsa;
import java.util.*;
public class KnapsackRecursive01 {
	   
	     public static int KnapSack(int[]wt,int[] val,int W,int n) {
	    	 if(n==0|| W==0) {
	    		 return 0;
	    	 }
	    	 if(wt[n-1]<=W) {
	    		 return Math.max(val[n-1]+KnapSack(wt,val,W-wt[n-1],n-1),
	    				   KnapSack(wt,val,W,n-1)
	    				 );
	    	 }
	    	 else if(wt[n-1]>W) {
	    		 return KnapSack(wt,val,W,n-1);
	    	 }
	    	 return -1;
	     }
         public static void main(String [] args) {
        	 int [] wt= {3,1,2,6,2,8};
       	  int [] val= {1,2,1,3,4,1};
       	  int W=12;
        	 System.out.println("max profit is : "+KnapSack(wt,val,W,wt.length));
        	 
         }
}
