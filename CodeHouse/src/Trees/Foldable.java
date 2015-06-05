package Trees;

import Util.InputUtil;
import Util.Node;

public class Foldable {
	private boolean isFoldable(Node node) {
		if(node == null) return true;
		return areMirrorImages(node.left, node.right);
	}
	
	private boolean areMirrorImages(Node left, Node right) {
		if(left == null && right == null) return true;
		if((left == null && right != null) || (left != null && right == null))
			return false;
		
		return areMirrorImages(left.left, right.right) && areMirrorImages(left.right, right.left);
	}
	
	public static void main(String[] args) {
		Foldable foldable = new Foldable();

		System.out.println(foldable.isFoldable(InputUtil.getTree()));
	}
}
