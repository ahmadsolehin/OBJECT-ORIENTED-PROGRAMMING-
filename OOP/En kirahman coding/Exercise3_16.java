/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 16
    
    A program that inputs the user’s earth weight and outputs his/her 
    weight on Mercury, Venus, Jupiter, and Saturn. The factors to convert
    the Earth weight to the individual planet are as follow:
    
      Mercury    0.4
      Venus      0.9
      Jupiter    2.5
      Saturn     1.1
*/

import java.util.*;

class Exercise3_16
{
	//Factors to convert the Earth weight to the corresponding planet
	private static final double EARTH_TO_MERCURY = 0.4; 
	private static final double EARTH_TO_VENUS   = 0.9;
	private static final double EARTH_TO_JUPITER = 2.5;
	private static final double EARTH_TO_SATURN  = 1.1;
	
	public static void main (String[] args)
	{
		Scanner     scanner;
		double      weightOnEarth,
		            weightOnMercury,
		            weightOnVenus,
		            weightOnJupiter,
		            weightOnSaturn;
		
		scanner = new Scanner ( System.in );
		
		//Get input
		System.out.println("Enter your weight on Earth (in lbs. e.g. 165.9):");
		weightOnEarth = scanner.nextDouble();
		
		//Convert the Earth weight to the corresponding weight on other planets      
		weightOnMercury = weightOnEarth * EARTH_TO_MERCURY;
		weightOnVenus   = weightOnEarth * EARTH_TO_VENUS;
		weightOnJupiter = weightOnEarth * EARTH_TO_JUPITER;
		weightOnSaturn  = weightOnEarth * EARTH_TO_SATURN;
		
		
		//Display the result
		 System.out.println( "Input - \n"
		 +"    Weight on Earth: " + weightOnEarth + " lbs. \n\n"
		 +"Output - \n"
		 +"    Weight on Mercury: " + weightOnMercury + " lbs. \n"
		 +"    Weight on Venus:   " + weightOnVenus   + " lbs. \n"
		 +"    Weight on Jupiter: " + weightOnJupiter + " lbs. \n"
		 +"    Weight on Saturn:  " + weightOnSaturn  + " lbs. \n" );
        
	}

}
