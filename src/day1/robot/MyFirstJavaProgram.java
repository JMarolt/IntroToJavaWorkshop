package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {

		// START HERE

		Robot Jack = new Robot();
		Jack.penDown();
		Jack.setSpeed(10);
		// Jack.move(100);
		// Jack.turn(90);
		// Jack.penDown();
		// Jack.setSpeed(10);
		// Jack.move(100);
		// Jack.turn(90);
		// Jack.penDown();
		// Jack.setSpeed(10);
		// Jack.move(100);
		// Jack.turn(90);
		// Jack.penDown();
		// Jack.setSpeed(10);
		// Jack.move(100);
		// Jack.turn(90);
		for (int i = 0; i < 4; i++) {
			Jack.setPenColor(255, 0, 0);
			Jack.move(100);
			Jack.turn(90);
			Jack.

		}
	}
}
