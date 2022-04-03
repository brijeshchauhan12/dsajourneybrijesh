package brijeshdsa;

public class bitManipulation {
   public  static int countSetBits(int n) {
	   if(n==0) {
		   return 0;
	   }
	   else {
		   return (n&1)+countSetBits(n>>1);
	   }
   }
   public static int uniqueNumber(int [] arr,int n) {
	   int  ans=0;
	   for(int i=0;i<n;i++) {
		   ans=ans^arr[i];
	   }
	   return ans;
   }
//   public static void possibleSubset(char A [],int n) {
//	   for(int i=0;i<(i<<n);++i) {
//		   for(int j=0;j<n;j++) {
//			   if(i &(i<<j)) {
//				   System.out.println(A[j]);
//			   }
//		   }
//	   }
//   }
   public static void main(String [] args) {
	   /*
	    * byte-> 8bit
	    * short->16bit
	    * int  ->32bit
	    * long ->64bit
	    * char ->16bit
	    */
//	   char a='B';
//	   a^=32;
//	   System.out.println(a);
//	   int b=10;
//	   b<<=2;
//	   System.out.println(b);
//	   b>>=2;
//	   System.out.println(b);
//	   System.out.println(2&1);
//	   System.out.println(2|1);
//	   String aa="b";
//	   System.out.println(Integer.parseInt(aa));
//	   int gh=Integer.reverseBytes(2);
//	   System.out.println(gh);
//	   String rt=Integer.toBinaryString(2);
//	   String tr=Integer.toBinaryString(gh);
//	   int aaa=Integer.parseInt(rt,2);
//	   System.out.println(rt+ "  "+ tr+" "+aaa);
//	   S
//	System.out.println(1<<2);	   
//	
//	System.out.println((25 & 24));
	int aa=0,bb=20;
	System.out.println(aa^bb);
	System.out.println("counting the setbits in 100 :  "+ countSetBits(16));
	System.out.println(178&1);
	int [] a= {1,2,1,3,3};
	System.out.println("uniqe number present in  {1,2,1,3,3}  "+uniqueNumber(a,5));
	System.out.println(5^12);
	
   }
}
