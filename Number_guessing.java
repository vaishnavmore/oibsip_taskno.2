//hey everyone
//name:vaishnav more
// Task 2 - Number Guessing 
// Java Programming


package Number;

import java.io.*;
import java.util.*;

public class Number_Guessing{
	public static void Num_Guessing() {

		Scanner sc = new Scanner(System.in);
		int num = 1 + (int) (100 * Math.random()); 
		int rounds = 5;
		int guess, i, again, points = 0;

		System.out.println("hello!! Welcome to Guess the Number game..");
		System.out.println("Input a number between 1 to 100");

		for (i = 0; i < 5; i++) {
			System.out.println("\nTry to Guess a number..");
			guess = sc.nextInt();

			if (guess > 100 || guess < 0) {
				System.out.println("Sorry!! You have to enter only number between 1 to 100");
			} else if (guess == num) {
				System.out.println("Congrats!! You guessed right");
				points += 10;
				System.out.println("Your score is " + points);
			} else if (guess > num && i != rounds - 1) {
				System.out.println("Oops! Number is less than" + guess);
			} else if (guess < num && i != rounds - 1) {
				System.out.println("Oops! Number is greater than" + guess);
			}
		}

		if (rounds == i) {
			System.out.println("\nyou have completed round");
			System.out.println("\nThe number is " + num);
			System.out.println("\n\nDo you want to continue..");
			System.out.println("Enter 1 for continue...");
			again = sc.nextInt();

			if (again == 1) {
				Num_Guessing(); 
			} else {
				System.out.println("Thank You!! See You Again....");
			}
		}
		sc.close();
	}

	public static void main(String[] args) {
		Num_Guessing();
	}
}
//lets run the program...
