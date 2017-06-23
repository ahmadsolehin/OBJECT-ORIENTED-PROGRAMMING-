/*
	Introduction to OOP with Java
	McGraw-Hill
		
    Chapter 3 Exercise 31
*/

import javax.swing.*;
import galapagos.*;

class Exercise3_31 {
	
	public static void main(String[] args) {
		
		int width, length;
		int originalWidth, originalLength;
		Turtle myTurtle;

		myTurtle = new Turtle();

		width = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter width of smallest rectangle"));
		length = Integer.parseInt(JOptionPane.showInputDialog(null,
				"Enter length of smallest rectangle"));

		// smallest rectangle
		myTurtle.jumpTo(0 - (width / 2f), 0 - (length / 2f));
		myTurtle.move(width);
		myTurtle.turn(90);
		myTurtle.move(length);
		myTurtle.turn(90);
		myTurtle.move(width);
		myTurtle.turn(90);
		myTurtle.move(length);
		myTurtle.turn(90);

		originalWidth = width;
		originalLength = length;

		// medium rectangle
		width = (int) (width * 1.40);
		length = (int) (length * 1.40);
		myTurtle.jumpTo(0 - (width / 2f), 0 - (length / 2f));
		myTurtle.move(width);
		myTurtle.turn(90);
		myTurtle.move(length);
		myTurtle.turn(90);
		myTurtle.move(width);
		myTurtle.turn(90);
		myTurtle.move(length);
		myTurtle.turn(90);

		// largest rectangle
		width = (int) (originalWidth * 1.80);
		length = (int) (originalLength * 1.80);
		myTurtle.jumpTo(0 - (width / 2f), 0 - (length / 2f));
		myTurtle.move(width);
		myTurtle.turn(90);
		myTurtle.move(length);
		myTurtle.turn(90);
		myTurtle.move(width);
		myTurtle.turn(90);
		myTurtle.move(length);
		myTurtle.turn(90);
	}
}
