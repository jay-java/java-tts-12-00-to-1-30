package basic;
interface inter1{
	public void interface1();
	public static void interface4() {
		System.out.println("this is interface 4");
	}
}
interface inter2 extends inter1{
	public void interface2();
}
interface inter3{
	public void interface3();
}
class call implements inter2,inter3{
	public void interface1() {
		System.out.println("interfce 1 ");
	}
	public void interface3() {
		System.out.println("interfce 3");
	}
	public void interface2() {
		System.out.println("interfce 2");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		call c  = new call();
		c.interface1();
		c.interface2();
		c.interface3();
		inter1.interface4();
	}
}
