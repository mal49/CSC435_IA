## Number Guessing Game
This is a fun and engaging Java program that challenges you to guess a randomly generated number between 1 and 100.
### Program Structure
The program consists of the main classes:
1. **NumberGuessingGame:**
    - contains the `guessNumber()` method, the hearth of the game's logic.
    - Generates a random number within the specified range.
    - Interacts with the user through input prompts feedback.
    - Tracks the number of attempts made by the user.
2. **main(String[] args):**
    - where guessNumber() method is called.
### User Instruction
1. **Run the program:**
    - Compile and execute the `NumberGuessingGame.java` file using your preferred Java development environment (IDE or command line).
2. **Gameplay:**
    - The program will greet you with a welcome message and explaining the objective.
    - You'll be prompted to enter your guesses for the hidden number.
    - If your guess is outside the range (1-100), you'll receive an error message and be prompted to try again.
    - Based on your guess:
        - If correct, you'll be congratulated and informed of the number of attempts it took.
        - If too high, you'll be prompted to guess lower.
        - If too low, you'll be prompted to guess higher.
    - The game loop continues until you successfully guess the number.
### Example
```
Welcome to the Number guessing game!

I have picked a random number between 1 and 100. Can you guess it?

Enter your guess: 75
Too High! Try Again.

Enter your guess: 50
Too Low! Try Again.

Enter your guess: 62
Correct! You guessed the number in 3 attempts.
```