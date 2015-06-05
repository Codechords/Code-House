package Java;

public abstract class Shape {
	Shape() {
		System.out.println("This is a shape");
	}
	void getArea() {
		System.out.println("Not found");
	}
	abstract void getPerimeter();
}

