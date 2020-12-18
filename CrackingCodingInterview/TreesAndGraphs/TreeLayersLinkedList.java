package TreesAndGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import TreesAndGraphs.TreeNode;
/*
 * Create Linked lists for each of the tree layer
 * If the tree has D layers, there would be D linked lists
 */
public class TreeLayersLinkedList {
	
	public static ArrayList<Node> createLinkedLists(TreeNode node){
        Queue<TreeNode> q1 = new LinkedList<TreeNode>(), q2 = new LinkedList<TreeNode>();        
        ArrayList<Node> res = new ArrayList<Node>();
        Node temp=null, n=null;
        TreeNode np=node;
        
        q2.add(np);
        while(true){
            while(q2.isEmpty()==false){
                np=q2.poll();
                n = new Node(np.val);
                n.next = temp;
                temp=n;
                if(np.left != null) q1.add(np.left);
                if(np.right != null) q1.add(np.right);
            }
            
            if(n != null) res.add(n);
            temp = null;
            n = null;
            while(q1.isEmpty()==false){
                np = q1.poll();
                n = new Node(np.val);
                n.next = temp;
                temp = n;
                if(np.left!=null) q2.add(np.left);
                if(np.right!=null) q2.add(np.right);
            }
            if(n != null) res.add(n);
            temp = null;
            n = null;
            if(q1.isEmpty() && q2.isEmpty()) break;
        }
        return res;
    }
	
	public static void main(String args[]) {
    	TreeNode root= new TreeNode(1);
    	TreeNode l= new TreeNode(2);
    	TreeNode r= new TreeNode(2);
    	TreeNode l1= new TreeNode(3);
    	TreeNode l2= new TreeNode(4);
    	TreeNode r1= new TreeNode(4);
    	TreeNode r2= new TreeNode(3);
    	root.left=l;
    	root.right=r;
    	l.left=l1;
    	l.right=r1;
    	r.left=l2;
    	r.right=r2;
    	l1.left=null;
    	l1.right=null;
    	r1.left=null;
    	r1.right=null;
    	l2.left=null;
    	l2.right=null;
    	r2.left=null;
    	r2.right=null;
    	
    	for(Node node:createLinkedLists(root)) {
    		while(node != null) {
    			System.out.print(node.val);
    			node=node.next;
    		}
    		System.out.println(" ");
    	};
	}
}
