package basic;
//OOPS ->
//1.Class - contains member function and member variables
//2.Object - instance of class
//3.Inheritance
//4.Polymorphism
//5.Abstraction
//6.Encapsulation
class name{
	int id;
	String sname;
	public void showName() {
		System.out.println("id = "+id);
		System.out.println("name = "+sname);
		System.out.println("this is show name method");
	}
}
public class ClassObject {
	public static void main(String[] args) {
		name n = new name();
		n.id= 10;
		n.sname="jeel";
		n.showName();
		
		name n1 = new name();
		n1.id= 11;
		n1.sname = "rudra";
		n1.showName();
	}
}
