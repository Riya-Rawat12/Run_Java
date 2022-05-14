package Unit_03;

import java.io.IOException;
import java.util.*;

public class P14_ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int age = 5;
		ABCD obj = new ABCD();
		obj.basicException();
		obj.handleException();
		obj.multipleCatch();
		obj.inputMismatchException();
		obj.stackOverFlowError(i);
		obj.indexOutOfBoundException();
		obj.nullPointerException();
		try {
			obj.useofThrow(age);
		} catch (ArithmeticException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {

			e.printStackTrace();
		}
		obj.useOfThrows_And_Finally();
		obj.uncheckedAndcheckedException();

	}

}

class ABCD {

	// compiler cannot catch this exception at compile time
	void basicException() {

		int b = 0;
		int a = 100 / b;
		System.out.println(a);

		System.out.println("Done!");

	}

	void handleException() {
		try {

			// Sensitive code
			int b = 0;
			int a = 100 / b;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		}

		// Rest of the code!
		System.out.println("Done!");
	}

	void multipleCatch() {
		try {

			// Sensitive code
			int b = 0;
			int a = 100 / b;
			System.out.println(a);
		}
		// child class exception comes before super class exception

		catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " Hello");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void inputMismatchException() {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number");
			int a = sc.nextInt();

			System.out.println("You have entered " + a);
			sc.close();

		} catch (InputMismatchException e) {
			System.out.println("Input mismatch issue!");
		}
		System.out.println("Done!");

	}

	// Try and catch will not going to solve this problem because this part of code
	// is not an exception which can be handled this is an error.
	void stackOverFlowError(int i) {
		try {
			while (i > 0) {
				i = i + 1;
				stackOverFlowError(i);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Done");
	}

	void indexOutOfBoundException() {
		try {
			int[] myNumbers = { 1, 2, 3 };
			System.out.println(myNumbers[10]);
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}

		// It works doesn't matter exception is handled or not
		finally {
			System.out.println("The try catch is finished");
		}
	}

	void nullPointerException() {
		String ptr = null;
		try {
			if (ptr.equals("Name"))
				System.out.println("Same");
			else
				System.out.println("Not Same");
		} catch (NullPointerException e) {
			System.out.println("Null pointer exceptionn caught");
		}
	}

	void useofThrow(int age) throws Exception, ArithmeticException, IOException {
		if (age > 18) {
			throw new ArithmeticException("Acess Denied");
		} else
			System.out.println("You are an adult");
	}

	void useOfThrows_And_Finally() {
		try {
			useofThrow(17);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void uncheckedAndcheckedException() {
		// when compiler compile exception it is known as unchecked exception and also
		// known as compile time exception
		// when compiler figure out exception during compilation it is known as checked
		// exception or runtime exception
		int x = 0;
		int y = 10;
		int z = y / x;

		System.out.println(z);

		try {
			useofThrow(19);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	void manualExceptionThrow() {

		try {

			// Have to use try and Catch here!
			calculateArea(-1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	void calculateArea(int r) throws ManualException {

		if (r < 0) {
			throw new ManualException();
		}

		int area = r * r;
		System.out.println(area);

	}

}

class ManualException extends Exception {
	public String getMessage() {
		String detailMessage = "Exception Occured";
		return detailMessage;
	}

}
