package basic;

import java.util.Scanner;

class demo{
	public void call() {
		System.out.println("this is call methd inside demo class");
	}
}
public class jay {
	public static void main(String[] args) {
		System.out.print("hello world");
		System.out.println(" hello again");
		System.out.println("hello java");
		System.out.println(1+2);
		//int,byte,short,long,float,double,boolean,char->primitive
		int i,j;
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter i = ");
		i = sc.nextInt();
		System.out.println("enter j = ");
		j = sc.nextInt();
		int k = i/j;
		System.out.println(k);
		demo d = new demo();
		d.call();
		float f = 3.123434534653456345f;
		System.out.println(f);
	}
}
