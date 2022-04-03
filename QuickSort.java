package brijeshdsa;
import java.util.Arrays;
public class QuickSort {
	public static void swap(int [] A,int i,int j) {
		int temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
	public static void quicksort(int [] A,int p,int q) {
		if(p<q) {
			int r=partition(A,p,q);
			quicksort(A,p,r-1);
			quicksort(A,r+1,q);
		}
	}
	public static int partition(int [] A,int p,int q) {
		int pivot=q;
		int i=p-1;
		for(int j=p;j<q;j++) {
			if(A[j]<A[pivot]) {
				i+=1;
				swap(A,i,j);
			}
		}
		swap(A,i+1,q);
		
		return i+1;
	}
    public static void main(String[]args) {
    	int [] givArr= {3,49,1,2,90,23,7,12,0};
    	quicksort(givArr,0,givArr.length-1);
    	System.out.println(Arrays.toString(givArr));
    	
    }
}
