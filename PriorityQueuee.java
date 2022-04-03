package brijeshdsa;
import java.util.PriorityQueue;

public class PriorityQueuee {
       public static void main(String [] args) {
    	   PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    	   pq.add(12);
    	   pq.add(3);
    	   pq.add(100);
    	   pq.add(-9000);
    	   for(int i=0;i<4;i++) {
    		   System.out.print(pq.poll()+"  ");
    	   }
    	System.out.println("brijesh");   
       }
}
