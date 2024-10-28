package Exceptions;

public class ArthimeticException {

	public static void main(String[] args) {
		try {
			int [] numbers = {1,2,3,4,5};
			System.out.println(numbers[10]);
		}
		catch (ArithmeticException a) {
			System.out.println("Caught Exception:" + a);
		}
		finally {
			System.out.println("The Program Was End");
		}
	}

}
