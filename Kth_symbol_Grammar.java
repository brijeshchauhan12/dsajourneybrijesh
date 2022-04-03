package brijeshdsa;

public class Kth_symbol_Grammar {
	public static int solve(int n,int k) {
		if(n==1 && k==1) {
			return 0;
		}
		int mid=(int)Math.pow(2, n-1)/2;
		if(k<=mid) {
			return solve(n-1,k);
		}
		else {
			return solve(n-1,k-1);
		}
		
	}
    public static void main(String [] args) {
    	int n=4,k=4;
       int res=solve(n,k);
       System.out.println("the bit value at the appropriate index ::::"+  res);
    }
}
