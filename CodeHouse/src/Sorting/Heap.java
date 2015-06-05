package Sorting;

public class Heap {
	private int heapSize;
	private int arr[];
	
	private int left(int i) {
		int left = 2*i + 1;
		if(left < heapSize)
			return left;
		else return i;
	}
	
	private int right(int i) {
		int right = 2*i + 2;
		if(right < heapSize)
			return right;
		else return i;
	}
	
	private int findMax(int index) {
		int left = left(index);
		int right = right(index);
		int max;
		
		if(arr[left] > arr[right])
			max = left;
		else max = right;
		
		if(arr[max] > arr[index])
			return max;
		else return index;
	}
	
	private void swap(int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
	}
	
	private void maxHeapify(int index) {
		if(index < heapSize) {
			
			int max = findMax(index);
			if(max == index) return;
			
			swap(index, max);
			maxHeapify(max);			
		}
	}
	
	private void buildMaxHeap() {
		int n = arr.length;
		heapSize = n;
		
		for(int i=n/2; i>=0; --i) {
			maxHeapify(i);
		}	
	}
	
	private void printHeap() {
		for(int i=0; i<arr.length; ++i) {
			System.out.println(arr[i] + " ");
		}
	}
	
	private void heapSort() {
		while(heapSize != 0) {
			swap(heapSize -1, 0);
			heapSize --;
			maxHeapify(0);
		}
	}
	
	public static void main(String[]args) {
		int arr[] = {1,2 ,3 ,4 ,5 ,6};
		
		Heap heap = new Heap();
		heap.arr = arr;
		
		heap.buildMaxHeap();
		heap.heapSort();
		heap.printHeap();
	}
}
