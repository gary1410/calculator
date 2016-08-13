package calculator;
import java.util.Scanner;

public class Calculator {
	// Initializing variables 
	static Scanner scan = new Scanner(System.in);
	// making a new scanner to receive input from console
	static double firstNum, secondNum, answer;
	//initializing parameters and variables 
	static int operation = 0;
	// declaring the operation value here.  If you type 1, 2, 3, you add, subtract, of multiply...

	
	// This method takes two parameters
	public static void add(double firstNum2, double secondNum2) {
		//add values coming in from the parameters and holds in answer variable
		answer = firstNum2 + secondNum2;
		//Prints out the answer
		System.out.println("Your answer is when adding: " + answer + '\n');
	}
	
	//  Method signature takes two parameters
	public static void subtract(double firstNum2, double secondNum2) {
		//subtracts and stores in answer variable
		answer = firstNum2 - secondNum2;
		System.out.println("Your answer when subtracting: " + answer + '\n');
	}
	
	// Method signature takes in two paramters
	public static void divide(double firstNum2, double secondNum2) {
		//checks to see if secondNum is 0
		if (secondNum2 == 0){
			//prints to console to try again and breaks out of the if statement
			System.out.println("Can't Divide by 0  Try again:");
		} else {
			// if the secondNum doesn't equal 0 it comes in here and correctly divides
			// firstNum by second Num
			answer = firstNum2  / secondNum2;
			System.out.println("Your answer is when dividing: " + answer + '\n');
		}
	}
	
	//Method signature takes in two parameters
	private static void multiply(double firstNum2, double secondNum2) {
		//stores the variables in aswer
		answer = firstNum2 * secondNum2;
		System.out.println("Your answer when multiplying: " + answer + '\n');
	}
	
	public static void main(String[] args) {	
		//need to check if operation is is !5, if not 5 we keep going.
		while (operation != 5) {
			//Print these lines out in the do/while statement (while the operation is less 0 or greater than 5, keep printing)
			do {
			System.out.println("Welcome to Gary's Handy Calculator");
			System.out.println("Select, 1, 2, 3, 4, or 5");
			System.out.println("1.  Addition");
			System.out.println("2.  Subtraction");
			System.out.println("3.  Multiplication");
			System.out.println("4.  Division");
			System.out.println("5.  Exit");
			// in the do/while we need to check if the user has entered in the correct values, no strings or incorrect values other than 1 -5
				while(!scan.hasNextInt()) {
					System.out.println("You need to select 1, 2, 3, 4, 5");
					scan.next();
				}
			//we need to scan the next Int that comes in in order to process the operational values above
				operation = scan.nextInt();
			} while (operation < 0 && operation > 5);
			
			// print out to user when to enter in their numbers
			System.out.println("Input your first number");
			// has to scan for a double value
			firstNum = scan.nextDouble();
			//print second number
			System.out.println("Input your second number.");
			//has to scan for a double value
			secondNum = scan.nextDouble();
			
			/*this would probably look better in a case statement
			however lines 83-97 are saying if the command line receives 
			values 1, 2, 3, 4 then call the respective methods, of add(), subtract(), multiply(), divide() */
			if (operation == 1) {
				add(firstNum, secondNum);
			}
			
			if (operation == 2) {
				subtract(firstNum, secondNum);
			}
			
			if (operation == 3) {
				multiply(firstNum, secondNum);
			}
			
			if (operation == 4) {
				divide(firstNum, secondNum);
			}

		}
	}

}
