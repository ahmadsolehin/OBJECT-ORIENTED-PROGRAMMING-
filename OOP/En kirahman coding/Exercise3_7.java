/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 7
    
    An application to convert centimeters (input) to feet and inches (output). 
    
    Conversion factor:
                        1 inch = 2.54 centimeters.
*/

import java.util.*;

class Exercise3_7
{
	private final static float INCH_TO_CM = 2.54f; //conversion factors
	private final static int   FT_TO_INCH = 12;    
    
	public static void main (String[] args)
	{
		float       centimeters, inches;
		int         feet;
		Scanner     scanner = new Scanner(System.in);
		
		//Get input centimeters
		System.out.print("Enter centimeters (e.g. 174.5): ");
		centimeters = scanner.nextFloat();
			    
		//Convert into inches
		inches = centimeters / INCH_TO_CM;
			
		//Divide inches into feet and inches.
		//E.g. 174cm --> 5 ft and 8.5 inches
		feet   = (int) inches / FT_TO_INCH;
		inches = inches - feet * FT_TO_INCH;
			
		//Display the result
		System.out.println("Input:  " + centimeters + " cm is equivalent to\n"
	            +"Output: " + feet + " ft and " + inches + " inches.");
		
	}
}
