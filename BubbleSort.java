package brijeshdsa;

public class BubbleSort {
   public static int [] bubblesort(int[] a) {
	   int n=a.length;
	   for(int i=0;i<n-1;i++) {
		   for(int j=0;j<n-i-1;j++) {
			   if(a[j+1]<a[j]) {
				   int t=a[j+1];
				   a[j+1]=a[j];
				   a[j]=t;
			   }
		   }
	   }
	   return a;
   }
   public static void main(String [] args) {
	   int [] tobesorted= {12,90,3,12,89,3,4,12,78};
	   int [] sortedarray=bubblesort(tobesorted);
	   for(int i=0;i<sortedarray.length;i++) {
		   System.out.print(sortedarray[i]+" ");
	   }
	   
   }
}
