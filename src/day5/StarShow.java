package day5;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/*
 * Before beginning recipe: 1. ask students to find and explain the method in
 * this recipe. 2. ask students how they might use the method to make the
 * picture in the laminated hand-outs.
 */

public class StarShow {

	Robot GG = new Robot("batman");

	void makeStars() {

		// 5. delete this line. you will draw the star again in
		// step 8.
		// 13. Set the speed to 8
		GG.setSpeed(8);
		// 6. Make a variable to hold the X position of the Robot and set it to
		// 10
		int L = 10;
		// 7. Make a variable to hold the Y position of the Robot and set it to
		// 950
		int LL = 950;
		// 8. Make a variable to hold the star size and set it to 25
		int LLL = 25;
		// 12. Repeat the steps #19 to #18, 30 times

		// 19. Set the pen width to i

		// 10. Set the X position of the robot to your X variable
		GG.setX(L);
		// 11. Set the Y position of the robot to your Y variable
		GG.setY(LL);
		// 9. Call the drawStar() method with your star size variable
		drawStar(LLL);
		// 14. Increase the X position by star size. See Figure 2.
		L = L + LLL;
		// 15. decrease the Y position by star size. See Figure 3.
		LL = LL - LLL;
		// 16. Increase the star size by 20

		// 17. Turn the robot 12 degrees

		// 18. Make each star a different random color like in Figure 4.

	}

	private void drawStar(int starSize) {
		// 2. Put the robot's pen down
		GG.penDown();
		// 4. Repeat both commands 5 times. See Figure 1 at
		// http://bit.ly/star-show

		// 1. Move the robot the distance of the starSize variable
		GG.move(starSize);
		GG.turn(144);
		GG.move(starSize);
		GG.turn(144);
		GG.move(starSize);

		GG.turn(144);
		GG.move(starSize);

		GG.turn(144);
		GG.move(starSize);

		GG.turn(144);

	}

	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}
