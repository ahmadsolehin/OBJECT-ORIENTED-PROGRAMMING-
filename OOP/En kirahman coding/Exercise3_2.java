/*
		Introduction to OOP with Java
		McGraw-Hill
		
    Chapter 3 Exercise 2
    
    Verify the results by actually running program.
*/

class Exercise3_2
{
    public static void main (String[] args)
    {
        int m, n, i = 3, j = 4, k = 5;
        float v, w, x = 34.5f, y = 12.25f;
        
        
        System.out.println("a. Math.pow(3,Math.pow(i,j)) -->" + (Math.pow(3,Math.pow(i,j))) );
        System.out.println("b. x / i                     -->" + (x / i)                     );
        System.out.println("c. Math.ceil(y) % k          -->" + (Math.ceil(y) % k)          );
        System.out.println("d. (int) x / y * i / 2       -->" + ((int) x / y * i / 2)       );
        System.out.println("e. Math.sqrt(i*i - 4*j*k)    -->" + (Math.sqrt(i*i - 4*j*k))    );
//      System.out.println("f. n + i * j                 -->" + (n + i * j)                 );
//   	  System.out.println("g. k /(j * i) * x + y        -->" + (k /(j * i) * x + y)        );
        System.out.println("h. i + 1                     -->" + (i + 1)                     );
//      System.out.println("i. float(x + i)              -->" + (float(x + i))              );
        System.out.println("j. x / i / y / j             -->" + (x / i / y / j)             );
    }
    
}