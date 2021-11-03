package text;

public class ShapeText {
	private static Shape arrayOfShapes[];
	public static void main(String arg[]) {
		init();
		drawAll();
	}
	public static void init() {
		arrayOfShapes = new Shape[4];
		arrayOfShapes[0] = new Rectangle();
		arrayOfShapes[1] = new Triangle();
		arrayOfShapes[2] = new Circle();
		arrayOfShapes[3] = new Polygon();
		
	}
	public static void drawAll() {
		for (int i = 0; i < arrayOfShapes.length; i++) {
			arrayOfShapes[i].draw();
		}

	}
}
