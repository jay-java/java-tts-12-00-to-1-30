package basic;

import java.util.Enumeration;
import java.util.Vector;

public class VectoreDemo {
	public static void main(String[] args) {
		Vector vr =new Vector();
		vr.add(12);
		vr.add("name");
		vr.add(456.56);
		vr.add(false);
		vr.add('f');
		vr.add(56756);
		System.out.println(vr);
		Enumeration em = vr.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
