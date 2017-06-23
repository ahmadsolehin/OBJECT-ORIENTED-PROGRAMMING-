/*
	Introduction to OOP with Java
	McGraw-Hill

    Chapter 3 Exercise 11

    Write a program that inputs the year a person is born
    and outputs the age of the person in the following format:

	You were born in 1990 and will be (are) 18 this year.

*/

import java.util.*;

class Exercise3_11
{

	public static void main (String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		GregorianCalendar cal = new GregorianCalendar();
		int yearBorn, years;
		
		//Get input
		System.out.print("Enter the year in which you were born (e.g., 1991): ");
		yearBorn = scanner.nextInt();
		
		//Calculate how many years have passed
		years = cal.get(Calendar.YEAR) - yearBorn;
		
		//Display the result
		System.out.println("You were born in " + yearBorn
				+ " and will be (are) " + years + " this year.");
	
	}
	
}
