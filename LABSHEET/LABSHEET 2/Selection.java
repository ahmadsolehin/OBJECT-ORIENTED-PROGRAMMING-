/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selection;

import javax.swing.JOptionPane;

/**
 *
 * @author FSK
 */
public class Selection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Exercise 3.1 
        double a, b, y;
        String inA, inB, inC, outY;
        
        inA = JOptionPane.showInputDialog(null, "Enter Value A :");
        inB = JOptionPane.showInputDialog(null, "Enter Value B :");
        
        a = Double.parseDouble(inA);
        b = Double.parseDouble(inB);
        
        if (a > 5)
        {
            y = ( (3 + a) / (2 + a + b) );
        }
        else
            y = (a + b);
        
        outY = Double.toString(y);
        JOptionPane.showMessageDialog(null, "Y = " +outY);
        */
        
        /* Exercise 3.2 
        int a, b, c;
        String inA, inB, inC;
        
        inA = JOptionPane.showInputDialog(null, "Enter Value A :");
        inB = JOptionPane.showInputDialog(null, "Enter Value B :");
        inC = JOptionPane.showInputDialog(null, "Enter Value C :");
        
        a = Integer.parseInt(inA);
        b = Integer.parseInt(inB);
        c = Integer.parseInt(inC);
        
        if ( a > b)
        {
            if (a > c)
            {
                JOptionPane.showMessageDialog(null, "Value A is a maximum number");
            }
            else
                JOptionPane.showMessageDialog(null, "Value C is a maximum number");
        }
        else if( c > b)
        {
            JOptionPane.showMessageDialog(null, "Value C is a maximum number");
        }
        else
            JOptionPane.showMessageDialog(null, "Value B is a maximum number");
        
        */
        
        /* Exercise 3.3 
        
        int v, value, even, odd;
        String inV;
        
        inV = JOptionPane.showInputDialog(null, "Enter Integer Value :");
        v = Integer.parseInt(inV);
        
        //value = v / 2;
        
        if ((v%2) == 0 ) // % means remainder value
        {
            JOptionPane.showMessageDialog(null, "Value is a even number");
        }
        else
            JOptionPane.showMessageDialog(null, "Value is a odd number");
        */
        
        /* Exercise 3.4 */
        int m;
        String month;
        do
        {
            month = JOptionPane.showInputDialog(null, "Insert value 1 - 12 only ");
            m = Integer.parseInt(month);
            
            if (m < 12 && m > 0)
            {
                if (m == 1)
                {
                    JOptionPane.showMessageDialog(null, m + " is January");
                }
                if (m == 2)
                {
                    JOptionPane.showMessageDialog(null, m + " is February");
                }
                if (m == 3)
                {
                    JOptionPane.showMessageDialog(null, m + " is March");
                }
                if (m == 4)
                {
                    JOptionPane.showMessageDialog(null, m + " is April");
                }
                if (m == 5)
                {
                    JOptionPane.showMessageDialog(null, m + " is May");
                }
                if (m == 6)
                {
                    JOptionPane.showMessageDialog(null, m + " is June");
                }
                if (m == 7)
                {
                    JOptionPane.showMessageDialog(null, m + " is July");
                }
                if (m == 8)
                {
                    JOptionPane.showMessageDialog(null, m + " is August");
                }
                if (m == 9)
                {
                    JOptionPane.showMessageDialog(null, m + " is September");
                }
                if (m == 10)
                {
                    JOptionPane.showMessageDialog(null, m + " is October");
                }
                if (m == 11)
                {
                    JOptionPane.showMessageDialog(null, m + " is November");
                }
                if (m == 12)
                {
                    JOptionPane.showMessageDialog(null, m + " is December");
                }
                
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Wrong Value");
                m = 0;
            }   
        }
        while(m == 0);
        
    }
    
}
