package CalculatorProject;

import java.util.Scanner;

public class Calculator {

	int firstOpperand, secondOpperand, result, operator;
	private Scanner input = new Scanner(System.in);
	private static boolean exitCalculator = false;

	public void startCalculator() {
		while (!exitCalculator) {
			System.out.println("Enter 1 for addition  \n" + "Enter 2 for subtraction \n"
					+ "Enter 3 for Multiplication \n" + "Enter 4 for Division \n + " + "Enter 0 for Exit  : ");
			operator = input.nextInt();
			switch (operator) {
			case 1:
				result = add(firstOpperand, secondOpperand);
				System.out.println("Result is " + result);
				break;
			case 2:
				result = subtract(firstOpperand, secondOpperand);
				System.out.println("Result is " + result);
				break;
			case 3:
				result = multiply(firstOpperand, secondOpperand);
				System.out.println("Result is " + result);
				break;
			case 4:
				result = divide(firstOpperand, secondOpperand);
				System.out.println("Result is " + result);
				break;
			case 0:
				exitCalculator = true;
				System.out.println("Program Terminated \n");
				break;
			default:
				System.out.println("Please provide a proper input \n");

			}

		}

	}

	public int add(int i, int j) {

		System.out.println("Enter the first number :");
		firstOpperand = input.nextInt();
		System.out.println("Enter the second number :");
		secondOpperand = input.nextInt();

		return firstOpperand + secondOpperand;

	}

	public int subtract(int firstOpperand, int secondOpperand) {

		return firstOpperand - secondOpperand;

	}

	public int multiply(int firstOpperand, int secondOpperand) {

		return firstOpperand * secondOpperand;
	}

	public int divide(int firstOpperand, int secondOpperand) {

		return firstOpperand / secondOpperand;
	}

}
