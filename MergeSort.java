package brijeshdsa;
import java.util.Arrays;
public class MergeSort {
	public static void mergeSort(int [] A,int l,int r) {
		if(l<r) {
			int m=l+(r-l)/2;
			mergeSort(A,l,m);
			mergeSort(A,m+1,r);
			merge(A,l,m,r);
		}
	}
	public static void merge(int [] A,int l,int m,int r) {
		int n1=m-l+1;
		int n2=r-m;
		int [] LeftTemp=new int[n1];
		int [] RightTemp=new int[n2];
		for(int i=0;i<n1;i++) {
			LeftTemp[i]=A[l+i];
		}
		for(int j=0;j<n2;j++) {
			RightTemp[j]=A[m+1+j];
		}
		int i=0,j=0,k=l;
		while(i<n1 && j<n2) {
			if(LeftTemp[i]<=RightTemp[j] ){
				A[k]=LeftTemp[i];
				i++;
			}
			else {
				A[k]=RightTemp[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			A[k]=LeftTemp[i];
			i++;
			k++;
		}
		while(j<n2) {
			A[k]=RightTemp[j];
			j++;
			k++;
		}
		
	}
     public static void main(String [] args) {
    	 int [] tobesorted= {2,3,53,23,8,2,10,-90};
    	 mergeSort(tobesorted,0,tobesorted.length-1);
    	 System.out.println(Arrays.toString(tobesorted));
     }
}
