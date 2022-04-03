package brijeshdsa;
import java.util.*;

public class Nth235 {
	 public static boolean canWinNim(int n) {
	        int i=1;
	        while(n>0){
	           if(n>=3 && (n-3)>3 ){
	               n-=3;
	              
	           }
	           else if(n<3 && n>1 ){
	               n-=2;
	           }
	           else if(n==1){
	               n-=1;
	           }
	           if(n==0){
	              break;
	           }
	           i++;
	        }
	        System.out.println("brijesh chauhan"+i);
	        return i%2==0?false:true;
	    }
     public static void main(String [] args) {
//    	 HashMap<String ,Integer> hmp=new HashMap<String, Integer>();
    	 System.out.println(Nth235.canWinNim(5));
     }
}
