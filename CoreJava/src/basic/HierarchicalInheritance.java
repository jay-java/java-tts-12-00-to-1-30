package basic;

class Paren{
	public void parentMethod() {
		System.out.println("this is parent class");
	}
}
class Child1 extends Paren{
	public void child1Method() {
		System.out.println("this is child 1 class");
	}
}
class Child2 extends Paren{ 
	public void child2Method() {
		System.out.println("this is child 2 class");
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		c1.parentMethod();
		c1.child1Method();
		Child2 c2 = new Child2();
		c2.parentMethod();
		c2.child2Method();
	}
}
