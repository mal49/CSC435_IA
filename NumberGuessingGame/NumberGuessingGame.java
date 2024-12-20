package NumberGuessingGame;

import java.util.*;

public class NumberGuessingGame {
    static void guessNumber() {

        Scanner sc = new Scanner (System.in);

        int random = 1 + (int)(100 * Math.random());
        int guess = 0;
        int attp = 0;

        System.out.println("Welcome to the Number guessing game!");
        System.out.println("\nI have picked a random number between 1 and 100. Can you guess it?");

        while(guess != random)
        {
            System.out.print("\nEnter your guess: ");
            guess = sc.nextInt();

            if(guess > 100 || guess < 1)
        {
            System.out.println("Out of range! Please enter value between 1 and 100.");
            continue;
        }

            attp++;

            if(random == guess)
        {
            System.out.println("Correct! You guess the number in " +attp+ " attempts.");
        }
        else if(guess > random)
        {
            System.out.println("Too High! Try Again.");
        }
        else if(guess < random)
        {
            System.out.println("Too Low! Try Again.");
        }
        }
    }   
    public static void main(String[] args) {
        guessNumber();
    }
}
