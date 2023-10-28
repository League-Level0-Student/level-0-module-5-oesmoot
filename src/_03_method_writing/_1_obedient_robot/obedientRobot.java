package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class obedientRobot {
	public static void main(String[] args) {
		Robot rob = new Robot();
		String shape = JOptionPane.showInputDialog("choose a shape (square, circle, triangle)");
		String color = JOptionPane.showInputDialog("choose a color ");
		if (color.equals("orange")) {
			orange(rob);	
		}
		if (color.equals("red")) {
			red(rob);
		}
		if (color.equals("yellow")) {
			yellow(rob);
		}
		if (color.equals("green")) {
			green(rob);
		}
		if (color.equals("blue")) {
			blue(rob);
		}
		if (color.equals("purple")) {
			purple(rob);
		}
		if (shape.equals("square")) {
			square(rob);
		}
		else if(shape.equals("circle")) {
			circle(rob);
		}
		else if(shape.equals("triangle")) {
			triangle(rob);
		}
	}
	static void square( Robot rob) {
		rob.penDown();
		rob.setSpeed(50);
		rob.hide();
		for(int i = 0; i<4; i++) {
			rob.move(100);
			rob.turn(90);
		}

	}
	static void triangle(Robot rob) {
		rob.penDown();
		rob.setSpeed(50);
		rob.hide();
		for(int i = 0; i <3; i++) {
			rob.move(100);
			rob.turn(120);
		}
	}
	static void circle(Robot rob) {
		rob.penDown();
		rob.setSpeed(1);
		rob.hide();
		for(int i = 0; i<360; i++) {
			rob.move(1);
			rob.turn(1);
		}
	}
	static void orange(Robot rob) {
		rob.setPenColor(252, 157, 3);
	}
	static void red(Robot rob) {
		rob.setPenColor(255,0,0);
	}
	static void yellow(Robot rob) {
		rob.setPenColor(255, 251, 0);
	}
	static void green(Robot rob ) {
		rob.setPenColor(17, 255, 0);
	}
	static void blue(Robot rob) {
		rob.setPenColor(0, 30, 255);
	}
	static void purple(Robot rob) {
		rob.setPenColor(179, 0, 255);
	}

}
