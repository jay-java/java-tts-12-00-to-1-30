package basic;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetdemo {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(12);
		set.add(-45);
		set.add(0);
		set.add(5464);
		set.add(1);
		set.add(-12);
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
