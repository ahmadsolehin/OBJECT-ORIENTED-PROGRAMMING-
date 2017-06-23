/*
 * SOLEHIN
 * CB15003
 * LAB 3
 */
package loops;
import javax.swing.JOptionPane;

public class Loops {
    public FindGCD find;
    
    public static void main(String[] args) {
        /* Exercise 3: Learning loop statements */
        /*
        int sum = 0, number;
        
        for(number = 1; number <= 50; number++)
        {   
            if (number % 2 == 0)
            {
                sum = sum + 0;
            }
            else
            {
                sum = number + sum; // sum only odd number
            }  
        }
        JOptionPane.showMessageDialog(null, "Total sum of odd number is "+sum);
        */
        
        /* Exercise 4: Finding Greatest Common Divisor (GCD) */
        /*
        FindGCD find = new FindGCD();
        int num1, num2;
        String no1, no2;
        
        no1 = JOptionPane.showInputDialog(null, "Insert Number 1 : ");
        num1 = Integer.parseInt(no1);
        no2 = JOptionPane.showInputDialog(null, "Insert Number 2 : ");
        num2 = Integer.parseInt(no2);
        find.setNumber1(num1);
        find.setNumber2(num2);
        
        JOptionPane.showMessageDialog(null, "GCD of " +num1+ " and " +num2+ " is " +find.totalGCD());
        */
        
        /* Exercise 5: Prime numbers */
        int number, num, i;
        String no;
        num = 0;
        
        no = JOptionPane.showInputDialog(null, "Insert Number : ");
        number = Integer.parseInt(no);
        
        for(i=1; i<(number+1); i++){
            if (number % i == 0)
            {
                num++;
            }
        }
        JOptionPane.showMessageDialog(null, "Prime number is " +isPrime(num));
        
    }
    
    public static boolean isPrime(int num) {
        
        if(num == 2)
            return true;
        else {
            return false;
        }
    }
    
}
