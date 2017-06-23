/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 21
    
    An application that accepts n and displays nth Fibonacci number Fn using the formula
   
   
           Fn = (1/sqrt(5)) * ( (1+sqrt(5))/2) ^ n) - (1-sqrt(5))/2) ^ n) )
    
    Fn is displayed as an int value.
    
*/

import java.util.*;

class Exercise3_21
{
	public static void main (String[] args)
	{
		int n, nthFibonacciNumber;
		Scanner scanner = new Scanner(System.in);


		//Get input
		System.out.println("Enter N to compute the Nth Fibonacci number:");
		n = scanner.nextInt();


		//Compute Fn
		nthFibonacciNumber = (int) ( (1 / Math.sqrt(5)) *
				( Math.pow( (1 + Math.sqrt(5)) / 2, n )
						-
						Math.pow( (1 - Math.sqrt(5)) / 2, n ) ) );


		//Display the result
		System.out.println(" n : " +  n + "\n"
				+" Fn: " +  nthFibonacciNumber );

		//Note: if n is too big, then overflow will occur as the number becomes too
		//      big for an int varialbe. Exercise: what is the maximum n before
		//      an overflow occurs? If you get the result 2147483647 for Fn, then
		//      it is most likely an overflow condition.

		//Uncomment to see the result in double
		//System.out.println(  (1 / Math.sqrt(5)) *
		//                            ( Math.pow( (1 + Math.sqrt(5)) / 2, n )
		//                                 -
		//                               Math.pow( (1 - Math.sqrt(5)) / 2, n ) ) );

	}

}
