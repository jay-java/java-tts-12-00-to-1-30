package basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LIstDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add("name");
		list.add(345.4);
		list.add('f');
		list.add(false);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
