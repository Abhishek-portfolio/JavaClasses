package Exceptions;

public class ArrayIndex {

	public static void main(String[] args) {
		int [] numbers = {1,2,3};
		try {
			System.out.println(numbers[10]);
			}
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("Array Index Exception Handling:"+a);
		}

	}

}
