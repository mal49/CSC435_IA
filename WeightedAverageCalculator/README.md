## Weighted Average Calculator
This program calculates the weighted average of scores and weights provided by the users.
### Program Structures
The program consists of two main classes:
- **WeightedAverageCalculator:** This class contains a static method `calculatedWeightedAverage` that takes two arrays, `scores` and `weights`, and returns the weighted average. It also checks if the weights sum up to 100%.
- **Main:** This class handles the user interaction and program execution. It provides a menu for calculating weighted averages or exiting the program.
### User Instruction
1. **Run the program:** 
- Compile and execute the `WeightedAverageCalculator.java` file using your preferred Java IDE or compiler.
3. **User Interaction:**
- Select an option from the menu:
    1. **Calculate Weighted Average:** Enter scores and weights for assignment, quizzes, and exams (separated by spaces).
        - If the weight sum to 100, the weighted average will be displayed.
        - If the weights are invalid, and error message will be shown.
    2. **Exit program:** The program will terminate.
### Example
```
===== Weighted Average Calculator =====
1. Calculate Weighted Average
2. Exit program
choose an option: 1

Welcome to the Weighted Average Calculator!
Please enter the scores and weights for assignments, quizzes, and exams (separated by space) :
85 90 78
Enter the weights for assignment, quizzes, exams (must sum to 100, separated by space) :
40 30 30
Scores: [85.0, 90.0, 78.0]
Weights: [40.0, 30.0, 30.0]
The weighted average is: 83.5
```
```
===== Weighted Average Calculator =====
1. Calculate Weighted Average
2. Exit program
choose an option: 2

Exiting the program. Goodbye!
```