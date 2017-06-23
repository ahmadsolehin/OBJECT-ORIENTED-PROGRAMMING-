/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 12
    
    A program that accepts weight and height (both integers) and 
    outputs the BMI. A quantity known as body mass index (BMI) is used 
    to calculate the risk of weight-related health problems. BMI is computed 
    by the formula
    
                BMI = weight / (height/100.0)^2
    
    where weight is in kilograms and height is in centimeters. Display BMI as 
    an int value.

*/

import java.util.*;

class Exercise3_12
{
    
	public static void main (String[] args)
	{
		int            weight;
		double         height;
		int            bodyMassIndex;
		Scanner        scanner;
		
		 scanner = new Scanner( System.in );
		
		//Get input
		System.out.print("Enter your weight in kilograms (whole number e.g. 67): ");
		weight = scanner.nextInt();
		
		System.out.print("Enter your height in centimeters (whole number e.g. 176): ");
		height = scanner.nextInt();
		
		//Compute the BMI as a whole number      
		height = height / 100.0; //conver height to meters
		
		bodyMassIndex = (int) (weight / (height*height));
		
		
		//Display the result
		System.out.println();
		System.out.println("Input - ");
		System.out.println("    Weight: " + weight + "kg ");
		System.out.println("    Height: " + height + "m ");
		 
		System.out.println();
		System.out.println("Output - ");
		System.out.println("    BMI: " + bodyMassIndex );       
	        
	}

}
