/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 22
    
    An application that accepts the mass for two bodies in grams and 
    the distance between the two bodies in centimeters, and computes
    the force F using the formula
    
            F = k * ( M1 * M2 / d * d )
    
*/

import java.util.*;

class Exercise3_22
{

	public static void main (String[] args)
	{
		final double GRAVITATIONAL_CONSTANT_K = 6.67E-8;
		double       massOfBody1,
	 	             massOfBody2,
		             distanceBetweenTwoBodies,
		             force;

		Scanner scanner;
		scanner = new Scanner( System.in );

		//Get input
		System.out.print("Mass of Body 1: ");
		massOfBody1 = scanner.nextDouble();

		System.out.print("Mass of body 2: ");
		massOfBody2 = scanner.nextDouble();

		System.out.print("Distance between Bodies 1 and 2: ");
		distanceBetweenTwoBodies = scanner.nextDouble();

		//Compute the force between body 1 and body 2
		force = GRAVITATIONAL_CONSTANT_K 
				* ( massOfBody1 * massOfBody2 / 
	   			  (distanceBetweenTwoBodies * distanceBetweenTwoBodies) );


		//Display the result
		System.out.println("Mass of Body 1: " +  massOfBody1 + " grams"); 
		System.out.println("Mass of Body 2: " +  massOfBody2 + " grams");
		System.out.println("Distance between the two bodies: " 
							+  distanceBetweenTwoBodies + " cm");
		System.out.println();

		System.out.println("   Force between the two bodies: " +  force + " dynes" ); 

	}

}
