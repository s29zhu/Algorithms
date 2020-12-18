package TreesAndGraphs;

import java.util.Stack;

public class PreOrderTraversal {
	public static void preOrderTransversal(TreeNode node) {
		TreeNode np=node;
		Stack<TreeNode> stack=new Stack<TreeNode>();
		System.out.print("pre-order traversal: ");
		if(node==null) return;
		stack.push(node);
		while(stack.empty() == false) {
			System.out.print(stack.peek().val);
			np=stack.pop();
			if(np.right!=null) {
				stack.push(np.right);
			}
			if(np.left!=null){
				stack.push(np.left);
			}
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
		preOrderTransversal(n1);
	}
}
