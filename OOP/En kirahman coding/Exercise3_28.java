/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 28
    
*/

import java.util.*;
import java.text.*;

class Exercise3_28 {
	
	public static void main(String[] args) {
		
		int purchasePrice, amountTendered, origChange, change;

		int countDollars = 0, countQuarters = 0, countDimes = 0, countNickels = 0, countPennies = 0;

		String spacer = "                 ";

		Scanner scanner;
		scanner = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0.00");

		//Get input
		System.out.print("Enter purchase price: ");
		purchasePrice = scanner.nextInt();
		System.out.print("Enter amount tendered: ");
		amountTendered = scanner.nextInt();

		change = amountTendered - purchasePrice;
		origChange = change;

		if (change < 0) {
			System.out.println("Not enough change was tendered");
			System.exit(1);
		}

		// Compute change
		if (change > 0) {
			// dollars
			if (change / 100 > 0) {
				countDollars += change / 100;
				change -= (change / 100) * 100;
			}

			// quarters
			if (change / 25 > 0) {
				countQuarters += change / 25;
				change -= (change / 25) * 25;
			}

			// dimes
			if (change / 10 > 0) {
				countDimes += change / 10;
				change -= (change / 10) * 10;
			}

			// nickels
			if (change / 5 > 0) {
				countNickels += change / 5;
				change -= (change / 5) * 5;
			}

			// pennies
			countPennies += change;
			change = 0;
		}

		//Display the result
		System.out.println();
		System.out.println();

		System.out.println(" Purchase Price: $ "
				+ df.format(((float) purchasePrice / 100)));
		System.out.println("Amount Tendered: $ "
				+ df.format(((float) amountTendered / 100)));
		System.out.println(" Your change is: $ "
				+ df.format(((float) origChange / 100)));
		System.out.println("");

		System.out.println(spacer + countDollars + " one-dollar bill(s)");
		System.out.println(spacer + countQuarters + " quarter(s)");
		System.out.println(spacer + countDimes + " dime(s)");
		System.out.println(spacer + countNickels + " nickel(s)");
		System.out.println(spacer + countPennies + " penn(y/ies)");

		System.out.println();
		System.out.println("Thank you for your business.  Come back soon.");
	}

}
