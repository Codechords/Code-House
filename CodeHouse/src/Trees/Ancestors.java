package Trees;

import Util.InputUtil;
import Util.Node;

public class Ancestors {
	private boolean printAncestors(Node<Integer> node, int value) {
		if(node == null) return false;
		if(node.value == value) return true;
		
		boolean found = printAncestors(node.left, value) || printAncestors(node.right, value);
		if(found) 
			System.out.println(node.value);
		return found;
	}
	
	public static void main(String[] args) {
		Ancestors ancestors = new Ancestors();
		ancestors.printAncestors(InputUtil.getTree(), 5);
	}
}
