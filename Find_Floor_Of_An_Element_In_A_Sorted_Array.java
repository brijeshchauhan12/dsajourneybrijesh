package brijeshdsa;

public class Find_Floor_Of_An_Element_In_A_Sorted_Array {
   public static int binarySearch(int [] arr,int ele) {
	   int start=0;
	   int end=arr.length-1;
	   int res=-1;
	   while(start<=end) {
		   int mid=start+(end-start)/2;
		   if(arr[mid]==ele) {
			   res=arr[mid];
			   break;
		   }
		   else  if(arr[mid]<ele) {
			   res=arr[mid];
			   start=mid+1;
		   }
		   else if(arr[mid]>ele) {
			   end=mid-1;
		   }
	   }
	   return res;
   }
   public static int binarySearch_Rev_Process(int [] arr,int ele) {
	   int start=0;
	   int end=arr.length-1;
	   int res=-1;
	   while(start<=end) {
		   int mid=start+(end-start)/2;
		   if(arr[mid]==ele) {
			   res=arr[mid];
			   break;
		   }
		   else if(arr[mid]<ele) {
			   start=mid+1;
		   }
		   else {
			   res=arr[mid];
			   end=mid-1;
		   }
	   }
	   return res;
   }
   public static void main(String [] args) {
	   int arr[]= {1,2,3,4,8,10,10,12,19};
	   int element=9;
	   int a=binarySearch(arr,element);
	   System.out.println("the floor value is  :  "+a);
	   int b=binarySearch_Rev_Process(arr,element);
	   System.out.println("the ceil value is   :  "+b);
   }
}
