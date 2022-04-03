package brijeshdsa;
import java.util.*;
public class Permutation_with_space {
	  public static  HashSet<String> set=new HashSet<>();
	  public static void solve(String op,String in) {
		  if(in.length()==0) {
			  System.out.print(op+"	");
			  set.add(op);
			  return;
		  }
		
		  String op1=op;
		  String op2=op;
		  char a=in.charAt(0);
		  
		  op1+=" "+a;
		  op2+=a;
		  StringBuffer sb=new StringBuffer(in);
		  sb.deleteCharAt(0);
		  String inn=sb.toString();
		  if(op.length()>0) {
			  	  solve(op1,inn);
		  }
		  solve(op2,inn);
		  
	  }
      public static void main(String [] args) {
    	  String op="";
    	  String in="abc";
    	  solve(op,in);
    	  System.out.println(set);
    	  Character.
      }
}
