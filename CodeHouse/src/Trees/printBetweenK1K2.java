package Trees;

import java.util.concurrent.atomic.AtomicBoolean;

import Util.InputUtil;
import Util.Node;

public class printBetweenK1K2 {
	private void printAllInBetween(Node<Integer> node, int k1, int k2, AtomicBoolean found) {
		if(node == null) return;
		if(node.value == k1 || node.value == k2) {
			found.set(true);
			return;
		}
		
		printAllInBetween(node.left, k1, k2, found);
		printAllInBetween(node.right, k1, k2, found);
		
		if(found.get()) 
			System.out.println(node.value);
	}
	
	public static void main(String[] args) {
		printBetweenK1K2 obj = new printBetweenK1K2();
//		InputUtil.displayTree(InputUtil.getBST());
		obj.printAllInBetween(InputUtil.getBST(), 8, 25, new AtomicBoolean(false));
	}
}
