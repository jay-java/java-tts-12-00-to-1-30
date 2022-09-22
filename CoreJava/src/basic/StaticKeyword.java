package basic;

class dataa{
	static {
		System.out.println("static block inside data class");
	}
	int id;
	String name;
	static String cname="TOPS";
	public dataa(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String toString() {
		return "dataa [id=" + id + ", name=" + name + ", cname = "+cname+"]";
	}
	public void show() {
		System.out.println("non static method");
	}
	public static void another() {
		System.out.println("static method");
	}
}
public class StaticKeyword {
	static {
		System.out.println("static block inside main class");
	}
	public static void main(String[] args) {
		dataa d1 = new dataa(1, "jeel");
		dataa d2 = new dataa(2, "riken");
		dataa d3 = new dataa(3, "rudra");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		d1.show();
		dataa.another();
	}
}
