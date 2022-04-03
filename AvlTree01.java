package brijeshdsa;
class TreeNode01{
	int val,height;
	TreeNode01 left,right;
	public TreeNode01(int val) {
		this.val=val;
		this.left=null;
		this.right=null;
		this.height=1;
	}
}
public class AvlTree01 {
   TreeNode01 root;
   public int max(int a,int b) {
	   return a>b?a:b;
   }
   
   public int getHeight(TreeNode01 node) {
	   if(node==null) {
		   return 0;
	   }
	   else {
		   return node.height;
	   }
   }
   
   public TreeNode01 leftRotate(TreeNode01 y) {
	   TreeNode01 x=y.right;
	   TreeNode01 T2=y.left;
	   x.left=y;
	   y.right=T2;
	   x.height=max(getHeight(x.left),getHeight(x.right))+1;
	   y.height=max(getHeight(y.left),getHeight(y.right))+1;
	   return x;
	   
   }
   public TreeNode01 rightRotate(TreeNode01 y) {
	   TreeNode01 x=y.left;
	   TreeNode01 T2=y.right;
	   x.right=y;
	   y.left=T2;
	   x.height=max(getHeight(x.left),getHeight(x.right))+1;
	   y.height=max(getHeight(y.left),getHeight(y.right))+1;
	   return x;
	   
   }
   public int checkBalance(TreeNode01 node) {
	  if(node==null) {
		  return 0;
	  }
	  else {
		  return(getHeight(node.left)-getHeight(node.right));
	  }
	   
   }
   public TreeNode01 insertNode(TreeNode01 root,int data) {
	   if(root==null) {
		   return new TreeNode01(data);
		 
	   }
	   else if(root.val>data) {
		   root.left=insertNode(root.left,data);
	   }
	   else if(root.val<data) {
		   root.right=insertNode(root.right,data);
	   }
	   else {
		   return root;
	   }
	   root.height=1+max(getHeight(root.left),getHeight(root.right));
	   int balance=checkBalance(root);
	   if(balance>1 && root.left.val>data) {
		   return rightRotate(root);
	   }
	   else if(balance>1 && root.left.val<data) {
		   root.left=leftRotate(root.left);
		   return rightRotate(root);
	   }
	   else if(balance<-1 && root.right.val<data) {
		   return leftRotate(root);
	   }
	   else if(balance<-1 && root.right.val>data) {
		   root.right=rightRotate(root.right);
		   return leftRotate(root);
	   }
	   return root;
	   
   }
   public void inorderTraversal(TreeNode01 root) {
	   if(root==null) {    
   		return;
   	}
   	System.out.print(root.val+" ");
   	inorderTraversal(root.left);
   	inorderTraversal(root.right);
	   
   }
   public static void main(String [] args) {
	   AvlTree01 tree = new AvlTree01();
  	 
       /* Constructing tree given in the above figure */
       tree.root = tree.insertNode(tree.root, 10);
       tree.root = tree.insertNode(tree.root, 20);
       tree.root = tree.insertNode(tree.root, 30);
       tree.root = tree.insertNode(tree.root, 40);
       tree.root = tree.insertNode(tree.root, 50);
       tree.root = tree.insertNode(tree.root, 25);
		tree.inorderTraversal(tree.root);
		System.out.println("\n");
//		tree.Search(tree.root, 25);
	  
   }
}
