package Trees;

import Util.InputUtil;
import Util.Node;

public class NodesAtKDistance {
	
	private int kValue;
	private void printNodes(Node node, int k) {
		
		if(node == null)
			return;
		
		if(k == kValue) {
			System.out.println(node.value);
			return;
		}
		
		printNodes(node.left, k+1);
		printNodes(node.right, k+1);
	}
	
	public static void main(String[] args) {
		NodesAtKDistance nodesAtKDistance = new NodesAtKDistance();
		nodesAtKDistance.kValue = 3;
		
		nodesAtKDistance.printNodes(InputUtil.getTree(), 0);
	}
}
