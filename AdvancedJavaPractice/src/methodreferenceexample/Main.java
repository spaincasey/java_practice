package methodreferenceexample;

public class Main {

	public static void main(String[] args) {
		
		Square s = new Square(4);
		// Lambda expression
		Shapes shapes = (Square square) -> {
			return square.calculateArea();
		};
		
		System.out.println("Area " + shapes.getArea(s));
		
		// Rewritten with method reference 
		Shapes shapes2 = Square::calculateArea;
		
		System.out.println("Area " + shapes2.getArea(s)); 

	}

}
