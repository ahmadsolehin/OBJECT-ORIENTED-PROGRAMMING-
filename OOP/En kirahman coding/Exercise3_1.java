/*
		Introduction to OOP with Java
		McGraw-Hill
		
    Chapter 3 Exercise 1
    
    Verify the results by actually running program.
*/

class Exercise3_1
{
    public static void main (String[] args)
    {
        int i = 3, j = 4, k = 5;
        float x = 34.5f, y = 12.25f;
        
        System.out.println("a. (x + 1.5) / (250.0 * (i/j)) -->" + ((x + 1.5) / (250.0 * (i/j))));
        System.out.println("b. x + 1.5 / 250.0 * i / j     -->" + (x + 1.5 / 250.0 * i / j)    );
        System.out.println("c. -x * -y * (i + j) / k       -->" + (-x * -y * (i + j) / k)      );
        System.out.println("d. (i / 5) * y                 -->" + ((i / 5) * y)                );
        System.out.println("e. Math.min(i, Math.min(j,k))  -->" + (Math.min(i, Math.min(j,k))) );
 //  	  System.out.println("f. Math.exp(3, 2)              -->" + (Math.exp(3, 2))             );
        System.out.println("g. y % x                       -->" + (y % x)                      );
        System.out.println("h. Math.pow(3, 2)              -->" + (Math.pow(3, 2))             );
        System.out.println("i. (int)y % k                  -->" + ((int)y % k)                 );
        System.out.println("j. i / 5 * y                   -->" + (i / 5 * y)                  );
    }
    

}