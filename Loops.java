package unit04;

import java.util.Scanner;

/**
 * 
 * @author annaaombe
 * 
 *         practice the three looping control structures in java
 */

public class Loops{
	// variable used in temperatureCheck method (while loop)
	static final double MAX_TEMP = 102.5; // maximum temperature

	//// variable used in validateInput method
	static final String YES = "yes";

	// variable used in speedConverter method (for loop)
	static final int STARTING_KPH = 60; // starting speed
	static final int MAX_KPH = 130; // max speed
	static final int INCREMENT = 10; // speed increment

	// public scanner object for keyboard input
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		speedConverter();
		// do while loop example

		validateInput();
	}

	/**
	 * while loop this method assists a technician in the process of checking a
	 * substance's temperature
	 */
	public static void temperatureCheck() {
		System.out.println();
		double temperature; // to hold temperature input

		// get current temperature
		System.out.println("Enter the substance celcius temperature: ");
		temperature = scan.nextDouble();

		// as long as necessary instruct
		// technician to adjust temperature
		while (temperature > MAX_TEMP) {
			System.out.println("The temperature is too high." + "\nTurn the thermostat down and wait 5 minute. "
					+ "\nTake the temperature again");
			System.out.print("and enter it here: ");
			temperature = scan.nextDouble();

		}

		// remind the technician to check the temperature again in 15 minute
		System.out.println("The temperature is acceptable.");
		System.out.println("Check it again in 15 minutes.");
	}

	/**
	 * do while loop This method checks for input validation: ask user to enter yes
	 * or no and calls temperatureCheck method
	 */
	public static void validateInput() {
		String check = "yes";
		do {
			temperatureCheck(); // calls temperatureCheck method

			// ask user if the 15 minutes is over
			System.out.println("Is 15 minutes up (enter yes or no): ");

			scan.nextLine(); // clear input buffer
			check = scan.nextLine(); // read user response

		} while (check.equalsIgnoreCase(YES));// check if condition is true
	}

	/**
	 * for loop this method displays the table of speeds in kph converted to mph
	 *
	 */
	public static void speedConverter() {

		// display table heading
		System.out.println("KPH\t\tMPH");
		System.out.println("------------------------");
		double conversionFactor = 0.6214;// 1 kph equals 0.6214 mph

		int kph;
		double mph;
		for (kph = STARTING_KPH; kph <= MAX_KPH; kph += INCREMENT) {

			// calculate the mph (convert kph to mph)
			mph = kph * conversionFactor;
			// display formated string of the speed in kph and mph
			System.out.printf("%d\t\t%.1f\n", kph, mph);
		}
	}
}
