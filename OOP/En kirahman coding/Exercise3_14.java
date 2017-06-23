/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 14
    
    Program that computes the volume of a sphere with a given radius r,
    using the following formula:
 
 		v = 4.0 / 3.0 * Math.PI * r * r * r
  
*/

import java.util.*;

class Exercise3_14
{
    public static void main (String[] args)
    {
    	Scanner scanner = new Scanner (System.in);
        double r, v; 
        
        //Get input
        System.out.print("Radius of the sphere: ");
        r = scanner.nextDouble();
        
        //Compute the volume
        v = 4.0 / 3.0 * Math.PI * r * r * r;
                
        //Display the result
        System.out.println("The volume of the sphere is: "
        		+ Math.round(v * 100) / 100f);
      
    }
    
}
