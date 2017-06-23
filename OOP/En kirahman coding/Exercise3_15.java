/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 15
    
    Program that inputs the radius r and outputs a satellite's velocity.
    The velocity of a satellite circling around the Earth is computed by
    the formula:
 
 		v = Math.sqrt(G * ME / r)

    where ME = 5.98 * Math.pow(10, 24) is the mass of the Earth in kilograms,
    r the distance from the center of the Earth to the satellite in meters,
    and G = 6.67 * Math.pow(10, -11) is the universal gravitational constant
    (in  cubic meters /(kg * square seconds)). The unit of the velocity v
    is m/s.
    
*/

import java.util.*;

class Exercise3_15
{
	private final static double ME = 5.98 * Math.pow(10, 24);
	private final static double G = 6.67 * Math.pow(10, -11); 
	
    public static void main (String[] args)
    {
    	Scanner scanner = new Scanner (System.in);
        double r, v; 
        
        //Get input
        System.out.println("Distance from the center of the Earth to the satellite (in meters): ");
        r = scanner.nextDouble();
        
        //Compute the velocity
        v = Math.sqrt(G * ME / r);
        
        
        //Display the result
        System.out.println("The satellite's velocity is: "
        		+ Math.round(v * 100) / 100f + " m/s");
      
    }
    
}
