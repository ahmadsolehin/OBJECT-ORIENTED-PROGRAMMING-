/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 17
    
    A program that inputs the user’s earth age and print outs his/her age 
    on Mercury, Venus, Jupiter, and Saturn using the formula
    
                    y = (x * 365) / d
    
    where x is the age on the earth, y is the age on planet Y, and d is the number
    earth days the planet Y takes to travel around the sun.
    The values for d are listed in the table below:
    
                Mercury       88
                Venus        225
                Jupiter     4380
                Saturn     10767

*/

import java.util.*;

class Exercise3_17
{
	//The number of earth days in the planet's one year
	private static final int EARTH_DAYS_IN_MERCURY_YEAR =    88; 
	private static final int EARTH_DAYS_IN_VENUS_YEAR   =   225;
	private static final int EARTH_DAYS_IN_JUPITER_YEAR =  4380;
	private static final int EARTH_DAYS_IN_SATURN_YEAR  = 10767;
	private static final int EARTH_DAYS_IN_EARTH_YEAR   =   365;
	
	public static void main (String[] args)
	{
		Scanner scanner;
		
		int ageOnEarth,
		    ageOnMercury,
		    ageOnVenus,
		    ageOnJupiter,
		    ageOnSaturn;
		
		scanner = new Scanner ( System.in );
		
		//Get input
		System.out.println("Enter your age on Earth (e.g. 20):");
		ageOnEarth = scanner.nextInt();
		
		//Convert the Earth age to the corresponding age on other planets      
		ageOnMercury = (ageOnEarth * EARTH_DAYS_IN_EARTH_YEAR) /  EARTH_DAYS_IN_MERCURY_YEAR;
		ageOnVenus   = (ageOnEarth * EARTH_DAYS_IN_EARTH_YEAR) /  EARTH_DAYS_IN_VENUS_YEAR;
		ageOnJupiter = (ageOnEarth * EARTH_DAYS_IN_EARTH_YEAR) /  EARTH_DAYS_IN_JUPITER_YEAR;
		ageOnSaturn  = (ageOnEarth * EARTH_DAYS_IN_EARTH_YEAR) /  EARTH_DAYS_IN_SATURN_YEAR;
		
		
		//Display the result
		System.out.println( "Input - \n"
			  +"    Age on Earth: " + ageOnEarth + " years old. \n\n"
			  +"Output - \n"
			  +"    Age on Mercury: " + ageOnMercury + " years old. \n"
			  +"    Age on Venus:   " + ageOnVenus   + " years old. \n"
			  +"    Age on Jupiter: " + ageOnJupiter + " years old. \n"
			  +"    Age on Saturn:  " + ageOnSaturn + " years old. " ); 
		
	      
	}

}
