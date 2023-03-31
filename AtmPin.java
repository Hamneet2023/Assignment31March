package Loops;

import java.util.Scanner;

public class AtmPin {

	// 1. In the question discussed in class add a condition that if the customer
	// should be able to take out money only if they have available balance.
	// 2. Add a logic to display that the card is blocked after entering PIN
	// incorrectly 3 times.
	// PIN should be locked if entered incorrectly 3 times

	int actualPIN = 1234;
	int enteredPIN;
	int withdrawAmount;
	double Balance = 1000;

	Scanner sc = new Scanner(System.in);

	void checkPinIsCorrect() {

		
		for (int counter = 1; counter <= 3; counter++) {
			
			System.out.println("Enter your four digit pin :");
			enteredPIN = sc.nextInt();
			
			if (counter <=3 && actualPIN == enteredPIN) {
				System.out.println("Please enter your withdrawn amount:");
				withdrawAmount = sc.nextInt();

				if (Balance > withdrawAmount) {
					System.out.println("Please take your cash");
					break;

				}
				else {
					System.out.println("you do not have enough balance");
					       if(counter==3) {
					    	   System.out.println("please try it tomorow you exceed the limit for today");
					       }
					}

			}else {
				if(counter==3)
				System.out.println(" card blocked");}
		} // for loop ends here
	}// checkPinIsCorrect() method ends here
}
