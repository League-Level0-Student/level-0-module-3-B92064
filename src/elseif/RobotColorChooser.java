//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;
import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot cow = new Robot();
		//3. Ask the user what color they would like the robot to draw
		for(int u = 0; u < 1000000; u ++) {
		String color = JOptionPane.showInputDialog("What color would you like to draw with?");
		//5. Use an if/else statement to set the pen color that the user requested
		if(color.equalsIgnoreCase("green")){
		cow.setPenColor(0, 255, 77);
		}
		else if(color.equalsIgnoreCase("blue")) {
		cow.setPenColor(47, 84, 188);
		}
		else if(color.equalsIgnoreCase("red")) {
			cow.setPenColor(148, 0, 0);
			}
		else if(color.equalsIgnoreCase("yellow")) {
			cow.setPenColor(240, 230, 140);
			}
		else if(color.equalsIgnoreCase("pink")) {
			cow.setPenColor(255, 47, 213);
			}
		else if(color.equalsIgnoreCase("black")) {
			cow.setPenColor(0, 0, 0);
			}
		else if(color.equalsIgnoreCase("purple")) {
			cow.setPenColor(123, 25, 188);
			}
		else if(color.equalsIgnoreCase("orange")) {
			cow.setPenColor(255, 94, 0);
			}
		else if(color.equalsIgnoreCase("")) {
			cow.setRandomPenColor();
			}
		cow.penDown();
		cow.setSpeed(100);
		cow.setPenWidth(10);
		for (int i = 0; i < 5; i++){
			cow.move(100);
			cow.turn(40);
		}
		}
        //6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
