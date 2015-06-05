package Trees;

import Util.InputUtil;
import Util.Node;

public class LeafNodes {
	private int findLeafNodes(Node root) {
		
		if(root == null) return 0;
		if(root.left == null && root.right == null)
			return 1;
		
		return findLeafNodes(root.left) + findLeafNodes(root.right);
		
	}
	
	public static void main(String [] args) {
		Node root = InputUtil.getTree();
		
//		InputUtil.displayTree(root);
		LeafNodes leafNodes = new LeafNodes();
		System.out.println(leafNodes.findLeafNodes(root));
	}
}
