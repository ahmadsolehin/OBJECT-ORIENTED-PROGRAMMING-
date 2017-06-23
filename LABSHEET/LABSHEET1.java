/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithexpression;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class CB15003 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String inputStr;
        int age;
        inputStr=JOptionPane.showInputDialog(null, "Enter Your Age");
        age = Integer.parseInt(inputStr);
        JOptionPane.showMessageDialog(null, inputStr);
        String str;
      // float z;
        //str = Float.toString(z);
        str=JOptionPane.showInputDialog(null, "Celsius");
        JOptionPane.showMessageDialog(null, str);
        
        
        float temperatue;
    Scanner in = new Scanner(System.in);      
 
    System.out.println("Enter temperatue in Fahrenheit");
    temperatue = in.nextInt();
 
    temperatue = ((temperatue - 32)*5)/9;
 
    System.out.println("Temperatue in Celsius = " + temperatue);

        
    // Exercise 6: Development of Fahrenheit program

        String x = JOptionPane.showInputDialog(null, "Enter Celcius : ");
        int ayam = Integer.parseInt(x);

        double fahren = (1.8 * ayam) + 32;
    JOptionPane.showMessageDialog(null, String.valueOf(fahren));
        
    }
    
}
