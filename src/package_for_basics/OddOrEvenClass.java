package package_for_basics;

import java.util.Scanner;

public class OddOrEvenClass {
    boolean numberOperation() {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a valid number: ");
            int value = input.nextInt();
            input.close();
            if (value % 2 == 0) {
                System.out.println("Entered number is Even");
            } else {
                System.out.println("Entered number is Odd");
            }
            return true;
        } catch (Exception e) {
            System.out.println("Entered number is not valid ");
            return false;
        }
    }

    public static void main(String[] args) {
        OddOrEvenClass p = new OddOrEvenClass();
        boolean returned_value = p.numberOperation();
        while (returned_value != true) {
            returned_value = p.numberOperation();
        }
    }
}