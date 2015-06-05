package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * Find n greatest numbers from an array of numbers
 */
public class nGreatestNums {
	public void nGreatest(int arr[], int n) {
		int nGreat[] = new int[n];
		
		for(int i=0; i<n; ++i) {
			nGreat[i] = arr[i];
		}
		
		int min;
		for(int i=n; i<arr.length; ++i) {
			min = getMin(nGreat);
			if(arr[i] > nGreat[min]) {
				nGreat[min] = arr[i];
				min = getMin(nGreat);
			}
		}
		
		for(int i=0; i<nGreat.length; ++i) {
			System.out.print(nGreat[i] + " ");
		}
	}
	
	public int getMin(int arr[]) {
		int min = 0;
		for(int i=0; i<arr.length; ++i) {
			if(i==0)min = i;
			else if (arr[i] < arr[min]) min = i;			
		}
		
		return min;
	}
	public static void main(String []args) {
		BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
		nGreatestNums obj = new nGreatestNums();
		
		int n = 5;
		int arr[] = {6,7,8,9,10,1,2,3,4,5};
		obj.nGreatest(arr, n);
	}
}
