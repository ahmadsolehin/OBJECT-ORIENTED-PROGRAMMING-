/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 13
    
    A program that accepts principal P, interest rate R compounded annually,
    and the number of invested years N and computes the amount of money 
    earned after the N years using the formula
    
        P * Math.pow((1 + R/100), N) 
    
*/

import java.util.*;

class Exercise3_13
{
    public static void main (String[] args)
    {
    	Scanner     scanner;
        int         yearsInvested; 
        
        double      interestRate,
                    principal,
                    maturityAmount;
        
        scanner = new Scanner ( System.in );
        
        //Get input
        System.out.print("Amount to invest: ");
        principal     = scanner.nextDouble(); 

        System.out.print("Annual interest rate: ");
        interestRate  = scanner.nextDouble(); 

        System.out.print("Number of years: ");
        yearsInvested = scanner.nextInt(); 

        //Compute the investment growth
        maturityAmount = principal * Math.pow((1 + interestRate/100), yearsInvested);        
        
        //Display the result
        System.out.println("Principal:      $ " +  principal
			     +"\nInterest Rate:    " +  interestRate + "% (compounded annually)\n"
			     +"Years invested:   " +  yearsInvested + "\n\n"
			     +"        Return:  $ " + Math.round(maturityAmount * 100) / 100f );
      
    }
    
}
