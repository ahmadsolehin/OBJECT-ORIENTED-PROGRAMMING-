/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 25
    
    A program that accepts five input values year A, population in year A, 
    year B, population in year B, and year C and predict the population for year C
    using the formula
    
            y = (c * e) ^ (k * x )
            
    where y is the population after x years from the reference year.
    
*/

import java.util.*;

class Exercise3_25 {
	
	public static void main(String[] args) {

		int yearA, yearB, yearC;

		double yearApopulation, yearBpopulation, predictedYearCpopulation, c, k, x;

		Scanner scanner;

		scanner = new Scanner(System.in);

		//Get input
		System.out.print("Reference Year A: ");
		yearA = scanner.nextInt();
		System.out.print("Population at Year A: ");
		yearApopulation = scanner.nextDouble();

		System.out.print("Reference Year B: ");
		yearB = scanner.nextInt();
		System.out.print("Population at Year B: ");
		yearBpopulation = scanner.nextDouble();

		System.out.print("Reference Year C: ");
		yearC = scanner.nextInt();

		//Compute the constants c and k
		c = yearApopulation;
		k = (1.0 / (yearB - yearA))
				* Math.log(yearBpopulation / yearApopulation);

		//Compute the predicted population at Year C
		predictedYearCpopulation = c * Math.exp(k * (yearC - yearA));

		//Display the result
		System.out.println("Population in the year " + yearA + " is "
				+ yearApopulation);
		System.out.println("Population in the year " + yearB + " is "
				+ yearBpopulation);
		System.out.println();

		System.out.println("Predicted ");
		System.out.println("   population in the year " + yearC + " is "
				+ (int) predictedYearCpopulation);
	}

}
