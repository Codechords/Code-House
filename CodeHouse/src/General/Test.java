package General;

public class Test {
	public static void main(String [] args) {
		try {
			System.out.println("B");
			throw new RuntimeException();
		}
		
		finally {
			System.out.println("E");
		}
	}
}

