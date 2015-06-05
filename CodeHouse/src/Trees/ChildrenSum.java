package Trees;

import java.util.concurrent.atomic.AtomicBoolean;

import Util.InputUtil;
import Util.Node;

public class ChildrenSum {
	private boolean checkIfChildrenSumTree(Node root) {
		
		AtomicBoolean flag = new AtomicBoolean(true);
		postOrderTraverse(root, flag);
		
		if(flag.get())
			return true;
		else return false;
	}
	
	private int postOrderTraverse(Node<Integer>node, AtomicBoolean flag) {
		if(node == null) return 0;
		
		int leftValue = postOrderTraverse(node.left, flag);
		int rightValue = postOrderTraverse(node.right, flag);
		
		if (node.value != (leftValue + rightValue))
			flag.set(false);
		
		return node.value;
	}
	
	public static void main(String []args) {
		ChildrenSum childrenSum = new ChildrenSum();
		
		System.out.println(childrenSum.checkIfChildrenSumTree(InputUtil.getTree()));
		}
}
