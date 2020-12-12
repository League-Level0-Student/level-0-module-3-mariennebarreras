// yeah!  now, do you need a review of code to work with Robo  ok i'll get back to you in a mom
package _01_else_if._1_robot_color_chooser;

// looks like this ways missing:
import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot rob=new Robot();
		// move the pen down code here so it will draw right away.
		rob.penDown();
		// to make a square for example - do 4 pairs of move-then-turn 90
		
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.move(100);
		rob.turn(90);
		rob.setSpeed(90);  //
		//3. Set the pen width to 10
		
		// great!  now go to step 4 - wait amoment... i can give you more info...
		
		// to ask the user something:
		// String userAnswer = JOptionPane.... do you remember that?  try it
		
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog(null, "What color pen would you like?"); 
		
	
		//5. Use an if/else statement to set the pen color that the user requested
		// questions? yes, how do i do a if statement?
		// if ( ... ) {		// inside the parentheses is a test condition...it's
		//						either true or false.  here for example you
		//						might test if the variable color is "red"
		//do i put a sentence there? you mean inside the (...)? yes
		// no, here are some typical test conditions:
		//   if (score == 100)		this is a test condition for a number
		//   if (name.equals("Mariene"))		this is for a string
		// which type is 'color' - a string or a number?
		// }string?
		// good.  now where is the color string that the user picked stored?
		// right.  so can you fix the test condition in line 53 now like that
		// fix this what do i putin the quotes?  a color of your choice
		// good... BUT no semicolon after 'if' line  instead a pair of {}
		if(color.equals("blue")) {
			// any idea how to tell the robot to draw in blue?nope
			// type the name of teh robot then a period and choose one of the pulldown
			// methods ...
			// can you save your work or should I help you do that? can you help me
		}
        //6. If the user doesn't e!nter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
/* here is some sample code:
 * 
 * 
 * 
Robot rob = new Robot();
rob.penDown();
rob.setSpeed(20);
rob.move(100);
rob.turn(90);
 */
