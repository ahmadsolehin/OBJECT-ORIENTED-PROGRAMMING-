/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 9
    
    A program that accepts a person’s weight and displays the 
    number of calories the person needs in one day. A person needs 
    19 calories per pound of body weight, so the formula expressed 
    in Java would be
    
            calories = bodyWeight * 19;

*/

import java.util.*;

class Exercise3_9
{
	private static final int CALORIE_PER_LB = 19;
	
	public static void main (String[] args)
	{
	
		double      weight, calories;
		Scanner     scanner = new Scanner( System.in );
		
		    
		//Get input
		System.out.print("Enter your weight in pounds (e.g. 150.35): ");
		weight = scanner.nextDouble();
		
		//Compute the required calories
		calories = weight * CALORIE_PER_LB;
		
		
		//Display the result
		System.out.println("\nYou need " + calories + " calories to support\n"
				+ weight + " lbs. of body weight");
		
	}

}
