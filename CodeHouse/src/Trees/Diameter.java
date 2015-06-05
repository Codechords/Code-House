package Trees;

import java.util.concurrent.atomic.AtomicInteger;

import Util.InputUtil;
import Util.Node;

public class Diameter {
	private int getDiameter(Node root, AtomicInteger height) {
		
		if (root == null ) return 0;
		
		int leftDiameter, rightDiameter;
		AtomicInteger leftHeight = new AtomicInteger(0);
		AtomicInteger rightHeight = new AtomicInteger(0);
		
		leftDiameter = getDiameter(root.left, leftHeight);
		rightDiameter = getDiameter(root.right, rightHeight);
		height.set(max(leftHeight.get(), rightHeight.get()) + 1);
		
		return max(leftDiameter, rightDiameter, leftHeight.get() + rightHeight.get() + 1);
	}
	
	private int max(int... arg) {
		
		int maxValue = Integer.MIN_VALUE;
		
		for(int i=0; i<arg.length; ++i) {
			if(i == 0) maxValue = arg[i];
			if(arg[i] > maxValue) maxValue = arg[i];
		}
		
		return maxValue;
	}
	
	public static void main(String [] args) {
		Diameter diameter = new Diameter();
		AtomicInteger height = new AtomicInteger(0);
		System.out.println(diameter.getDiameter(InputUtil.getTree(), height));
	}
}
