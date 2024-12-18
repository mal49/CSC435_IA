import java.util.*;

public class PalindromeChecker {

    static boolean isPalindrome(String word)
    {
        word = word.replaceAll("\\s+", "").toLowerCase();

        String revWord = "";
        for(int i = word.length() - 1; i >= 0; i--) //
        {
            revWord += word.charAt(i);
        }

        return word.equals(revWord);
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String word;

        System.out.println("Welcome to the Palindrome Checker!");
        System.out.println("\nEnter a String to check if it's a palindrome.");
        System.out.println("\nType " +"exit"+ " to quit the program.");

        while(true)
        {

            System.out.print("\nEnter a word: ");
            word = sc.nextLine();

            if(word.equalsIgnoreCase("exit"))
            {
                System.out.println("\nThank you for using the Palindrome Checker! Goodbye!");
                break;
            }

            if(isPalindrome(word))
            {
                System.out.println(word + " is a Palindrome word");
            }
            else
            {
                System.out.println(word + " is not a Palindrome word");
            }
        }
    }
}
