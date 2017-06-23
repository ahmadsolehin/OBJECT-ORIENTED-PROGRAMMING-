/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 26
    
    A program that accepts principal P, interest rate R compounded annually,
    and the number of invested years N and computes the amount of money 
    earned after the N years using the formula
    
        P * ( 1 - Math.pow( R/100, N+1) ) / ( 1 - R / 100) 
    
*/

import java.util.Scanner;

class Exercise3_26 {
	
	public static void main(String[] args) {
		
		int yearsInvested;

		double interestRate, principal, maturityAmount;

		Scanner scanner;
		scanner = new Scanner(System.in);

		//Get input
		System.out.print("Amount to invest: ");
		principal = scanner.nextDouble();
		System.out.print("Effective annual interest rate: ");
		interestRate = scanner.nextDouble();
		System.out.print("Number of years: ");
		yearsInvested = scanner.nextInt();

		//Convert the effective annual interest rate to stated annual interest rate
		interestRate = (Math.pow((1 + interestRate), 1f / 12f) - 1) * 12;

		//Compute the investment growth
		maturityAmount = principal
				* (1 - Math.pow(interestRate / 100, yearsInvested + 1))
				/ (1 - interestRate / 100);

		//Display the result
		System.out.println(" Principal:      $ " + principal);
		System.out.println(" Interest Rate:    " + interestRate
				+ "% (compounded annually)");
		System.out.println(" Years invested:   " + yearsInvested);
		System.out.println();

		System.out.println("        Return:  $ "
				+ Math.round(maturityAmount * 100) / 100f);

	}

}
