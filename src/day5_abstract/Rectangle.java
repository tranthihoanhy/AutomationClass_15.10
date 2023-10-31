package day5_abstract;

public class Rectangle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("Vẽ hình vuông với màu "+getColor()+ " bằng đường thẳng");
	}
}
