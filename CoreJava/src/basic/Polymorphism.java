package basic;
//method name same but having different functionalities ->Polymorphism
//Types of Poly
//1.Compile time->Method Overloading
//2.Runtime -> Method Overriding
class Student{
	public void run() {
		System.out.println("this is first run metod");
	}
	public void run(boolean flag) {
		System.out.println("this is second run metod");
	}
	public void run(String name) {
		System.out.println("this is third run metod");
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		Student s = new Student();
		s.run("java");
	}
}
