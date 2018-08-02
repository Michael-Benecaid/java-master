package exceptions;

import java.time.Year;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int result = divide();
			System.out.println(result);
		} catch (ArithmeticException | NoSuchElementException e) {
			// TODO: handle exception
			System.out.println(e.toString());
			System.out.println("Unable to perform division");
		}
		
	}
	
	private static int divide() {
		int x,y;
		try {
			x = getInt();
			y = getInt();
			System.out.println("x is " + x + ", y is " + y);
			return x / y;
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			throw new ArithmeticException("No suitalbe input");
		} catch (ArithmeticException e) {
			// TODO: handle exception
			throw new ArithmeticException("Attempt to divide by 0");
		}
	}
	
	private static int getInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter a number");
		while(true) {
			try {
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				// TODO: handle exception
				scanner.nextLine();
				System.out.println("Please enter a number using only digitals");
			}
		}
	}
}
