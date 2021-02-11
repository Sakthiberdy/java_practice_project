package package_for_basics;

import java.util.Scanner;

public class StringConversions {
    public static void main (String[] args) {

        // Char to String:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character");
        char c = scanner.nextLine().charAt(0);
        String converted_string = String.valueOf(c);
        System.out.println("Converted String is "+converted_string);

        // String to Char:
        //Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a String");
        String mystring = scanner.nextLine();
        scanner.close();
        for (int i=0; i<mystring.length();i++){
            char ch  = mystring.charAt(i);
            System.out.println("Converted character at position "+i+" is " +ch);
        }



    }

}
