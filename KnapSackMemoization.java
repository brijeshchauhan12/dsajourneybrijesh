package brijeshdsa;
import java.util.*;
public class KnapSackMemoization {
	
	
	  public static int KnapSack(int [] wt,int [] val,int W,int n,int [][] t) {
		  if(n==0 || W==0) {
			  return 0;
		  }
		  if(t[n][W]!=0) {
			  return t[n][W];
		  }
		  if(wt[n-1]<=W) {
			  if(t[n][W]!=-1) {
				  return t[n][W];
			  }
//			  t[n][W]=Math.max((val[n-1]+KnapSack(wt,val,W-wt[n-1],n-1,t)),KnapSack(wt,val,W,n-1,t));
			  return Math.max((val[n-1]+KnapSack(wt,val,W-wt[n-1],n-1,t)),KnapSack(wt,val,W,n-1,t));
			  
		  }
		  else if(W>wt[n-1]) {
//			  t[n][W]=Math.max((val[n-1]+KnapSack(wt,val,W-wt[n-1],n-1,t)),KnapSack(wt,val,W,n-1,t));
			 return  KnapSack(wt,val,W,n-1,t);
			 
		  }
		return -1;
	  }
      public static void main(String [] args) {
    	    int[][] t=new int[101][1001];
    		for(int i=0;i<t.length;i++) {
    		   Arrays.fill(t[i], -1);
    		}
//    	  System.out.print(Arrays.deepToString(t));
    	  int [] wt= {2,3,2,5,9,21,1};
    	  int [] val={10,20,30,10,20,20,10};
    	  int W=50;
    	  int n=wt.length;
    	  System.out.println("the maximum profit is : "+ KnapSack(wt,val,W,n,t));
    	  
    	  
      }
}
