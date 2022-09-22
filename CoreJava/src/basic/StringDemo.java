package basic;

public class StringDemo {
	public static void main(String[] args) {
		String s = "TOPS TECHNOLOGIES";
		String s1 = "tops technologies";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(1));
		System.out.println(s.contains("techno"));
		System.out.println(s.endsWith("ies"));
		System.out.println(s.indexOf('t'));
		System.out.println(s.isEmpty());
		System.out.println(s.isBlank());
		System.out.println(s.concat(s1));
		System.out.println(s);
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareToIgnoreCase(s1));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		String s3 = "		hello java 		";
		System.out.println(s3.trim());
	}
}
