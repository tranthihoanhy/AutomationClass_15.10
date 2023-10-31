package day5_abstract;

public class ShapApplication {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setColor("xanh");
		rect.draw();
		
		Shape circle = new Circle();
		circle.draw();
	}

}
