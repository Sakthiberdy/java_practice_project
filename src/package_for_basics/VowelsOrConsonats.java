package package_for_basics;

import java.util.Scanner;

public class VowelsOrConsonats {


    public static void main (String[] args) {
        boolean isVowel = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an alphabet");
        char input = scanner.nextLine().charAt(0);
        scanner.close();
        switch (input) {
            case 'a': isVowel = true;
                break;
            case 'e': isVowel = true;
                break;
            case 'i': isVowel = true;
                break;
            case 'o': isVowel = true;
                break;
            case 'u': isVowel = true;
                break;
            case 'A': isVowel = true;
                break;
            case 'E': isVowel = true;
                break;
            case 'I': isVowel = true;
                break;
            case 'O': isVowel = true;
                break;
            case 'U':  isVowel = true;
                break;

        }
        if (isVowel == true) {
            System.out.println(input+" is a vowel");
        } else {
            if (input>='a'&&input<='z' || input>='A'&&input<='Z') {
                System.out.println(input+" is a Consonant");
            } else {
                System.out.println(input+" is not an alphabet");
            }
        }

    }

}
