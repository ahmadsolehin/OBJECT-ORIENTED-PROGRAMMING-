/*
	Introduction to OOP with Java
	McGraw-Hill

    Chapter 3 Exercise 27

    Ask the user to enter his or her birthday in the MM/DD/YYYY
    format and output the number of days between the birthday
    and today. This gives the person how many days old is he or she.

*/

import java.util.*;

class Exercise3_27
{

	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		GregorianCalendar calBirthday = new GregorianCalendar();
		GregorianCalendar calToday = new GregorianCalendar();
		String inputStr;
		int	 year, month, day;
		long result;
		
		//Get input
		System.out.print("Enter your birthday in the format MM/DD/YYYY: ");
		inputStr = scanner.next();
		
		month = Integer.parseInt( inputStr.substring( 0, 2 ) );
		day = Integer.parseInt( inputStr.substring( 3, 5 ) );
		year = Integer.parseInt( inputStr.substring( 6 ) );

		calBirthday = new GregorianCalendar(year, month-1, day);

		                  
		//Calculate how many days have passed
		result = (calToday.getTime().getTime() - calBirthday.getTime().getTime())
					/ 86400000; // 86400000 --> milliseconds in a day
		
		//Display the result
		System.out.println("You are " + result + " days old.");
	
	}
	
}
