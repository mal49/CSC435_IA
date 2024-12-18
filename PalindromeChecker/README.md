## Palindrome Checker
This program checks whether a word is a palindrome  or not.
> Palindrome is a word, phrase, or sequence that reads the same backward as forwards, e.g. *madam* or *nurses run*.
### Program Structure
1. `PalindromeChecker` class:
    - `isPalindrome(String word)` method:
       - Preprocesses the input string:
        - Removes whitespaces using `replaceAll("\\s+", "")`.
        - Converts the string to lowercase using `toLowerCase()`.
    - Reverses the string character by character and stores it in `revWord`.
    - Compares the original the reversed string using `equals()`. Returns `true` if they are palindromes, `false` otherwise.
2. `main(String[] args)` method:
    - welcomes the users and explains the program's purpose. 
    - creates a `scanner` object to read user input.
    - Enters a loop that continues until the user enters `exit`: 
        - Prompts the user to enter a word.
        - Checks the `isPalindrome` method to determine if the entered word is a palindrome.
        - Prints an appropriate message indicating whether the word is a palindrome or not.
### User Instructions
1. **Run the program:** Compile and execute the `PalindromeChecker.java` file using your preferred Java IDE or compiler.
2. **Enter words:** The program will prompts you to enter words. Type any word you want to check.
3. **Exit the program:** To quit, enter the word `exit` (case-insensitive) at the prompt.
### Example Usage
```
Welcome to the Palindrome Checker!

Enter a string to check if it's a palindrome.

Enter a word: race car
race car is a palindrome word

Enter a word: hello
hello is not a palindrome word

Enter a word: exit

Thank you for using the Palindrome Checker! Goodbye!
```
