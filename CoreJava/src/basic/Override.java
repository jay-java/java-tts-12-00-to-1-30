package basic;
class Square{
	public void draw() {
		System.out.println("this is square class");
	}
}
class Circle extends Square{
	public void draw() {
		super.draw();
		System.out.println("this is circle class");
	}
}
public class Override {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
	}
}
