/*
	Introduction to OOP with Java
	McGraw-Hill

    Chapter 3 Exercise 10

    A program that inputs temperature in Fahrenheit and prints
    out the temperature in Celsius. The formula to convert
    Fahrenheit to the equivalent Celsius is

               C = 5/9 * (F - 32)
*/

import java.util.*;

class Exercise3_10
{

	public static void main (String[] args)
	{
		Scanner         scanner;
		double          celsius, fahrenheit;
		
		scanner = new Scanner( System.in );
		
		//Get input
		System.out.print("Enter temperature in fahrenheit (e.g. 87): ");
		fahrenheit = scanner.nextDouble();
		
		//Convert into fahrenheit
		celsius = 5.00/9.00 * (fahrenheit - 32.00);
		
		//Display the result
		System.out.println();
		System.out.println("Input:  " + fahrenheit + "F is equivalent to");
		System.out.println("Output: " + celsius + "C");
	
	}
	
}
