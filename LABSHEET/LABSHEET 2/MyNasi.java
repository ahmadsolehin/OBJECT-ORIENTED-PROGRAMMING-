/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mynasi;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author FSK
 */
public class MyNasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        //return 
        double p, pd, totalP, d;
        int q;
        String quantity;
        
        quantity = JOptionPane.showInputDialog(null, "Insert Quantity Order (1 = RM5.50) ");
        q = Integer.parseInt(quantity);
        
        p = q * 5.50;
        
        if (q > 100)
        {
            d = 20;
            pd = (d / 100) * p;
            Double.valueOf(twoDForm.format(pd));
            totalP = p - pd;
            Double.valueOf(twoDForm.format(totalP));
        }
        else if (q > 50)
        {
            d = 10;
            pd = (d / 100) * p;
            Double.valueOf(twoDForm.format(pd));
            totalP = p - pd;
            Double.valueOf(twoDForm.format(totalP));
        }
        else if (q > 25)
        {
            d = 5;
            pd = (d / 100) * p;
            Double.valueOf(twoDForm.format(pd));
            totalP = p - pd;
            Double.valueOf(twoDForm.format(totalP));
        }
        else
        {
            d = 0;
            pd = (d / 100) * p;
            Double.valueOf(twoDForm.format(pd));
            totalP = p - pd;
            Double.valueOf(twoDForm.format(totalP));
        }
        
        JOptionPane.showMessageDialog(null, "Number of ordered : "+ q +"\n Price RM"+ p +"\n Discount:"+ d +"%  RM"+ pd +"\n Total Price RM"+ totalP);
    }
    
}
