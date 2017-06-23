/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 32
*/

import javax.swing.*;
import galapagos.*;

class Exercise3_32 {
	
	public static void main(String[] args) {
		
		int val1, val2, val3, val4, val5;
		int height1, height2, height3, height4, height5;
		int maxValue = 0;
		Turtle myTurtle;
		myTurtle = new Turtle();

		// make the turtle faster!
		myTurtle.speed(100);

		val1 = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter a value"));
		val2 = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter a value"));
		val3 = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter a value"));
		val4 = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter a value"));
		val5 = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter a value"));

		// find out what is the maximum value
		if (val1 > val2)
			maxValue = val1;
		if (val2 > maxValue)
			maxValue = val2;
		if (val3 > maxValue)
			maxValue = val3;
		if (val4 > maxValue)
			maxValue = val4;
		if (val5 > maxValue)
			maxValue = val5;

		// axes
		myTurtle.jumpTo(200, -150);
		myTurtle.move(-400);
		myTurtle.turn(90);
		myTurtle.move(300);

		// ticks
		myTurtle.turn(-90);
		myTurtle.jumpTo(-205, -150 + 300 / 7);
		myTurtle.move(10);
		myTurtle.jumpTo(-205, -150 + 2 * 300 / 7);
		myTurtle.move(10);
		myTurtle.jumpTo(-205, -150 + 3 * 300 / 7);
		myTurtle.move(10);
		myTurtle.jumpTo(-205, -150 + 4 * 300 / 7);
		myTurtle.move(10);
		myTurtle.jumpTo(-205, -150 + 5 * 300 / 7);
		myTurtle.move(10);
		myTurtle.jumpTo(-205, -150 + 6 * 300 / 7);
		myTurtle.move(10);

		// draw bars
		myTurtle.turn(90);
		height1 = (int) (val1 / (double) maxValue * 290);
		myTurtle.jumpTo(-160, -150);
		myTurtle.move(height1);
		myTurtle.turn(-90);
		myTurtle.move(40);
		myTurtle.turn(-90);
		myTurtle.move(height1);
		myTurtle.turn(180);

		height2 = (int) (val2 / (double) maxValue * 290);
		myTurtle.jumpTo(-80, -150);
		myTurtle.move(height2);
		myTurtle.turn(-90);
		myTurtle.move(40);
		myTurtle.turn(-90);
		myTurtle.move(height2);
		myTurtle.turn(180);

		height3 = (int) (val3 / (double) maxValue * 290);
		myTurtle.jumpTo(0, -150);
		myTurtle.move(height3);
		myTurtle.turn(-90);
		myTurtle.move(40);
		myTurtle.turn(-90);
		myTurtle.move(height3);
		myTurtle.turn(180);

		height4 = (int) (val4 / (double) maxValue * 290);
		myTurtle.jumpTo(80, -150);
		myTurtle.move(height4);
		myTurtle.turn(-90);
		myTurtle.move(40);
		myTurtle.turn(-90);
		myTurtle.move(height4);
		myTurtle.turn(180);

		height5 = (int) (val5 / (double) maxValue * 290);
		myTurtle.jumpTo(160, -150);
		myTurtle.move(height5);
		myTurtle.turn(-90);
		myTurtle.move(40);
		myTurtle.turn(-90);
		myTurtle.move(height5);
		myTurtle.turn(180);

		// write the numbers
		myTurtle.jumpTo(-155, height1 - 150 + 10);
		myTurtle.print(val1 + "");
		myTurtle.jumpTo(-75, height2 - 150 + 10);
		myTurtle.print(val2 + "");
		myTurtle.jumpTo(5, height3 - 150 + 10);
		myTurtle.print(val3 + "");
		myTurtle.jumpTo(85, height4 - 150 + 10);
		myTurtle.print(val4 + "");
		myTurtle.jumpTo(165, height5 - 150 + 10);
		myTurtle.print(val5 + "");
	}
}
