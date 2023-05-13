package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		// 2. create an array of 5 robots.
		Robot[] robs = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robs.length; i++) {
			robs[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for (int i = 0; i < robs.length; i++) {
			robs[i].setX(800/robs.length*i + 60);
			robs[i].setY(500);
			robs[i].setSpeed(10);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random random = new Random();
		boolean running = true;
		int winner;
		while(running) {
		for (int i = 0; i < robs.length; i++) {
			int rand = random.nextInt(50);
			robs[i].move(rand);
			if(robs[i].getY() <=100) {
				running = false;
				winner = i+1;
				System.out.println("Robot " + winner + " is the winner!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
			}
		}
	}
	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.

}

}
