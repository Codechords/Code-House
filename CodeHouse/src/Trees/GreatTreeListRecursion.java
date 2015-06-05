package Trees;

import Util.InputUtil;
import Util.Node;

public class GreatTreeListRecursion {
	private Node<Integer> createList(Node<Integer> node) {
		
		MinMax minMaxNodes = new MinMax(null, null);
		getTreeToList(node, minMaxNodes);
		
		minMaxNodes.getMin().left = minMaxNodes.getMax();
		minMaxNodes.getMax().right = minMaxNodes.getMin();
		
		return minMaxNodes.getMin();
		
	}
 	private void getTreeToList(Node<Integer> node, MinMax minMaxNodes) {
		
		if(node == null) return;
		
		MinMax leftMinMaxNode = new MinMax(null, null);
		MinMax rightMinMaxNode = new MinMax(null, null);
		
		getTreeToList(node.left, leftMinMaxNode);
		getTreeToList(node.right, rightMinMaxNode);
		
		node.left = leftMinMaxNode.getMax();
		node.right = rightMinMaxNode.getMin();
		
		if(node.left != null) 
			node.left.right = node;
		if(node.right != null) 
			node.right.left = node;
		
		minMaxNodes.setMin(leftMinMaxNode.getMin() != null ? leftMinMaxNode.getMin() : node);
		minMaxNodes.setMax(rightMinMaxNode.getMax() != null ? rightMinMaxNode.getMax() : node);
	}
 	
 	public static void main(String[] args) {
 		Node<Integer> node = InputUtil.getBST();
 		
// 		InputUtil.displayTree(node);
 		GreatTreeListRecursion obj = new GreatTreeListRecursion();
 		node = obj.createList(node);
 		InputUtil.displayDLL(node);
 		
 	}
}

class MinMax {
	
	private Node<Integer> min;
	private Node<Integer> max;
	
	public MinMax(Node<Integer> min, Node<Integer> max) {
		super();
		this.min = min;
		this.max = max;
	}

	public Node<Integer> getMin() {
		return min;
	}

	public void setMin(Node<Integer> min) {
		this.min = min;
	}

	public Node<Integer> getMax() {
		return max;
	}

	public void setMax(Node<Integer> max) {
		this.max = max;
	}

}
