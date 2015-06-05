package Arrays;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import Util.InputUtil;

public class MaxKElements {
	private static void getMaxKElements(int arr[], int k) {
		int length = arr.length;
		LinkedList<Integer> queue = new LinkedList<Integer>();
		

		for(int i=0; i<length; ++i) {
			if(i==0) {
				queue.push(arr[i]);
				continue;
			}
			queue.push(arr[i]);
			if(queue.size() > k)
				queue.removeLast();
			if(arr[i] > queue.peekLast())
				while(arr[i] != queue.peekLast()) {
					queue.removeLast();
				}
			if(i >= k-1)
				System.out.println(queue.peekLast());
//			System.out.println(queue.toString());
		}
	}
	
	public static void main(String [] args) {
		
		MaxKElements.getMaxKElements(InputUtil.getArray(), 2);
//		int arr[] = InputUtil.getArray();
//		LinkedList<Integer> queue = new LinkedList<Integer>();
//		queue.push(1);
//		queue.push(2);
//		System.out.println(queue.toString());
//		System.out.println(queue.peekLast());
//		queue.removeLast();
//		System.out.println(queue.toString());
	}
}
