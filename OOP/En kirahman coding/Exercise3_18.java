/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 18
    
    A program that solves quadratic equations of the form
    
        A x ^2 + B x + C
        
    where A, B, and C are real numbers. For this exercise, assume that 
    the input value for A is nonzero and B^2 >= 4AC. The formula is
    
            x = (-B + Math.sqrt(B*B - 4 * A * C)) / (2*A)
    and
            
            x = (-B - Math.sqrt(B*B - 4 * A * C)) / (2*A)
*/

import java.util.*;

class Exercise3_18
{
    
	public static void main (String[] args)
	{
		double      A, B, C; //coeffients of a quadratic equation
		double      x1, x2; //two real solutions of a quadratic equation
		double      determinant;
		
		Scanner scanner;
		scanner = new Scanner( System.in );        
		    
		//Get input; Assume the input value of A is nonzero
		System.out.print("Enter A of A x^2 + B x + C: ");
		A = scanner.nextDouble();
		
		System.out.print("Enter B of A x^2 + B x + C: ");
		B = scanner.nextDouble();
		
		System.out.print("Enter C of A x^2 + B x + C: ");
		C = scanner.nextDouble();
		
		//Solve the equation 
		determinant = Math.sqrt( B * B - 4 * A * C);
		x1 = (-B + determinant) / (2 * A);
		x2 = (-B - determinant) / (2 * A);
		
		
		//Display the result
		System.out.println();
		System.out.println("Input - ");
		System.out.println("    " + A + " x^2 +  " + B + " x +  " + C );
		 
		System.out.println();
		System.out.println("Real number solutions - ");
		System.out.println("             x1: " + x1 ); 
		System.out.println("             x2: " + x2   ); 
	        
	}
    
}
