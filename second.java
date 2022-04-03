
/*
                  120
                 2      240
               1  1.5 223 256
             23               890  
 */



package brijeshdsa;

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode() {
	
	}
	public TreeNode(int x) {
		this.val=x;
		this.left=null;
		this.right=null;
	}
}
class Bst{
	
	public TreeNode insertValue(TreeNode root,int va) {
		if(root==null) {
		 root=new TreeNode(va);
		 return root;
		}
		
		if(root.val<va) {
			root.right=insertValue(root.right,va);
		}
		if(root.val>va) {
			root.left=insertValue(root.left,va);
		}
		return root;
	}
	public void InorderTraversal(TreeNode root) {
        if(root==null) {
        	return;
        }
		InorderTraversal(root.left);
		System.out.print(root.val+" ");
		InorderTraversal(root.right);
	}
	
	public void PreOrderTraversal(TreeNode root) {
		if(root==null) {
			return;
		}
		System.out.print(root.val+" ");
		PreOrderTraversal(root.left);
		PreOrderTraversal(root.right);
		
	}
	public void PostOrderTraversal(TreeNode root) {
		if(root==null) {
			return ;
		}
		PostOrderTraversal(root.left);
		PostOrderTraversal(root.right);
		System.out.print(root.val+" ");
	}
	public void Search(TreeNode root,int sval) {
		if(root==null) {
			System.out.println("value does not exist");
			return;
		}
		if(root.val==sval) {
			System.out.println("the value is found : "+ sval);
			return;
		}
		if(root.val<sval) {
			Search(root.right,sval);
		}
		if(root.val>sval) {
			Search(root.left,sval);
		}
	}
//	public TreeNode DeleteNode(TreeNode root,int dval) {
//		TreeNode temp=root;
//		if(temp.val==dval) {
//			if(temp.left==null && temp.right==null) {
//				temp=null;
//			}
//			else if(temp.right!=null && temp.left==null ) {
//				temp=temp.right;
//			}
//			else if(temp.right==null && temp.left!=null) {
//				temp=temp.left;
//			}
//			else if(temp.right!=null && temp.left!=null) {
//				if(temp.right.left==null &&temp.right.right==null) {
//					temp=temp.right;
//				}
//				else if(temp.right.left.left==null && temp.right.left.right==null) {
//					temp=temp.right.left;
//				}
//				else if(temp.right.left.left!=null && temp.right.left.right==null) {
//					temp=temp.right.left;
//					temp.right=temp.right.left.left;
//				}
//				else if(temp.right.left.left==null && temp.right.left.right!=null) {
//					temp=temp.right.left;
//					temp.right=temp.right.left.right;
//				}
//				
//			}
//		}
//		if(temp.val<dval) {
//			DeleteNode(temp.left,dval);
//		}
//		if(temp.val>dval) {
//			DeleteNode(temp.right,dval);
//		}
//		
//		return root;
//	}
	public int minValue(TreeNode root)
    {
        int minv = root.val;
        while (root.left != null)
        {
            minv = root.left.val;
            root = root.left;
        }
        return minv;
    }
	public int maxValue(TreeNode root) {
		int maxv=root.val;
		while(root.right!=null) {
			maxv=root.right.val;
			root=root.right;
		}
		return maxv;
	}
  
   public  TreeNode deleteRec(TreeNode root, int key)
    {
        /* Base Case: If the tree is empty */
        if (root == null)
            return root;
 
        /* Otherwise, recur down the tree */
        if (key < root.val)
            root.left = deleteRec(root.left, key);
        else if (key > root.val)
            root.right = deleteRec(root.right, key);
 
        // if key is same as root's
        // key, then This is the
        // node to be deleted
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
 
            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            root.val = minValue(root.right);
 
            // Delete the inorder successor
            root.right = deleteRec(root.right, root.val);
        }
 
        return root;
    }
	
}
public class second {
   public static void main(String [] args) {
	   TreeNode root=new TreeNode(120);
	   Bst binarse=new Bst();
	   binarse.insertValue(root, 240);
	   binarse.insertValue(root, 56);
	   binarse.insertValue(root, 5);
	   binarse.insertValue(root, 500);
	   binarse.insertValue(root, 40);
	   binarse.insertValue(root, 10);
	   binarse.insertValue(root, 1000);
	   binarse.InorderTraversal(root);
	   System.out.println("\n*****************************\n");
	   binarse.PreOrderTraversal(root);
	   System.out.println("\n*****************************\n");
	   binarse.PostOrderTraversal(root);
	   System.out.println("\nLets Search for 400 ");
	   binarse.Search(root, 400);
	   
	   System.out.println("trying to delete the specific node from the bst");
	  TreeNode newroot= binarse.deleteRec(root, 120);
	  System.out.println("Printing after deletion of 120\n");
	  binarse.InorderTraversal(newroot);
	   brijeshdsa.first.go();
	   System.out.println("\nGoing to print the max value from the tree\n");
	   int a=binarse.maxValue(newroot);
	   System.out.println(a);
	   
   }
}
