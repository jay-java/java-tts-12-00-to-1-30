package basic;

public class Loops {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		System.out.println("--------");
		int j = 1;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		System.out.println("--------");
		int k = 10;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=5);
	}
}
