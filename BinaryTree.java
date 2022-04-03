package brijeshdsa;
import java.util.*;
/*
           10
         20    0
       40 560 1     
       
 */
//class TreeNode{
//	int val;
//	TreeNode left;
//	TreeNode right;
//	public TreeNode() {
//		
//	}
//	public TreeNode(int val) {
//		this.val=val;
//		this.left=null;
//		this.right=null;
//	}
//}
public class BinaryTree {
    TreeNode root;
	public BinaryTree(TreeNode root) {
		this.root=root;
	}
	public void Traversal(TreeNode root) {
		Queue<TreeNode> dq=new ArrayDeque<TreeNode>();
		dq.add(root);
		while(!dq.isEmpty()) {
			TreeNode temp=dq.poll();
			System.out.print(temp.val+" ");
			if(temp.left!=null) {
				dq.add(temp.left);
			}
			if(temp.right!=null) {
				dq.add(temp.right);
			}	
		}

	}
	public TreeNode Insert(TreeNode root,int data) {
		Queue<TreeNode> dq1=new LinkedList<TreeNode>();
		dq1.add(root);
		while(!dq1.isEmpty()) {
			TreeNode temp=dq1.poll();
			if(temp.left==null) {
				temp.left=new TreeNode(data);
				
				break;
			}
			if(temp.right==null) {
				temp.right=new TreeNode(data);
				
				break;
			}
			if(temp.left!=null) {
				dq1.add(temp.left);
			}
			if(temp.right!=null) {
				dq1.add(temp.right);
			}
		}
		return root;
	}
	public void Search(TreeNode root,int data) {
		Queue<TreeNode> dq2=new LinkedList<>();
		dq2.add(root);
		boolean t=false;
		while(!dq2.isEmpty()) {
			TreeNode temp=dq2.poll();
			if(temp.val==data) {
				t=true;
				break;
			}
			if(temp.left!=null) {
				dq2.add(temp.left);
			}
			if(temp.right!=null) {
				dq2.add(temp.right);
			}
			
		}
		String output=(t==false)?"The value is not found":"The value is found in the binary tree";
		System.out.println("\n"+output);
	}
//	public TreeNode DeleteNode(TreeNode root,int data) {
//		Queue<TreeNode> dq3=new LinkedList<>();
//		dq3.add(root);
//		while(!dq3.isEmpty()) {
//			TreeNode temp=dq3.poll();
//			if(temp.val==data) {
//				if(temp.left!=null) {
//					temp=temp.left;
//					break;
//				}
//				else {
//				  temp=null;
//				  break;
//			  }
//			  
//			}
//			if(temp.val!=data) {
//				if(temp.left!=null) {
//					dq3.add( temp.left);
//				}
//				if(temp.right!=null) {
//					dq3.add(temp.right);
//				}
//			}
//		}
//		return root;
//	}
	
	public static void main(String []args) {
		TreeNode root=new TreeNode(10);
		BinaryTree bt=new BinaryTree(root);
		bt.Insert(root, 20);
		bt.Insert(root, 0);
		bt.Insert(root, 40);
		bt.Insert(root, 560);
		bt.Insert(root, 1);
		bt.Traversal(bt.root);
		bt.Search(root, 560);
		bt.Search(root, 50);
//		bt.DeleteNode(root, 0);
		bt.Traversal(root);
		
	}
}
