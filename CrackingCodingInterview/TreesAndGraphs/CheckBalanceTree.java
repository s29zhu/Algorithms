package TreesAndGraphs;

/*
 * Implements a functions to check if a tree is balanced. For the purposes of this question,
 *  a balanced tree is defined to be a tree such that no two leaf nodes differ in distance from
 *  the root by more than one
 */
/*
 * 				1
 * 			/		\
 * 		   2		 3
 * 		  / \
 *		 4   5
 */
public class CheckBalanceTree {	
	public static boolean isTreeBalanced(TreeNode node) {
		System.out.println(min(node));
		System.out.println(max(node));
		if(Math.abs(min(node)-max(node))>1) return false;
		else return true;
	}	
	public static int min(TreeNode node) {
		int res=0;
		if(node==null) return 0;
		res=Math.min(min(node.left)+1, min(node.right)+1);
		return res;
	}
	public static int max(TreeNode node) {
		int res=0;
		if(node==null) return 0;
		res=Math.max(max(node.left)+1, max(node.right)+1);
		return res;
	}
	public static void main(String args[]) {
		TreeNode n1=new TreeNode(1), n2=new TreeNode(2), n3=new TreeNode(3),
				n4=new TreeNode(4), n5=new TreeNode(5); 
		n1.left=n2;
		n1.right=n3;
		n2.left=n4;
		n2.right=n5;
		System.out.print(isTreeBalanced(n1));
	}
}
