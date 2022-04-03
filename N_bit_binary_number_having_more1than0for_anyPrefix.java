package brijeshdsa;

public class N_bit_binary_number_having_more1than0for_anyPrefix {
 public static void solve(String op,int one,int zero,int n) {
	 if(n==0) {
		 System.out.print(op+" ");
		 return ;
	 }
	 String op1=op;
	 op1+="1";
	 solve(op1,one+1,zero,n-1);
	 if(one>zero) {
		 String op2=op;
		 op2+="0";
		 solve(op2,one,zero+1,n-1);
	 }
	 return;
 }
  public static void main(String [] args) {
	  String s="";
	  int one=0,zero=0,n=4;
	  solve(s,one,zero,n);
	  
  }
}
