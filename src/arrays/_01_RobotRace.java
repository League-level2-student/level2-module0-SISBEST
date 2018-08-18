package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	static int y = 0;
	static boolean fin = false;
	public static void main(String[] args) {
		Robot [] rarr = new Robot [5];
	for(int i = 0; i<rarr.length; i++) {
		rarr [i] = new Robot("batman");
		rarr [i].setSpeed(50);
		rarr [i].moveTo(0, y);
		rarr [i].turn(90);
		y += 100;
	}
	while(fin == false) {
	for(int i = 0; i<rarr.length; i++) {
		Random r = new Random();
		rarr[i].move(r.nextInt(50));
		if(rarr[i].getX() >= 875) {
			fin = true;
			System.out.println("And we have a winner :" + rarr[i] + "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!"); 
		}
	}}
	
}}
