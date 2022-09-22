package basic;

import java.util.Scanner;
//1.simple if
//2. if else
//	3.nested if
//	4.else if ladder
//	5.switch case
public class ConditionalStatements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		int i  = sc.nextInt();
		System.out.println("enter  j = ");
		int j = sc.nextInt();
		//1. simple if
		if(i>j) {
			System.out.println("i is gareater than j");
		}
		
		
		//2.if else
		if(i>j) {
			System.out.println("i is greater than j");
		}
		else {
			System.out.println("i is less than j");
		}
		
		//3.nested if
		System.out.println("enter age : ");
		int age = sc.nextInt();
		if(age>18) {
			if(age<60) {
				System.out.println("you are eligible");
			}
			else {
				System.out.println("age is greater than 18 but not less than 60");
			}
		}
		else {
			System.out.println("age is less than 18");
		}
		
		
		//4.else if ladder
		System.out.println("enter marks : ");
		int marks = sc.nextInt();
		if(marks<35) {
			System.out.println("fail");
		}
		else if(marks>=35 && marks<=50) {
			System.out.println("D grade");
		}
		else if(marks>=51 && marks<=70) {
			System.out.println("C grade");
		}
		else if(marks>=71 && marks<=80) {
			System.out.println("B grade");
		}
		else if(marks>=81 && marks<=90) {
			System.out.println("A grade");
		}
		else if(marks>=91 && marks<=100) {
			System.out.println("A+ grade");
		}
		else {
			System.out.println("invalid input");
		}
		
		//5. switch case
		System.out.println("Press 1 For Gujarati");
		System.out.println("Press 2 For Hindi");
		System.out.println("Press 3 For English");
		System.out.println("enter your choice : ");
		int c = sc.nextInt();
		switch(c) {
		case 1:
			System.out.println("YOu selected Gujarati");
			break;
		case 2:
			System.out.println("You selected Hindi");
			break;
		case 3:
			System.out.println("You selected English");
			break;
		default: 
			System.out.println("invalid input");
		}
	}
}
