package Trees;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import Util.InputUtil;
import Util.Node;

public class MaximumWidth {
	private int getMaxWidth(Node node) {
		
		Queue<Node> queue = new ArrayBlockingQueue<Node>(100);
		int prevLevelCount = 0, currLevelCount = 0, maxLevelCount = 0;
		
		queue.add(node);
		prevLevelCount ++;
		
		Node currNode;
		do {
			for(int i = 1; i <= prevLevelCount; ++i) {
				currNode = queue.remove();
				if(currNode.left != null) {
					queue.add(currNode.left);
					currLevelCount ++;
				}
				if(currNode.right != null) {
					queue.add(currNode.right);
					currLevelCount ++;
				}
			}
			
			if(currLevelCount > maxLevelCount) maxLevelCount = currLevelCount;
			prevLevelCount = currLevelCount;
			currLevelCount = 0;			
		} 
		while(!queue.isEmpty());
		return maxLevelCount;
	}
	
	public static void main(String[] args) {
		
		MaximumWidth maxWidth = new MaximumWidth();
		System.out.println(maxWidth.getMaxWidth(InputUtil.getTree()));
	}
}
