
/*
                                 z
                              y     T4
                            x   T3
                          T1 T2    
 */

/*
                z                         y
           T4      y                  z       x
                T3     x            t4  t3  t1  t2
                    T1    T2
                                 
 */
package brijeshdsa;

import java.util.Deque;
import java.util.ArrayDeque;

class TreeNode{
	int val,height;
	TreeNode left,right;
	public TreeNode(int data) {
		this.val=data;
		height=1;
	}
}
public class AvlTree {
	TreeNode root;
	public int Height(TreeNode root) {
		if(root==null) {
			return 0;
		}
		else {
			return root.height;
		}
	}
	public int max(int a,int b) {
		return (a>b)?a:b;
	}
    public TreeNode rightRotate(TreeNode y) {
    	TreeNode x=y.left;
    	TreeNode T2=x.right;
    	x.right=y;
    	y.left=T2;
    	y.height=max(Height(y.left),Height(y.right))+1;
    	x.height=max(Height(x.left),Height(x.right))+1;
    	return x;
    }
    public TreeNode leftRotate(TreeNode y ) {
    	TreeNode x=y.right;
    	TreeNode T1=x.left;
    	x.left=y;
    	y.right=T1;
    	x.height=max(Height(x.left),Height(x.right))+1;
    	y.height=max(Height(y.left),Height(y.right))+1;
    	return x;
    	
    }
    public int getBalance(TreeNode y) {
    	if(y==null) {
    		return 0;
    	}
    	else {
    		return(Height(y.left)-Height(y.right));
    	}
    }
    public TreeNode insertNode(TreeNode node,int data) {
    	
    	if(node==null) {
    		return new TreeNode(data);
    	}
    	if(node.val>data) {
    		node.left=insertNode(node.left,data);
    	}
    	else if(node.val<data) {
        	node.right=insertNode(node.right,data);
        }
    	else {
    		return node;
    	}
    	node.height=1+max(Height(node.left),Height(node.right));
    	int balance=getBalance(node);
    	if(balance>1 && data<node.left.val) {
    		return rightRotate(node);
    	}
    	if(balance<-1 && data>node.right.val) {
    		return leftRotate(node);
    	}
    	if(balance>1 && data>node.left.val) {
    		node.left=leftRotate(node.left);
    		return rightRotate(node);
    	}
    	if(balance<-1 && data<node.right.val) {
    		node.right=rightRotate(node.right);
    		return leftRotate(node);
    	}
    	return node;
    }
    public void Search(TreeNode root,int data) {
    	if(root==null) {
    		return;
    	}
    	if(root.val==data) {
    		System.out.println("the value you are looking for is found :"+ data);
    		return;
    	}
    	if(root.val>data) {
    	 Search(root.left,data);
    	}
    	else if(root.val<data) {
    		Search(root.right,data);
    	}
    }
    public void inorderTraversal(TreeNode root) {
    	if(root==null) {    
    		return;
    	}
    	System.out.print(root.val+" ");
    	inorderTraversal(root.left);
    	inorderTraversal(root.right);
    }
    public void dfstraversal(TreeNode root) {
    	Deque<TreeNode> dq=new ArrayDeque<TreeNode>();
    	dq.offerLast(root);
    	while(!dq.isEmpty()) {
    		TreeNode tn=dq.pollLast();
    		System.out.print(tn.val+"\t");
    	     if(tn.left!=null)
    	    	 dq.offerLast(tn.right);
    	     if(tn.right!=null)
    	    	 dq.offerLast(tn.left);
    		
    	}
    }
    public static void main(String [] args) {
    	AvlTree tree = new AvlTree();
    	 
        /* Constructing tree given in the above figure */
        tree.root = tree.insertNode(tree.root, 10);
        tree.root = tree.insertNode(tree.root, 20);
        tree.root = tree.insertNode(tree.root, 30);
        tree.root = tree.insertNode(tree.root, 40);
        tree.root = tree.insertNode(tree.root, 50);
        tree.root = tree.insertNode(tree.root, 25);
        tree.inorderTraversal(tree.root);
        TreeNode troot=new TreeNode(10);
        troot.left=new TreeNode(5);
        troot.left.left=new TreeNode(1);
        troot.left.right=new TreeNode(6);
        troot.right=new TreeNode(15);
		
		System.out.println("\nNow dfs begins\n");
		tree.dfstraversal(troot);
		System.out.println("\n");
		tree.Search(tree.root, 25);
	}
}
