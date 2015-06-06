package DP;

import Util.InputUtil;

public class Lcs {
	
	int[][] lcs = null;
	private int getLcs(String s1, String s2) {
		
		int ls1 = s1.length();
		int ls2 = s2.length();
		lcs = new int[ls1+1][ls2+1];
		
		for(int i=0; i <= ls1; ++i) {
			for(int j=0; j <= ls2; ++j) {
				
				if(i ==0 || j == 0)
					lcs[i][j] = 0;
				else if(s1.charAt(i-1) == s2.charAt(j-1))
					lcs[i][j] = 1 + lcs[i-1][j-1];
				else 
					lcs[i][j] = InputUtil.max(lcs[i-1][j], lcs[i][j-1]);
			}
		}
		return lcs[s1.length()][s2.length()];
	}
	
	private void printLcs(String s1, String s2) {
		
		int ls1 = s1.length();
		int ls2 = s2.length();
		
		while(!(ls1 == 0 || ls2 == 0)) {
			
			if(lcs[ls1][ls2] == lcs[ls1-1][ls2-1] + 1) {
				System.out.println(s1.charAt(ls1-1));
				ls1 --; ls2 --;
			}
			else {
				if(lcs[ls1][ls2] == lcs[ls1-1][ls2])
					ls1 --;
				else ls2 --;
			}	
		}
	}
	
	public static void main(String[] args) {
		Lcs obj = new Lcs();
		System.out.println(obj.getLcs("Mitul", "Piously"));
		obj.printLcs("Mitul", "Piously");
	}
 }
