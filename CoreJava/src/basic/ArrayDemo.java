package basic;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int i[] = {10,20,30,40,50};
		System.out.println(i[4]);
//		for(int index=0;index<=4;index++) {
//			System.out.println("value at i["+index+"] is : "+i[index]);
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int index=0;index<arr.length;index++) {
			System.out.print("enter value at arr["+index+"] : ");
			arr[index] = sc.nextInt();
		}
		for(int index=0;index<arr.length;index++) {
			System.out.println("value at i["+index+"] is : "+arr[index]);
		}
		int sum = 0;
		for(int index=0;index<arr.length;index++) {
			sum =  sum + arr[index];
		}
		System.out.println("sum = "+sum);
	}
}
