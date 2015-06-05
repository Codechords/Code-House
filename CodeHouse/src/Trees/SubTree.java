package Trees;

import Util.InputUtil;
import Util.Node;

public class SubTree {
	private boolean checkIfSubTree(Node node, Node subTreeNode) {
		
		if((node == null && subTreeNode != null) || (node != null && subTreeNode == null))
			return false;
		Node subNodeFromNode = getSubTreeNode(node, subTreeNode);
		return checkIfSubTreeExists(subNodeFromNode, subTreeNode);
	}
	
	private Node getSubTreeNode(Node node, Node subTreeNode) {
		if(node == null) return null;
		
		if(node.value == subTreeNode.value) return node;
		
		Node leftNode = getSubTreeNode(node.left, subTreeNode);
		if(leftNode != null) return leftNode;
		return getSubTreeNode(node.right, subTreeNode);
	}
	
	private boolean checkIfSubTreeExists(Node node, Node subTreeNode) {
		if(node == null && subTreeNode == null) 
			return true;
		if((node == null && subTreeNode != null) || (node != null && subTreeNode == null))
			return false;
		
		if(node.value != subTreeNode.value) return false;
		
		return checkIfSubTree(node.left, subTreeNode.left) && checkIfSubTree(node.right, subTreeNode.right);
		
		
	}
	
	public static void main(String[] args) {
		SubTree subTree = new SubTree();
		System.out.println(subTree.checkIfSubTree(InputUtil.getTree(), InputUtil.getBST()));
	}
}
