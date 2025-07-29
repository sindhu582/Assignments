package wipro;
import java.util.Scanner;
public class Day2_Assignment1 {

	public static void main(String[] args) {


		        Scanner scanner = new Scanner(System.in);
		        StringUtility stringUtility = new StringUtility();
		        String inputString = "";
		        int choice;
		        System.out.println("--- Java String Operations ---");
		        System.out.print("Enter a string: ");
		        inputString = scanner.nextLine();

		        do {
		            System.out.println("\nSelect an operation:");
		            System.out.println("1. Count vowels and consonants");
		            System.out.println("2. Check if the string is a palindrome");
		            System.out.println("3. Reverse the string");
		            System.out.println("4. Convert the string to uppercase and lowercase");
		            System.out.println("5. Replace a word in the string");
		            System.out.println("6. Display current string");
		            System.out.println("7. Enter a new string");
		            System.out.println("8. Exit");
		            System.out.print("Enter preference from menu: ");


		            while (!scanner.hasNextInt()) {
		                System.out.println("Invalid input. Please enter a number.");
		                scanner.next();
		                System.out.print("Enter preference from menu ");
		            }
		            choice = scanner.nextInt();
		            scanner.nextLine();

		            switch (choice) {
		                case 1:
		                    System.out.println("Vowels: " + stringUtility.countVowels(inputString));
		                    System.out.println("Consonants: " + stringUtility.countConsonants(inputString));
		                     break;
		                case 2:
		                    if (stringUtility.isPalindrome(inputString)) {
		                        System.out.println("The string is a palindrome.");
		                    } else {
		                        System.out.println("The string is not a palindrome.");
		                    }
		                     break;
		                case 3:
		                    System.out.println("Reversed string: " + stringUtility.reverseString(inputString));
		                     break;
		                case 4:
		                    System.out.println("Uppercase: " + stringUtility.toUpperCase(inputString));
		                    System.out.println("Lowercase: " + stringUtility.toLowerCase(inputString));
		                   break;
		                case 5:
		                    System.out.print("Enter the word to replace: ");
		                    String oldWord = scanner.nextLine();
		                    System.out.print("Enter the new word: ");
		                    String newWord = scanner.nextLine();
		                    String replacedString = stringUtility.replaceWord(inputString, oldWord, newWord);
		                    System.out.println("String after replacement: " + replacedString);
		                   break;
		                case 6:
		                    System.out.println("Current string: \"" + inputString + "\"");
		                   break;
		                case 7:
		                    System.out.print("Enter a new string: ");
		                    inputString = scanner.nextLine();
		                    System.out.println("String updated.");
		                    break;
		                case 8:
		                    System.out.println("Exiting program. Goodbye!");
		                    break;
		                default:
		                    System.out.println("Invalid choice. Please try again.");
		            }
		        } while (choice != 8);

		        scanner.close();
	}

}
