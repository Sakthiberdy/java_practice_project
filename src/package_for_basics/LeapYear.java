package package_for_basics;

import java.util.Scanner;

public class LeapYear {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year: ");
        int year = scanner.nextInt();
        scanner.close();
        boolean isleap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isleap = true;
                } else {
                    isleap = false;
                }
            }else {
                isleap = true;
            }
        } else {
            isleap = false;
        }
        if (isleap == true) {
            System.out.println("Entered year is Leap year");
        } else {
            System.out.println("Entered year is not a Leap year");
        }

    }
}
