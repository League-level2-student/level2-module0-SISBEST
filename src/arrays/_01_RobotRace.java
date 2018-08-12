package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static int y = 0;
	static boolean fin = false;
	//1. make a main method
	public static void main(String[] args) {
	//2. create an array of 5 robots.
		Robot [] rarr = new Robot [5];
	//3. use a for loop to initialize the robots.
	for(int i = 0; i<rarr.length; i++) {
		rarr [i] = new Robot("batman");
		rarr [i].setSpeed(50);
		rarr [i].moveTo(0, y);
		rarr [i].turn(90);
		y += 100;
	}
		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
	while(fin = false) {
	for(int i = 0; i<rarr.length; i++) {
		Random r = new Random();
		rarr[i].move(r.nextInt(50));
		if(rarr[i].getX() >= 800) {
			fin = true;
			System.out.println("And " + rarr [i] + " wins the race!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"); 
		}
	}}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}}
