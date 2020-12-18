package TreesAndGraphs;

import java.util.Stack;

public class PostOrderTraversal {
	public static void postOrderTransversal(TreeNode node) {
		TreeNode np=node, top=null;
		Stack<TreeNode> stack=new Stack<TreeNode>();
		System.out.print("post-order traversal: ");
		if(node==null) return;
		do{ 
			while (np!=null) { 		            
				if (np.right!=null) {
					stack.push(np.right); 
				}
				stack.push(np);  	
				np=np.left;
		    }
		    np=stack.pop();
		    if(stack.isEmpty()) top=null;
		    else top=stack.peek();
		    if (np.right!=null && np.right == top) { 
	            stack.pop();   
	            stack.push(np);   
	            np=np.right; 
		    }else{ 
	            System.out.print(np.val);
	            np=null; 
		    } 
		} while (stack.isEmpty()==false);
	}
	public static void main(String args[]) {
		/*
		 * 				1
		 * 			/		\
		 * 		   2		 3
		 * 		  / \
		 *		 4   5
		 */
		TreeNode n1=new TreeNode(1), n2=new TreeNode(2), n3=new TreeNode(3),
				n4=new TreeNode(4), n5=new TreeNode(5); 
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		postOrderTransversal(n1);
	}
}
