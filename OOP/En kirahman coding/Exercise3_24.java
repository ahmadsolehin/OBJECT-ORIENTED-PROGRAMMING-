/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 24
    
    A program that accepts the unit weight of a bag of coffee in pounds 
    and the number of bags sold and displays the total price of the sale, computed as
    
            totalPrice        = unitWeight * numberOfUnits * 5.99f;
            totalPriceWithTax = totalPrice + totalPrice * 0.0725f;

    where 5.99 is the cost per pound and 0.0725 is the sales tax. 
    The letter f after 5.99 and 0.0725 designates that these two numbers are of type float. 
    
    Display the result in the following manner
    
        Number of bags sold:  32
         Weight per bag:  5 lbs
        Price per pound:  $5.99
              Sales tax:  7.25%

            Total price: $ 1027.884 
    
*/

import java.util.*;

class Exercise3_24
{
	private final static float PRICE_PER_LB  = 5.99f;
	private final static float SALES_TAX     = 0.0725f;

	public static void main (String[] args)
	{
		int unitWeight, numberOfUnits; 
		float totalPrice, totalPriceWithTax;
		Scanner scanner = new Scanner( System.in );

		//Get input
		System.out.print("Number of Bags sold: ");
		numberOfUnits  = scanner.nextInt();
		System.out.print("Weight of a bag (in lbs, e.g. 5): ");
		unitWeight     = scanner.nextInt();

		//Compute the prices
		totalPrice        = unitWeight * numberOfUnits * PRICE_PER_LB;
		totalPriceWithTax = totalPrice + totalPrice * SALES_TAX;


		//Display the result

		System.out.println("Number of bags sold:   " +  numberOfUnits); 
		System.out.println("     Weight per bag:   " +  unitWeight);
		System.out.println("    Price per pound:   " +  PRICE_PER_LB);
		System.out.println("          Sales tax:   " +  SALES_TAX * 100f + "%");
		System.out.println("");

		System.out.println("        Total price: $ " +  totalPriceWithTax );
		System.out.println("");

	}

}
