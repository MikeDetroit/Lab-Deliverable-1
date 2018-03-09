package Lab1;

import java.util.Scanner; //API for user input.

public class Lab1 {
	private static Scanner scnr;

	public static void main(String[] args) {
		
		// declared needed variables.
		int userNumber1;
		int userNumber2;
		int numberTotal;
		int i; 

		scnr = new Scanner(System.in); 
		
		// first number input from user.
		System.out.println("Please enter your first number (minimum 2 digits): ");
		userNumber1 = scnr.nextInt(); 
		
		// second number input from user.
		System.out.println("Enter a second number with the same amount of digits: ");
		userNumber2 = scnr.nextInt(); 
		
		// calculation of both user input numbers.
		numberTotal = (userNumber1 % 10) + (userNumber2 % 10); // calculation
		i = numberTotal;

		// while loop used because number of iterations not known; perform sum calculation using division & modulus.
		while (i == numberTotal) { 
			userNumber1 = userNumber1 / 10;
			userNumber2 = userNumber2 / 10;
			i = (userNumber1 % 10) + (userNumber2 % 10);
		
		}
		
		// Loop to determine if sum of numbers equals like numbers.
		if (userNumber1 == 0) {
			System.out.println("True");
		} else {
			System.out.println("False");
		
		}
	}


		
		
}

