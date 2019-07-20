
/*Author: Andrew Minai 
Description:This program asks the user to enter 
a string to be able to check if it is a Palindrome or not.
Implements a method for the functionality of checking 
if it is a Palindrome.
*/

import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        String original = ""; // Objects of String class
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a palindrome: ");
        original = in.nextLine();
        System.out.println(isPalindrome(original));

    }

    public static String isPalindrome(String original_string) {
        String reverse = "";
        int length = original_string.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original_string.charAt(i);

        if (original_string.equals(reverse))
            return "The string is a palindrome";

        else
            return "The string isnt a palindrome";
    }

}

/*
 * 1st Example: Enter a string to check if it is a palindrome: bob The string is
 * a palindrome 2nd Example: Enter a string to check if it is a palindrome:
 * andrew The string isnt a palindrome
 */