/*
	Introduction to OOP with Java
	McGraw-Hill

    Chapter 3 Exercise 8

    A program that inputs temperature in Celsius and prints
    out the temperature in Fahrenheit. The formula to convert
    Celsius to the equivalent Fahrenheit is

                F = 1.8 * C + 32
*/

import java.util.*;

class Exercise3_8
{

	public static void main (String[] args)
	{
		Scanner         scanner;
		double          celsius, fahrenheit;
		
		scanner = new Scanner( System.in );
		
		//Get input
		System.out.print("Enter temperature in celsius (e.g. 22.5): ");
		celsius = scanner.nextDouble();
		
		//Convert into fahrenheit
		fahrenheit = 1.8 * celsius + 32;
		
		//Display the result
		System.out.println();
		System.out.println("Input:  " + celsius + "C is equivalent to");
		System.out.println("Output: " + fahrenheit + "F");
	
	}
	
}