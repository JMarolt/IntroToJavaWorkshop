package day3;


	 import java.util.Random;

import javax.swing.JOptionPane;

	// Copyright Wintriss Technical Schools 2013
	public class highlowgame {

		public static void main(String[] args) {
			// 3. Change this line to give you a random number between 1 - 100. 
			int random = new Random().nextInt(1001);
			// 2. Print out the random variable above
			System.out.println();
			// 11. do the following 10 times
			
				// 1. ask the user for a guess using a pop-up window, and save their response 
String Ans = JOptionPane.showInputDialog("Pick a number from 1 to a 1000");
int number = Integer.parseInt(Ans);
if(Ans.equals("")) {
	JOptionPane.showMessageDialog(null, "Correct!");
}else{
}
				// 4. convert the users’ answer to an int (Integer.parseInt(string))
				
				// 5. if the guess is correct
					// 6. win
				// 7. if the guess is high
					// 8. tell them it's too high
				// 9. if the guess is low
					// 10. tell them it's too low

			// 12. tell them they lose
		}

	}



