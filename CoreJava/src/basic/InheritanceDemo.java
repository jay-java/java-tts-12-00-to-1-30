package basic;

//to access property of one class to another class
//5 types
//1.single
//2.multilevel
//3.multiple (not supported)
//4.hierarchical
//5.hybrid (not supported)
class Parent {
	public void parentMethod() {
		System.out.println("this is parent class");
	}
}

class Child extends Parent {
	public void childMethod() {
		System.out.println("this is child class");
	}
}

class grandChild extends Child {
	public void grandChildMethod() {
		System.out.println("this is grand child class");
	}
}

public class InheritanceDemo {
	public static void main(String[] args) {
		grandChild g = new grandChild();
		g.grandChildMethod();
		g.childMethod();
		g.parentMethod();
		Child c = new Child();
		c.parentMethod();
		c.childMethod();
		Parent p = new Parent();
		p.parentMethod();
	}
}
