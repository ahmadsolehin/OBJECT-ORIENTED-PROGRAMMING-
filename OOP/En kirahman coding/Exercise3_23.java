/*
		Introduction to OOP with Java
		McGraw-Hill
		
    Chapter 3 Exercise 23
    
*/

import java.util.*;

class Exercise3_23
{

	private final static double LATTE_CONSTANT = 2.5E2;

	public static void main (String[] args)
	{
		Scanner scanner;

		int	 numLines, timeSpent, vars;

		double readability;

		scanner = new Scanner( System.in );

		// get input
		System.out.print("Number of commented lines: ");
		numLines = scanner.nextInt();

		System.out.print("Time spent: ");
		timeSpent = scanner.nextInt();

		System.out.print("Number of lines with nondescriptive variable names: ");
		vars = scanner.nextInt();

		//compute the readability
		readability = LATTE_CONSTANT * ( ( numLines * Math.pow( timeSpent, 2 ) ) / Math.pow( vars, 6 ) );

		System.out.println();
		System.out.println("      Program readability: " + readability );
	}

}
