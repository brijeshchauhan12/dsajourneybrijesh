package brijeshdsa;
 class sort{
	public static float [] selectionSort(float [] A) {
		int n=A.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				
				if(A[i]<A[j]) {
//					System.out.println("brijesh");
					float temp =A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		return A;
	}
}
public class fractionalKnapSack {

   public static void main(String [] args) {
	   
	   int [] profit= {5,10,15,7,8,9,4};
	   int [] weight= {1,3,5,4,1,3,2};
	   int n=profit.length;
	   float [] profitByweight=new float[n];
	   boolean [] visited=new boolean[n];
	   for(int i=0;i<n;i++) {
		   visited[i]=false;
	   }
	 
	   for(int i=0;i<n;i++) {
		   profitByweight[i]=(float)profit[i]/weight[i];
	   }  
	   int remaining_weight=15;
	   int collected_profit=0;
	   while(remaining_weight!=0) {
		   float max=profitByweight[0];
		   for(int i=0;i<n;i++ ) {
			   
		   }
		   
		   
	   }
	   
	   float [] ss=sort.selectionSort(profitByweight);
	   for(int i=0;i<n;i++) {
		   System.out.print(ss[i]+" ");
	   }
	  
   }
}
