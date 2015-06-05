package Java;

class Circle extends Shape{
	Circle() {
		System.out.println("This is a circle");
	}
	public static void main(String []args) {
		Shape shape = new Circle();
		shape.getArea();
	}
}

