
package Arrays;
	import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

	public class TestClass {
		  public static void main(String[] args) throws IOException {
			   int N=0;
			   int M=0;
			   
			   Scanner scanner = new Scanner(System.in);
			   
			   N = scanner.nextInt();
			   
			   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		       String line = br.readLine();
		       String[] str = line.split(" ");
		       
		       int[] arrayA = new int[N];
		       for(int n = 0; n < str.length; n++) {
		    	   arrayA[n] = Integer.parseInt(str[n]);
			    }
			
	
		       M = scanner.nextInt();
		       line = br.readLine();
		       str = line.split(" ");
		       
		       int[] arrayB = new int[M];
		       for(int i = 0; i < M; i++)
				  arrayB[i] = Integer.parseInt(str[i]);
				
			    
			  
		       int[] arrayC = new int[N+M];

		    
		    
		    
		    
		    merge(arrayA, arrayA.length, arrayB, arrayB.length, arrayC);
		    for (int i : arrayC) {
		      System.out.println(i);

		    }
		  }

		  public static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB, int[] arrayC) {
		    int arrayAIndex = 0, arrayBIndex = 0, arrayCIndex = 0;

		    while (arrayAIndex < sizeA && arrayBIndex < sizeB)
		      if (arrayA[arrayAIndex] < arrayB[arrayBIndex])
		        arrayC[arrayCIndex++] = arrayA[arrayAIndex++];
		      else
		        arrayC[arrayCIndex++] = arrayB[arrayBIndex++];

	    	while (arrayAIndex < sizeA)
		    		arrayC[arrayCIndex++] = arrayA[arrayAIndex++];

		    while (arrayBIndex < sizeB)
		      arrayC[arrayCIndex++] = arrayB[arrayBIndex++];
		  }
		}
