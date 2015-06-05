package Util;

public class InputUtil {
	
	public static int[] getArray() {
		int arr[] = {7, 8, 3, 9, 4, 6};
		return arr;
	}
	
	public static int[] getSortedArray() {
		int arr[] = {1, 2, 3, 4, 5, 6};
		return arr;
	}
	public static Node getBST() {
		Node<Integer> node = new Node<Integer>();
		node.value = 10;
		
		node.left = new Node<Integer>();
		node.right = new Node<Integer>();
		node.left.value = 5;
		node.right.value = 22;
		
		Node left = node.left;
		left.left = new Node<Integer>();
		left.right = new Node<Integer>();
		left.left.value = 3;
		left.right.value = 8;
		
		Node right = left.right;
		right.left = new Node<Integer>();
		right.right = new Node<Integer>();
		right.left.value = 7;
		right.right.value = 9;
		
		right = node.right;
		right.left = new Node<Integer>();
		right.right = new Node<Integer>();
		right.left.value = 20;
		right.right.value = 25;
		
		right.right.right = new Node<Integer>();
		right.right.right.value = 30;
		
		return node;
		
	}
	public static Node getTree() {
		Node<Integer> node = new Node<Integer>();
		node.value = 2;
		
		node.left = new Node<Integer>();
		node.right = new Node<Integer>();
		node.left.value = 3;
		node.right.value = 9;
		
		Node left = node.left;
		left.left = new Node<Integer>();
		left.right = new Node<Integer>();
		left.left.value = 7;
		left.right.value = 6;
		
		Node right = node.right;
		right.left = new Node<Integer>();
		right.right = new Node<Integer>();
		right.left.value = 5;
		right.right.value = 11;
		
		left = left.right;
		left.left = new Node<Integer>();
		left.right = new Node<Integer>();
		left.left.value = 8;
		left.right.value = 1;
		
		return node;
	}
	
	public static void displayTree(Node root) {
		
		if(root == null) return;
		
		displayTree(root.left);
		System.out.println(root.value);
		displayTree(root.right);
	}
	
	public static void displayDLL(Node<Integer> node) {
		
		Node firstNode = node;
		
		do {
			System.out.print(node.value + " ");
			node = node.right;
		}
		while(node != firstNode);
	}
	public static int max(int... args) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < args.length; ++i) {
			if(i == 0) max = args[i];
			if(args[i] > max) max = args[i];
		}
		return max;
	}
}
