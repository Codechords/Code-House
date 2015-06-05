package Trees;

import Util.InputUtil;
import Util.Node;

public class GreatestIndependentSet {
	
	private int getGIS(Node<Integer> node) {
		
		if(node == null) return 0;
		
		int leftGGIS = 0, rightGGIS = 0;
		if(node.left != null){
			leftGGIS = getGIS(node.left.left) + getGIS(node.left.right);
		}
		if(node.right != null){
			rightGGIS = getGIS(node.right.left) + getGIS(node.right.right);
		}
		
		return InputUtil.max(getGIS(node.left) + getGIS(node.right), 1 + leftGGIS + rightGGIS);
	}
	
	public static void main(String[] args) {
		GreatestIndependentSet greatestIndependentSet = new GreatestIndependentSet();
		System.out.println(greatestIndependentSet.getGIS(InputUtil.getTree()));
		InputUtil.displayTree(InputUtil.getTree());
	}
}
