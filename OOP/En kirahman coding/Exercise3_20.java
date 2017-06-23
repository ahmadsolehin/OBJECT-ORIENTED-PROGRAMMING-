/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 20
    
    Modify the Ch3FindDayOfWeek program by accepting the date
    information as a single string instead of accepting the year,
    month, and day information separately.  The input string must
    be in the MM/dd/yyyy format.  For example, July 4, 1776, is
    entered as 07/04/1776.  There will be exactly two digits for
    the month and day and four digits for the year.
    
*/


import java.util.*;
import java.text.*;

class Exercise3_20
{
	public static void main ( String[] args )
	{
		String inputStr;
		int	 year, month, day;

		GregorianCalendar cal;
		SimpleDateFormat  sdf;

		Scanner scanner = new Scanner( System.in );

		System.out.print("Input date (MM/dd/yyyy): ");
		inputStr = scanner.next();

		month = Integer.parseInt( inputStr.substring( 0, 2 ) );
		day = Integer.parseInt( inputStr.substring( 3, 5 ) );
		year = Integer.parseInt( inputStr.substring( 6 ) );

		cal = new GregorianCalendar(year, month-1, day);
		sdf = new SimpleDateFormat("EEEE");

		System.out.println("");
		System.out.println("Day of Week: " + sdf.format(cal.getTime()));
	}
}
