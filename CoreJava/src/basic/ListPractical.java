package basic;

import java.util.ArrayList;
import java.util.List;

class Dataaa{
	int id;
	String name;
	double sal;
	public Dataaa(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public String toString() {
		return "Dataaa [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
}

public class ListPractical {
	public static void main(String[] args) {
		Dataaa d1 = new Dataaa(1, "jeel", 11000);
		Dataaa d2 = new Dataaa(2, "rudra", 12000);
		Dataaa d3 = new Dataaa(3, "riken", 13000);
		List<Dataaa> list = new ArrayList<Dataaa>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		System.out.println(list);
	}
}
