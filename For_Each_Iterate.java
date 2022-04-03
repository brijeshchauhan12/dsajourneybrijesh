package brijeshdsa;
import java.util.*;
public class For_Each_Iterate {
      public static void main(String [] args) {
    	  List<String> lst=new ArrayList<String>();
    	  for(int i=0;i<10;i++) {
    		  lst.add("breijsh"+i);
    	  }
    	  System.out.println(lst);
    	  lst.forEach(n->System.out.print(n+ "   "));
      }
}
