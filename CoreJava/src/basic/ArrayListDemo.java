package basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
//	<generics>
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("name");
		list.add(345.4);
		list.add('f');
		list.add(false);
		list.add(345);
		list.add(1);
		System.out.println(list);
		list.remove(5);
		System.out.println("size of list : "+list.size());
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
//		List list1 = new ArrayList();
//		list1.add(1);
//		list1.add("name");
//		list1.add(345.4);
//		list1.add('f');
//		list1.add(false);
//		list1.add(list);
//		System.out.println(list1);
		
	}
}
