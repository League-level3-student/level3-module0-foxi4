package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
public static void main(String[] args) {
	Robot[] robots = new Robot[5];
	boolean isRacing = true;
	for(int i = 0; i<robots.length; i++) {
		robots[i]=new Robot();
		
	}
	robots[0].moveTo(100, 550);
	robots[1].moveTo(280, 550);
	robots[2].moveTo(460, 550);
	robots[3].moveTo(640, 550);
	robots[4].moveTo(820, 550);
	while(isRacing) {
	for(int i = 0; i<robots.length; i++) {
		Random rand = new Random();
		int movement = rand.nextInt(50);
		robots[i].setSpeed(10);
		robots[i].move(movement);
		if(robots[i].getY() <= 30) {
			isRacing = false;
			JOptionPane.showMessageDialog(null, "Congrats robot #"+ i + " for winning!!" );
			robots[i].sparkle();
		}
		}
	}
	//ORDER MATTERS! put the while loop AROUND the for loop so it loops for EVERY robot and not just one
	
}
        // 2. create an array of 5 robots.

        // 3. use a for loop to initialize the robots.

        // 4. make each robot start at the bottom of the screen, side by side, facing up
    
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.

}
