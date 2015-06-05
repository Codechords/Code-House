package Arrays;

public class SortedMatrix {
	
	int x;
	int y;
	int arr[][];
	
	SortedMatrix(int x, int y) {
		this.x = x;
		this.y = y;
		arr = new int[x][y];
		
		int counter = 0;
		for(int i=0; i<x; ++i) {
			for(int j=0; j<y; ++j) {
				arr[i][j] = ++counter;
			}
		}
	}
	private void displayMatrix() {
		for(int i=0; i<x; ++i) {
			for(int j=0; j<y; ++j) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	private void matrixSearch(int val) {
		System.out.println(search(0, y-1, val).toString());
		
	}
	
	private Position search(int i, int j, int val) {
		System.out.println(i + " " + j);
		if(arr[i][j] == val) return new Position(i, j);
		else if(i > x || j < 0) return new Position(-1, -1);
		
		int nextJ = j;
		int nextI = i;
		
		if(j-1 >= 0 && arr[i][j-1] >= val)
			nextJ = j-1;
		else if(i+1 <= x && arr[i+1][j] <= val)
			nextI = i+1;
		else {
			nextI = i+1;
			nextJ = j-1;
		}
		
		return (search(nextI, nextJ, val));
		
	}
	public static void main(String[]args) {
		SortedMatrix matrix = new SortedMatrix(1000, 1000);
//		matrix.displayMatrix();
		
		matrix.matrixSearch(55555);
	}
	
}

class Position {
	public int x;
	public int y;
	
	Position (int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Position [x=" + x + ", y=" + y + "]";
	}
	
}