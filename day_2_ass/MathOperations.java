package wipro;

public class MathOperations {

	    public void printTable(int number) {
	        System.out.println("Multiplication Table for " + number + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(number + " x " + i + " = " + (number * i));
	        }
	    }

	    public int calculateFactorial(int number) {
	        if (number < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        }
	        if (number == 0 || number == 1) {
	            return 1; 
	        }
	        int factorial = 1;
	        for (int i = 2; i <= number; i++) {
	            factorial *= i;
	        }return factorial;
	    }

	    public boolean checkPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i * i <= number; i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }return true;  
	    }

	    public void printFibonacci(int terms) {
	        if (terms <= 0) {
	            System.out.println("Number of terms must be positive.");
	            return;
	        }
	        if (terms == 1) {
	            System.out.println("Fibonacci Series (1 term): 0");
	            return;
	        }

	        long a = 0, b = 1;
	        System.out.print("Fibonacci Series ("+ terms +" terms): " + a + ", " + b);

	        for (int i = 2; i < terms; i++) {
	            long nextTerm = a + b;
	            System.out.print(", " + nextTerm);
	            a = b; 
	            b = nextTerm;
	        }
	        System.out.println();
	    }
	}

