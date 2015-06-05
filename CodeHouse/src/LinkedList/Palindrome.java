package LinkedList;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Palindrome {
	BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
	Node head;
	void createLinkedList() throws Exception {
		Node node = null;
		System.out.println("Enter the word");
		
		char c = (char)(k.read());
		k.readLine();
		
		while(c != '!') {
			if(node == null) 
				node = new Node();
			else {
				node.next = new Node();
				node = node.next;
			}
			if(head == null) 
				head = node;
			node.letter = c;
			c = (char)(k.read());
			k.readLine();
		}
	}
	void traverseList() {
		Node node = head;
		while (node != null) {
			System.out.print(node.letter);
			node = node.next;
		}
	}
	
	public static void main(String []args) throws Exception {
		Palindrome obj = new Palindrome();
		obj.createLinkedList();
		obj.traverseList();
		obj.ref = obj.head;
		obj.recurse(obj.head);
		if(obj.status == true) 
			System.out.println("Palindrome");
		else System.out.println("Not a palindrome");
	}
	
	Node ref;
	boolean status = true;
	
	void recurse(Node node) {
		if(node == null) return;
		recurse(node.next);
		if(node.letter != ref.letter) 
			status = false;
		ref = ref.next;
	}
}

class Node {
	public char letter;
	public Node next;
}
