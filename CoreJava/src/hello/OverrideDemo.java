package hello;

class A{
	public void sum() {
		System.out.println("sum method in class A");
	}
}
class B extends A{
	public void sum() {
		super.sum();
		System.out.println("sum method in class B");
	}
}
public class OverrideDemo {
	public static void main(String[] args) {
		B b = new B();
		b.sum();
		b.sum();
	}
}
