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
	    //2. Make the robot draw a shape (this will take more than one line of code)
		rob.move(100);
		rob.turn(90);
		rob.setSpeed(30);  // Marienne - you still here?  save your work before Committing.
		//3. Set the pen width to 10
		rob.penDown();
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
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
