package Trees;

public class TST {
	private TNode insert(TNode node, String word, int index) {
		
		if(node == null) {
			node = new TNode(word.charAt(0));
		}
		
		if(index == (word.length()-1)) {
			node.isWord = true;
			return node;
		}
		
		if(node.value == word.charAt(index)) {
			if(node.equal == null) {
				node.equal = new TNode(word.charAt(index+1));
			}
			insert(node.equal, word, index + 1);
		}
		else if(word.charAt(index) < node.value) {
			if(node.left == null) {
				node.left = new TNode(word.charAt(index));
			}
			insert(node.left, word, index);
		}
		else {
			if(node.right == null) {
				node.right = new TNode(word.charAt(index));
			}
			insert(node.right, word, index);
		}
		return node;
			
	}

	private void displayTST(TNode node, String word) {
		
		if(node == null) return;
		if(word == null) word = new String();
		
		displayTST(node.left, word);
		displayTST(node.equal, new String(word+node.value));
		displayTST(node.right, word);
		
		if(node.isWord)
			System.out.println(word + node.value);
		
		
	}
	
	public static void main(String[] args) {
		TST tst = new TST();
		TNode node = tst.insert(null, "mitul", 0);
		node = tst.insert(node, "ramesh", 0);
//		node = tst.insert(node, "mitali", 0);
		node = tst.insert(node, "ramu", 0);
//		node = tst.insert(node, "kaka", 0);
//		node = tst.insert(node, "kuki", 0);
		tst.displayTST(node, null);
	}
}
class TNode {
	
	public char value;
	public TNode left;
	public TNode right;
	public TNode equal;
	public boolean isWord;
	
	TNode(char value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "TNode [value=" + value + ", left=" + left + ", right=" + right
				+ ", equal=" + equal + "]";
	}
	
	
}
