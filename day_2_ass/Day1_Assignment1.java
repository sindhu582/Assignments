package wipro;

import java.util.Scanner;

public class Day1_Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int preference;
		char Continue = 0;
		
		
		do {
			//menu
			System.out.println("\n****MENU****");
			System.out.println("1.Print Table of a Number");
			System.out.println("2.Calculate Factorial");
			System.out.println("3.Check Prime Number");
			System.out.println("4.Print Fibonacci Series");
			System.out.println("5.Exit");
			System.out.println("Enter your preference:");
			
			//Preference
			preference = scanner.nextInt();
			
			//different menu options
			switch(preference) {
			case 1:
				//table
				System.out.println("Enter the number:");
				int num;
				num = scanner.nextInt();
				for(int i=0;i<=10;i++) {
					System.out.println(num + " x " + i + " = " + (num*i));
				}
				break;
				
			case 2:
				//factorial
				System.out.println("Enter the number(non-negative):");
				int numfac;
				numfac = scanner.nextInt();
				int factorial=1;
				for(int i=1;i<=numfac;i++) {
					
					factorial *= i;
					
				}
				System.out.println("factorial of "+ numfac + " is " +factorial);
				break;
				
			case 3:
				//prime number
				System.out.println("Enter the number to check:");
				int numPrime;
				numPrime = scanner.nextInt();
                boolean isPrime = true;
                if(numPrime <= 1) {
                    isPrime = false; 
                } 
                else {

                    int i = 2;
                    while(i * i <= numPrime) {
                        if(numPrime % i == 0) {
                            isPrime = false;
                            break;
                      }
                       i++;
                    }
                }

                if (isPrime) {
                    System.out.println(numPrime + " is a prime number.");
                }
                else {
                    System.out.println(numPrime + " is not a prime number.");
                }
                break;

			case 4:
				//fibonacci
				System.out.println("Enter the number of terms for series:");
				int numFib;
				numFib = scanner.nextInt();
				int firstTerm = 0;
				int secondTerm = 1;
				
					if(numFib <= 0) {
						System.out.println(firstTerm);
					}else {
						System.out.println(firstTerm +" "+secondTerm);
						
							for(int i = 2;i < numFib;i++) {
								int nextTerm = firstTerm +secondTerm;
								System.out.println(" "+nextTerm);
								firstTerm = secondTerm;
								secondTerm = nextTerm;
							}
					}
					break;
					
			case 5:
				//exit
				System.out.println("You have exited the program");
				break;
				
			default:
				System.out.println("enter a valid option from the menu");
				
			}
			
			if(preference !=5) {
				System.out.println("Back to Menu?(Y/N):");
				Continue = scanner.next().charAt(0);	
			}else {
				Continue = 'N';
			}
			
		}while(Continue == 'y' || Continue == 'Y');
		
		scanner.close();

	}

}
