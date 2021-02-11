package package_for_basics;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        String reverseString = "";
        System.out.println("Please enter a string to check if it is palindrome");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        scanner.close();

        // Using for loop
        /*for (int i=inputString.length()-1; i>=0; i--) {
            reverseString += inputString.charAt(i);
        }*/

        // Using while loop
        int i = inputString.length()-1;
        while (i>=0) {
            reverseString += inputString.charAt(i);
            i--;
        }

        if (inputString.equals(reverseString)) {
            System.out.println("Entered string is a palindrome");
        } else {
            System.out.println("Enter string is not a palindrome");
        }
    }

}
