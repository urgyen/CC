package day3;

public class Main101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		printEvenNumbers0To100();
//		
//		//Area of circle;
//		int radius =5;
//		
//	double pi = valueOfPi();
//		
//		System.out.println(valueOfPi()*radius*radius);

		//printMultiplication(5);

		
		System.out.println(findAreaOfCircle(5));
		
	}

	// Void --> yo methods

	public static void sayHi(String name) {

		System.out.println("Hello to " + name);

	}

	public static void addNumbers(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}

	// Funtions -- 4 types on the basis of return ra argument
	// 1. Function with no argument and no return types

	public static void printEvenNumbers0To100() {

		// business Logic

		for (int index = 2; index <= 100; index = index + 2) {
			System.out.println(index);
		}

	}

	// 2. Function with no arguments and a return type??

	// 3. Function with argument and no return type?

	public static void printMultiplication(int number) {

		for (int index = 1; index <= 12; index++) {
			System.out.println(index * number);
		}

	}

	// 4. Function with argument and return type??

	private static double valueOfPi() {
		return 3.1415;
	}
	
	public static double findAreaOfCircle(int radius) {

		return valueOfPi() * radius * radius ;

	}



}
