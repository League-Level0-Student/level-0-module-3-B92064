package modulo;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
public static void main(String[]args) {
	String answer = JOptionPane.showInputDialog("Which shape would you like me to draw?");
	
	if(answer.equalsIgnoreCase("square")){
		drawSquare();
	}
	else if(answer.equalsIgnoreCase("circle")){
		drawCircle();
	}
	else if(answer.equalsIgnoreCase("triangle")){
		drawTriangle();
	}
	
}
public static void drawSquare() {
	Robot cow = new Robot();
	String color = JOptionPane.showInputDialog("What color would you like me to draw?");
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
	cow.setX(100);
	for(int i = 0; i< 5; i++) {
		cow.move(100);
		cow.turn(90);
		
	}
}
public static void drawTriangle() {
	Robot cow = new Robot();
	String color = JOptionPane.showInputDialog("What color would you like me to draw?");
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
	cow.setX(100);
	for(int i = 0; i< 4; i++) {
		cow.move(100);
		cow.turn(120);
	}
}
public static void drawCircle() {
	Robot cow = new Robot();
	String color = JOptionPane.showInputDialog("What color would you like me to draw?");
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
	cow.setSpeed(1000000);
	cow.setX(100);
	for(int i = 0; i< 72; i++) {
		cow.move(5);
		cow.turn(5);
}
}
}