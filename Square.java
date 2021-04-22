package Shapes;
public class Square extends Rectangle {
	@Override
	public void printShape() {
		super.printShape();
		System.out.printf("\tA square is a subset of rectangles.%n");
	}
}
