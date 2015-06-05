package Arrays;

public class BinarySearch {
	
	static int arr[] = new int[10];
	
	public void binarySearch(int left, int right, int value) {
		if(left>right) {
			System.out.println("Value not found in the array");
			return;
		}
		
		int mid = (left+right)/2;
		if(arr[mid] == value) System.out.println("Value found at index " + mid);
		else if (arr[mid] > value)
			binarySearch(left, mid-1, value);
		else binarySearch(mid + 1, right, value);		
	}
	
	public static void main(String []args) {
		int arr[] = {1,2 ,3 ,4 ,5 ,6};
		
		BinarySearch bs = new BinarySearch();
		bs.arr = arr;
		
		bs.binarySearch(0, 5, 8);
	}
}
