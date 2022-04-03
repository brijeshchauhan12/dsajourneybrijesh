package brijeshdsa;

public class HowManyTimesRotationInSortedArray {
   public static int RotationVal(int [] A) {
	   int low=0;
	   int n=A.length;
	   int high=n-1;
	   int index=0;
//	   while(start<=end) {
//		   int mid=start+(end-start)/2;
//		   int prev=(mid+1)%n;
//		   int next=(mid+n-1)%n;
//		   if(arr[mid]<=arr[prev]&& arr[mid]<=arr[next]) {
//			   return n-mid;
//			   //return mid if we need location of the least element only
//		   }
//		   else if(arr[start]<=arr[mid]) {
//			   start=mid+1;
//		   }
//		   else {
//			   end=mid-1;
//		   }
//	   }
//	   return -1;
	   while(low<=high) {
	   int mid = low+ (high-low)/2;
	   if(A[mid]<A[index]) //as the array sorted search on left until finding small number
	   {
	   index=mid;
	   high = mid-1;
	   }
	   else{ low=mid+1; } //else search on right
	   }
	   return index;
	 
   }
   public static void main(String [] args) {
	   int arr[]= {4,5,6,7,0,1,2,3};
	   int index=RotationVal(arr);
	   System.out.println(index);
	 
	   
   }
}
