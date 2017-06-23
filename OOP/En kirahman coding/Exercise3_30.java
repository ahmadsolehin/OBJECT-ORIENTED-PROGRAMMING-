/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 30
    
*/


import java.util.*;
import java.text.*;

class Exercise3_30 {
	
	public static void main(String[] args) {
		
		final int MILLISECONDS_PER_DAY = 1000 * 60 * 60 * 24;
		final int LRG_BOX_PRICE = 180;
		final int MED_BOX_PRICE = 100;
		final int SML_BOX_PRICE = 60;
		final int LRG_BOX_CAPACITY = 20;
		final int MED_BOX_CAPACITY = 10;
		final int SML_BOX_CAPACITY = 5;

		int numBags, purchasePrice, numBagsLeft, boxCost = 0;
		int orderMonth, orderDay, orderYear;
		float totalPrice;
		int lrgBoxCount = 0, medBoxCount = 0, smlBoxCount = 0;
		String input;

		Scanner scanner;
		scanner = new Scanner(System.in);

		DecimalFormat df = new DecimalFormat("0.00");
		SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy");
		GregorianCalendar dateOfOrder, arrivalDate;

		String spacer = "            ";

		//Get input
		System.out.print("Enter number of bags to order: ");
		numBags = scanner.nextInt();
		System.out.print("Enter date of order (MM/dd/yyyy): ");
		input = scanner.next();

		orderMonth = Integer.parseInt(input.substring(0, 2));
		orderDay = Integer.parseInt(input.substring(3, 5));
		orderYear = Integer.parseInt(input.substring(6));

		dateOfOrder = new GregorianCalendar(orderYear, orderMonth - 1, orderDay);
		arrivalDate = new GregorianCalendar();

		arrivalDate.setTimeInMillis(dateOfOrder.getTimeInMillis()
				+ MILLISECONDS_PER_DAY * 14);

		purchasePrice = 550 * numBags;

		if (numBags <= 0) {
			System.out.println("Please purchase at least one bag.");
			System.exit(1);
		}

		numBagsLeft = numBags;

		// Calculate number of boxes
		if (numBagsLeft > 0) {
			// large
			if (numBagsLeft / LRG_BOX_CAPACITY > 0) {
				lrgBoxCount += numBagsLeft / LRG_BOX_CAPACITY;
				numBagsLeft -= (numBagsLeft / LRG_BOX_CAPACITY)
						* LRG_BOX_CAPACITY;
			}

			// medium
			if (numBagsLeft / MED_BOX_CAPACITY > 0) {
				medBoxCount += numBagsLeft / MED_BOX_CAPACITY;
				numBagsLeft -= (numBagsLeft / MED_BOX_CAPACITY)
						* MED_BOX_CAPACITY;
			}

			// small
			if (numBagsLeft / SML_BOX_CAPACITY > 0) {
				smlBoxCount += numBagsLeft / SML_BOX_CAPACITY;
				numBagsLeft -= (numBagsLeft / SML_BOX_CAPACITY)
						* SML_BOX_CAPACITY;
			}

			// if there are any bags left, use a small bag for them
			if (numBagsLeft > 0) {
				smlBoxCount += 1;
				numBagsLeft = 0;
			}
		}

		//Display the result
		System.out.println();
		System.out.println();

		System.out.println("Number of bags Ordered: " + numBags + " - $ "
				+ df.format((float) purchasePrice / 100));
		System.out.println();
		System.out.println("Boxes Used:");
		System.out.println(spacer + lrgBoxCount + " Large  - $"
				+ df.format(((float) lrgBoxCount * LRG_BOX_PRICE) / 100));
		System.out.println(spacer + medBoxCount + " Medium - $"
				+ df.format(((float) medBoxCount * MED_BOX_PRICE) / 100));
		System.out.println(spacer + smlBoxCount + " Small  - $"
				+ df.format(((float) smlBoxCount * SML_BOX_PRICE) / 100));

		boxCost = lrgBoxCount * 180 + medBoxCount * 100 + smlBoxCount * 60;
		System.out.println();
		totalPrice = purchasePrice + boxCost;
		System.out.println("Your total cost is: $ "
				+ df.format(totalPrice / 100));

		System.out.println();
		System.out.println("Date of Order:              "
				+ sdf.format(dateOfOrder.getTime()));
		System.out.println("Exptected Date of Arrival:  "
				+ sdf.format(arrivalDate.getTime()));
	}

}
