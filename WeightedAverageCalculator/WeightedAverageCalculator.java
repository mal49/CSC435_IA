import java.util.*;

public class WeightedAverageCalculator {
    public static double calculateWeightedAverage(double[] scores, double[] weights)
    {
        double sum = 0;
        double weightSum = 0;

        for(int i = 0; i < scores.length; i++)
        {
            sum += scores[i] * (weights[i] / 100);
            weightSum += weights[i];
        }

        if(weightSum != 100)
        {
            System.out.println("Error: Weight do not sum up to 100!");
            return -1;
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;

        int choice;

        while(!exit)
        {
            System.out.println("\n===== Weighted Average Calculator =====");
            System.out.println("1. calculated Weighted Average");
            System.out.println("2. Exit program");
            System.out.print("choose an option: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                System.out.println("\n\nWelcome to the Weighted Average Calculator!");
                System.out.println("Please enter the scores and weights for assignments, quizzes, and exams (separated by space) :");
                double[] scores = new double[3];
                for(int i = 0; i < 3; i++)
                {
                    scores[i] = sc.nextDouble();
                }

                System.out.println("Enter the weights for assignment, quizzes, and exams (must sum to 100, separated by space) :");
                double[] weights = new double[3];
                for(int i = 0; i < 3; i++)
                {
                    weights[i] = sc.nextDouble();
                }

                System.out.println("Scores: " + Arrays.toString(scores));
                System.out.println("weights: " + Arrays.toString(weights));

                double WeightedAverage = calculateWeightedAverage(scores, weights);
                if(WeightedAverage != -1)
                {
                    System.out.printf("The weighted average is: %.1f%n", WeightedAverage);
                }
                break;

                case 2:
                exit = true;
                System.out.println("Exiting the program. Goodbye!");
                break;

                default:
                System.out.println("Invalid choice! Please try again");
            }
        }
        
    }    
}
