package Trees;

import Util.InputUtil;
import Util.Node;

public class DoubleTree {
	private Node getDoubleTree(Node node) {
		
		if(node == null) return null;
		
		Node leftNode = getDoubleTree(node.left);
		Node rightNode = getDoubleTree(node.right);
		
		node.left = new Node<>();
		node.left.value = node.value;
		
		node.left.left = leftNode;
		node.right = rightNode;
		
		return node;	
	}
	
	public static void main(String[] args) {
		DoubleTree doubleTree = new DoubleTree();
//		InputUtil.displayTree(InputUtil.getTree());
		InputUtil.displayTree(doubleTree.getDoubleTree(InputUtil.getTree()));
	}
}
