package TreesAndGraphs;

import java.util.Stack;

public class InOrderTraversal {
	public static void inOrderTransversal(TreeNode node) {
		TreeNode np=node;
		Stack<TreeNode> stack=new Stack<TreeNode>();
		System.out.print("in-order tranversal: ");
		if(node==null) return;
		while(stack.empty() == false || np !=null) {
			while(np!=null){
				stack.push(np);
				np=np.left;
			}
			np=stack.pop();
			System.out.print(np.val);	
			np=np.right;
		}			
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
		inOrderTransversal(n1);
	}
}
