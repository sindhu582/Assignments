package wipro;
import java.util.Scanner;

public class Day2_Assignment3 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        MathOperations mathOps = new MathOperations();
		        int choice;
		        do {
		            // Menu
		            System.out.println("\nSelect a Math Operation:");
		            System.out.println("1. Print Multiplication Table");
		            System.out.println("2. Calculate Factorial");
		            System.out.println("3. Check Prime Number");
		            System.out.println("4. Print Fibonacci Series");
		            System.out.println("5. Exit");
		            System.out.print("Enter your choice: ");

		            choice = scanner.nextInt();



		            switch (choice) {
		                case 1:
		                    System.out.print("Enter a number to print its table: ");
		                    int numTable = scanner.nextInt();
		                    mathOps.printTable(numTable);
		                    break;
		                case 2:
		                    System.out.print("Enter a non-negative number to calculate its factorial: ");
		                    int numFactorial = scanner.nextInt();

		                    int result = mathOps.calculateFactorial(numFactorial);
		                    if (result != -1) {
		                        System.out.println("Factorial of " + numFactorial + " is: " + result);
		                    }
		                    break;
		                case 3:
		                    System.out.print("Enter a number to check if it's prime: ");
		                    int numPrime = scanner.nextInt();

		                    if (mathOps.checkPrime(numPrime)) {
		                        System.out.println(numPrime + " is a prime number.");
		                    } else {
		                        System.out.println(numPrime + " is not a prime number.");
		                    }
		                    break;
		                case 4:
		                    System.out.print("Enter the number of terms for Fibonacci series: ");
		                    int numTerms = scanner.nextInt();
		                    scanner.nextLine();
		                    mathOps.printFibonacci(numTerms);
		                    break;
		                case 5:
		                    System.out.println("Exiting Math Utility App. Goodbye!");
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please select a number between 1 and 5.");
		            }
		        } while (choice != 5);

		        scanner.close();
	}

}
