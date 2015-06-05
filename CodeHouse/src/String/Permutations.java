package String;

import java.util.ArrayList;

public class Permutations {
	private ArrayList<String> getPermutation(String x, int index) {
		if(x == null) return null;
		if(index == 0) {
			ArrayList list = new ArrayList<String>();
			list.add(String.valueOf(x.charAt(index)));
			return list;
		}
		
		ArrayList<String> list = getPermutation(x, index - 1);
		processArray(list, index, x);
		return list;
	}

	private void processArray(ArrayList<String> list, int index, String x) {
		
		int size = list.size();
		for(int i = 0; i < size; ++i) {
			String m = list.get(i);
			String s = String.valueOf(x.charAt(index));
			
			list.add(s.concat(m));
			for(int j = 0; j < m.length() ; ++j) {
				list.add(m.substring(0, j+1).concat(String.valueOf(s).concat(m.substring(j+1))));
			}
		}
		for(int i= 0; i < size; ++i) {
			list.remove(0);
		}
		
	}
	
	public static void main(String[] args) {
		Permutations permutations = new Permutations();
		System.out.println(permutations.getPermutation("mitul", 4).size());
		
	}
}
