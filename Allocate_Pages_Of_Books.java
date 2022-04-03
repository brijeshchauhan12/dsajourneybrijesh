package brijeshdsa;

public class Allocate_Pages_Of_Books {
  public static void main(String [] args) {
	  int arr[]= {10,20,30,40};
	  int k=2;
	  //k is the number of students available 
	  // array stores count of pages each book contains
	  int max=arr[0];
	  int sum=0;
	  for(int i=0;i<arr.length;i++) {
		  sum+=arr[i];
		  if(max<arr[i]) {
			  max=arr[i];
		  }
	  }
	  int res=-1;
	  int start=max;
	  int end=sum;
	  while(start<=end) {
		  int mid=start+(end-start)/2;
		  if(isValid(arr,k,mid)==true) {
			  res=mid;
			  end=mid-1;
		  }
		  else {
			  start=mid+1;
		  }
	  }
	  System.out.println(res);
  }
  public static boolean isValid(int [] arr,int k,int mid) {
	  int student=1;
	  int sum=0;
	  int n=arr.length;
	  for(int i=0;i<n;i++) {
		  sum+=arr[i];
//		  System.out.println(sum);
		  if(sum>mid) {
			  student++;
			  sum=arr[i];
		  }
		  
		  if(student>k) {
		  return false;
	     }
	  }
	 
	  return true;
  }
}
