package basic;
import java.util.InputMismatchException;
//1.try
//2.catch
//3.finally
//4.throw
//5.throws
import java.util.Scanner;
class divide{//riken
	public void division() throws ArithmeticException,InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter i = ");
		int i = sc.nextInt();
		System.out.print("enter j = ");
		int j = sc.nextInt();
		int k=i/j;
		System.out.println(k);
		throw new ArithmeticException();
	}
}
public class ExceptionHandling {//jeel
	public static void main(String[] args) {
		try {
			divide d = new divide();
			d.division();
		} catch (ArithmeticException e) {
			System.out.println("denominator cannot be zero");
		}
		catch(InputMismatchException e) {
			System.out.println("denominator shoulf be numeric");
		}
		
		
		
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("enter i = ");
//			int i = sc.nextInt();
//			System.out.print("enter j = ");
//			int j = sc.nextInt();
//			int k=i/j;
//			System.out.println(k);
//		} catch (ArithmeticException e) {
////			e.printStackTrace();
//			System.out.println("denominator cannot be zero");
//		}
//		catch(InputMismatchException e) {
//			System.out.println("denominaotr should be numeric");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		finally {
//			System.out.println("this will executes everytime");
//		}
	}
}
