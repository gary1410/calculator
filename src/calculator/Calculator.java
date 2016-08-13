package calculator;
import java.util.Scanner;

public class Calculator {
		
	static Scanner scan = new Scanner(System.in);
	static double firstNum, secondNum, answer;
	static int operation = 0;
	
	public static void main(String[] args) {	
		while (operation != 5) {
			do {
			System.out.println("Welcome to Gary's Handy Calculator");
			System.out.println("Select, 1, 2, 3, 4, or 5");
			System.out.println("1.  Addition");
			System.out.println("2.  Subtraction");
			System.out.println("3.  Multiplication");
			System.out.println("4.  Division");
			System.out.println("5.  Exit");
			operation = scan.nextInt();
			} while (operation < 0 && operation > 5);
		
			if (operation == 1) {
				System.out.println("Input your first number");
				firstNum = scan.nextDouble();
				System.out.println("Input your second number.");
				secondNum = scan.nextDouble();
				answer = firstNum + secondNum;
				System.out.println("Your answer is " + answer);
			}

		}
	}
}
