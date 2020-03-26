/*
 * Code Written by Vishwesh Shukla (26-03-2020)
 */

package converter;

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		// Instantiaing scanner to scan the octal inputs
		Scanner numScan = new Scanner(System.in);
		// Flag to check if the conversion was successful
		boolean success = false;

		// Variable to store the menu selection
		Integer userchoice = menu();

		/*
		 * Below is a switch statement to call converters based on menu selections
		 * Notice the usage of Beans (Binary & Decimal) to encapsulate the ins and outs
		 * of data
		 */
		switch (userchoice) {

		// CASE 1 - Binary Conversion
		case 1: {
			// Creating object of the numberbean for binary and setting value of octal
			// number
			NumberBean binaryBean = new NumberBean();
			binaryBean.setOctal(numScan.nextInt());

			try {
				// creating the object of binary converter
				BinaryConverter binaryConverter = new BinaryConverter();

				// calling the binary converter to convert and print answer
				success = binaryConverter.doBinary(binaryBean);

				// print message if converstion successful
				if (success) {
					System.out.println("Conversion done...");
				}
			} finally {
				// [GOOD PRACTICE] - closing the scanner object
				numScan.close();
			}
			break;
		}

		// CASE 2 - Decimal Conversion
		case 2: {
			// Creating object of the numberbean for binary and setting value of octal
			// number
			NumberBean decimalBean = new NumberBean();
			decimalBean.setOctal(numScan.nextInt());

			try {
				// creating the object of decimal converter
				DecimalConverter decimalConverter = new DecimalConverter();

				// calling the decimal converter to convert and print answer
				success = decimalConverter.doDecimal(decimalBean);

				// print message if converstion successful
				if (success) {
					System.out.println("Conversion done...");
				}
			} finally {
				// [GOOD PRACTICE] - closing the scanner object
				numScan.close();
			}
			break;
		}

		// CASE 3 - Quit program
		case 3: {
			System.out.print("Bye...");
			break;
		}

		// DEFAULT CASE
		default: {
			System.out.println("Unindentified input... Try again.");
			break;
		}
		}
	}

	//Method for console menu
	public static int menu()
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//variable for storing user selection
		int selection;
		
		//menu
		System.out.println("Greetings! Welcome to my Octal converter...");
		System.out.println("Choose fom the following conversions:");
		System.out.println("1 - Convert to Binary");
		System.out.println("2 - Convert to Decimal");
		System.out.println("3 - Quit");
		System.out.print("Please enter your choice: ");
		
		//scanning user input
		selection = input.nextInt();
		
		//returning user selection to be used in main method
		return selection;
	}
}
