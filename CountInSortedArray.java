package brijeshdsa;

public class CountInSortedArray {
 
   public static int firstOccurance(int arr[],int val) {
	  int start=0;
	  int end=arr.length;
	  int res=-1;
	  while(start<=end) {
		  int  mid=start+ (end-start)/2;
		  if(arr[mid]==val) {
			  res=mid;
			  end=mid-1;
		  }
		  else if(arr[mid]>val) {
			  end=mid-1;
		  }
		  else {
			  start=mid+1;
		  }
	  }
	  return res;
   }
  public static int lastOccurance(int arr[],int val) {
	   int start=0;
	   int end=arr.length;
	   int res=-1;
	   while(start<=end) {
		   int mid=start+(end-start)/2;
		   if(arr[mid]==val) {
			   res=mid;
			   start=mid+1;
		   }
		   else if(arr[mid]>val) {
				  end=mid-1;
			  }
		   else {
				  start=mid+1;
			  }
	   }
	   return res;
   }
   public static void main(String [] args) {
	     int arr[]= {2,4,10,10,10,18,18,18,18,20};
	     int a=firstOccurance(arr,18);
	     int b=lastOccurance(arr,18);
	     System.out.println(b-a+1);
   }
}
