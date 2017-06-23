/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 19
    
    Program that determines the number of days in a given semester.
    Input to the program is the year, month, and day information of
    the first and the last days of a semester.
    
*/

import java.util.*;

class Exercise3_19
{
	public static void main (String[] args)
	{
		Scanner                scanner;
		int			startYear, endYear;
		int			startMonth, endMonth;
		int			startDay, endDay;
		int			startDOY, endDOY;
		int			difference;
		GregorianCalendar	start, end;

		scanner = new Scanner( System.in ) ;

		// read in values
		System.out.println("Starting date");
		System.out.print("  Year (yyyy): ");
		startYear = scanner.nextInt();

		System.out.print("  Month (1-12): ");
		startMonth = scanner.nextInt();

		System.out.print("  Day (1-31): ");
		startDay = scanner.nextInt();

		System.out.println();

		System.out.println("Ending date");
		System.out.print("  Year (yyyy): ");
		endYear = scanner.nextInt();

		System.out.print("  Month (1-12): ");
		endMonth = scanner.nextInt();

		System.out.print("  Day (1-31): ");
		endDay = scanner.nextInt();

		// compute difference
		start = new GregorianCalendar( startYear, startMonth - 1, startDay );
		end = new GregorianCalendar( endYear, endMonth - 1, endDay );

		startDOY = start.get( Calendar.DAY_OF_YEAR );
		endDOY = end.get( Calendar.DAY_OF_YEAR );

		if( startDOY > endDOY ) {
			difference = 365 - startDOY + endDOY;
		} else {
			difference = endDOY - startDOY + 1;
		}

		System.out.println();
		System.out.println("The semester is " + difference + " days long.");
	}   
}
