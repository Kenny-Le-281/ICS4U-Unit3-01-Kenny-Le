/*
* This program reverses a string a user enters using a method.
*
* @author  Kenny Le
* @version 1.0
* @since   2024-04-20
*/

import java.util.Scanner;

/**
* This is the program.
*/
final class reverseString {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private reverseString() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Reverses a string.
     *
     * @param stringToReverse the string to reverse
     * @return the reversed string
     */
    static String reverseString(String stringToReverse) {
        final String newString;

        if ("".equals(stringToReverse)) {
            newString = "";
        } else {
            final StringBuilder deleteString =
                new StringBuilder(stringToReverse);
            final char firstCharacter = stringToReverse.charAt(0);
            deleteString.deleteCharAt(0);
            newString = reverseString(deleteString.toString()) + firstCharacter;
        }

        return newString;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Scanners
        final Scanner input = new Scanner(System.in);

        System.out.print("\nEnter a string to reverse: ");
        final String reversedString = reverseString(input.nextLine());
        System.out.println("The reversed string is " + reversedString);

        // Close scanners
        input.close();

        // Show the program as done
        System.out.println("\nDone.");
    }
}
