package Arrays;

public class Xor {
	private static int getXor(int arr[]) {
		int xorValue = arr[0];
		for(int i=0; i<arr.length; ++i) {
			if(i==0)
				xorValue = arr[i];
			else 
				xorValue = xorValue ^ arr[i];
		}
		return xorValue;
	}
	public static void main(String []args) {
		int arr[] = {1,1 ,6 ,4 ,5 ,6, 5};
		System.out.println(getXor(arr));
		
	}
}
