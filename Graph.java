//
//                                7
//                           4     

package brijeshdsa;
import java.util.Stack;
import java.util.*;
public class Graph {
//	LinkedList<LinkedList<Integer>> list = new LinkedList<LinkedList<Integer>>();
	int a=10;
	public void insertEdge( ArrayList<ArrayList<Integer>> ll,int u,int v){
		ll.get(u).add(v);
		ll.get(v).add(u);
	
	}	
	public void print(ArrayList<ArrayList<Integer>> ll) { 
		for(int i=0;i<ll.size();i++) {
			System.out.print("Printing all the value associated to the Node  "+i +" ");
			for(int j=0;j<ll.get(i).size();j++) {
				System.out.print("-> "+ll.get(i).get(j));
			}
			System.out.println();
			
		}
	}
	public void Bfs(ArrayList<ArrayList<Integer>> ll,int s) {
		boolean[] visited=new boolean[this.a];
		Queue<Integer> queue=new LinkedList<Integer>();
		queue.add(s);
		while(!queue.isEmpty()) {
			s=queue.poll();
			System.out.print(s+" ");
		    ArrayList<Integer> arl;
		    arl=ll.get(s);
		    Iterator<Integer> i=arl.iterator();
		    while(i.hasNext()) {
		    	int n=i.next();
		    	if(!visited[n]) {
		    		visited[n]=true;
		    		queue.add(n);
		    	}
		    }
			
		}
	}
	public void Dfs(ArrayList<ArrayList<Integer>> ll,int s) {
		boolean[] visited=new boolean[this.a];
		Stack<Integer> stack=new Stack<Integer>();
		stack.add(s);
		while(!stack.isEmpty()) {
			
			s=stack.pop();
			if(visited[s]==false) {
				System.out.print(s+" ");
				visited[s]=true;
			}
			
			ArrayList<Integer> arl;
			arl=ll.get(s);
			Iterator<Integer> i=arl.iterator();
			while(i.hasNext()) {
				int n=i.next();
				if(!visited[n]) {
					
					stack.push(n);
				}
			}
		}
		
	}
	public static void main(String [] args) {
	  Graph gp=new Graph();
	  
	  ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(gp.a);
	  for(int i=0;i<gp.a;i++) {
		  list.add(new ArrayList<Integer>());
	  }
	  gp.insertEdge(list,0,2);
	  gp.insertEdge(list,0,1);
	  gp.insertEdge(list,1,2);
	  gp.insertEdge(list,2,0);
	  gp.insertEdge(list,2,3);
	  gp.insertEdge(list,3,3);
//	  gp.insertEdge(list,9,70);
	  gp.print(list);
	  System.out.println("trying to print in bfs order \n");
	  gp.Bfs(list, 2);
	  System.out.println("trying to print in dfs order \n");
	  gp.Dfs(list, 2);
	  gp.print(list);
	  
	}
}
