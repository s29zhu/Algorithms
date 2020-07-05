package TreesAndGraphs;

public class RouteBetweenTwoNodes {
	public static boolean accessible(GraphNode [] graph, int a, int b) {
		boolean res=false;
		return res;
	}
	public static void main(String args[]) {
		GraphNode g1= new GraphNode(); g1.val=1;
		GraphNode g2= new GraphNode(); g2.val=2;
		GraphNode g3= new GraphNode(); g3.val=3;
		GraphNode g4= new GraphNode(); g4.val=4;
		g1.neighbors.add(g2);
		g1.neighbors.add(g3);
		g4.neighbors.add(g1);
		/*
		 * 4 -- > 1 --> 2
		 *  		<-->3  
		 */
	}
}
