package Util;

public class Node<T> {
	
	public Node left;
	public Node right;
	public T value;
	
	@Override
	public String toString() {
		return "Node [left=" + left + ", right=" + right + ", value=" + value
				+ "]";
	}
}
