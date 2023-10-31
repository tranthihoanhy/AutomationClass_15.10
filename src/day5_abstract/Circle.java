package day5_abstract;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("Vẽ hình tròn với màu "+ getColor()+ " bằng đường tròn");
	}
}
