package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeSort {
public static int[] merge(int[] a1, int[] a2) {
		
		
		int lengthA1 = a1.length;
		int lengthA2 = a2.length;
		
		int ref1 = 0, ref2 = 0;
		int[] result = new int[lengthA1+lengthA2];
		for(int i = 0; i < result.length; ++i) {
				
			if(ref2 == a2.length || a1[ref1] < a2[ref2]) {
				result[i] = a1[ref1];
				ref1++;
			}	
			else if(ref1 == a1.length || a1[ref1] >= a2[ref2]){
				result[i] = a2[ref2];
				ref2++;
			}
			display(result);
		}
		
		return result;
		
	}
public static void display(int[] arr) {
	for(int i = 0; i < arr.length; ++i) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
}

public static void main(String[] args) throws NumberFormatException, IOException {
	
	BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
	
	
	int N = Integer.parseInt(k.readLine());
	String s1 = k.readLine();
	
	String[] a1 = s1.split(" ");
	int[] input1 = new int[N];
	for(int i = 0; i < N; ++i) {
		input1[i] = Integer.parseInt(a1[i]);
	}
	
	int M = Integer.parseInt(k.readLine());
	String s2 = k.readLine();
	
	String[] a2 = s2.split(" ");
	int[] input2 = new int[M];
	for(int i = 0; i < M; ++i) {
		input2[i] = Integer.parseInt(a2[i]);
	}
	
	int[] result = merge(input1, input2);
	display(result);
}

}
