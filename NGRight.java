package brijeshdsa;
import java.util.*;
public class NGRight {
   public static void main(String [] args) {
	   int [] Arr= {1,0,3,1,2,10,4};
	   List<Integer> Ngr=new ArrayList<Integer>();
	   Deque<Integer> stk=new ArrayDeque<Integer>();
	   for(int i=Arr.length-1;i>=0;i--) {
		   if(stk.isEmpty()) {
			  Ngr.add(-1);
		   }
		   if(!stk.isEmpty() && stk.peekLast()>Arr[i]) {
			   Ngr.add(stk.peekLast());
		   }
		   if(!stk.isEmpty()&& stk.peekLast()<=Arr[i]) {
			   while(!stk.isEmpty() && stk.peekLast()<=Arr[i]) {
				   stk.pollLast();
			   }
			   if(stk.isEmpty()) {
				   Ngr.add(-1);
			   }
			   else if(stk.peekLast()>Arr[i]) {
				   Ngr.add(stk.peekLast());
			   }
		   }
		   stk.addLast(Arr[i]);
	   }
//	   System.out.println(Arrays.);
	   Collections.reverse(Ngr);
	   System.out.println(Ngr);
   }
}
