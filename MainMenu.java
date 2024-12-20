import java.util.Scanner;
import NumberGuessingGame.NumberGuessingGame;
import PalindromeChecker.PalindromeChecker;
import WeightedAverageCalculator.WeightedAverageCalculator;

public class MainMenu {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Menu: ");
            System.out.println("1. Run Number Guessing Game");
            System.out.println("2. Run Palindrome Checker");
            System.out.println("3. Run Weighted Average Calculator");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            System.out.println("\n");

            switch (choice) {
                case 1:
                    NumberGuessingGame.main(new String[0]);
                    break;
                case 2:
                    PalindromeChecker.main(new String[0]);
                    break;
                case 3:
                    WeightedAverageCalculator.main(new String[0]);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, Please try again");
            }
        }
    }
}
