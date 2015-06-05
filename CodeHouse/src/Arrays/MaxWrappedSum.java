package Arrays;

import Util.InputUtil;

public class MaxWrappedSum {
	private int getMaxWrappedSum(int arr[]) {
		int minSum = getMinSum(arr);
		int totalSum = getMaxSum(arr);
		System.out.println(minSum + " " + totalSum);
		return  (minSum < 0 ? -minSum:0) + totalSum;
	}

	private int getMaxSum(int[] arr) {
		
		int sum = arr[0];
		for(int i = 1; i < arr.length; ++i) {
			sum += arr[i];
		}
		return sum;
	}

	private int getMinSum(int[] arr) {
		
		int min = arr[0];
		int prevMin = arr[0];
		
		for(int i = 1; i < arr.length; ++i) {
			if(arr[i] + prevMin < arr[i]) {
				prevMin = arr[i] + prevMin;
			}
			else prevMin = arr[i];
			if(prevMin < min)
				min = prevMin;
		}
		return min;
	}
	
	public static void main(String[] args) {
		MaxWrappedSum maxWrappedSum = new MaxWrappedSum();
		System.out.println(maxWrappedSum.getMaxWrappedSum(new int[]{-1, 40, -14, 7, 6, 5, -4, -1}));
	}
	
}
