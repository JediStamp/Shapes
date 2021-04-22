package Shapes;

public class Main {

	public static void main(String[] args) {
		System.out.printf("Rectangle lineage.%n");
		Rectangle rect = new Rectangle();
		rect.printShape();
		
		System.out.printf("%nSquare lineage.%n");
		Square sq = new Square();
		sq.printShape();
		
		System.out.printf("%nCircle lineage.%n");
		Circle circ = new Circle();
		circ.printShape();
	}

}
