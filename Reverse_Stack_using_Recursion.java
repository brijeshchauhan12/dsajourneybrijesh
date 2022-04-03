package brijeshdsa;
import java.util.*;

public class Reverse_Stack_using_Recursion {
 public static void insert(Deque<Integer> s, int ele) {
	  if(s.size()==0) {
		  s.addLast(ele);
		  return;
	  }
	  int temp=s.peekLast();
	  s.pollLast();
	  insert(s,ele);
	  s.addLast(temp);
	  return;
	  
  }
 public static void reverse(Deque<Integer> s) {
	  if(s.size()==1) {
		  return;
	  }
	  int temp=s.peekLast();
	  s.pollLast();
	  reverse(s);
	  insert(s,temp);
	  return;
  }
  
   public static void main(String [] args) {
	   Deque<Integer> stack=new ArrayDeque<Integer>();
	   stack.add(4);
	   stack.add(5);
	   stack.add(90);
	   stack.add(80);
	  
//	   System.out.println(stack.pollLast());
	   System.out.println(stack);
	   System.out.println("********************");
	   reverse(stack);
//	   System.out.println(stack.pollLast());
	   System.out.println(stack);
	   
   }
}
