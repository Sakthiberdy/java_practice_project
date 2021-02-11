package package_for_basics;

import java.util.Scanner;

public class SortingStrings {

    public static void main(String args[]) {

        int count;
        String temp;
        Scanner scanner = new Scanner(System.in);

        //User will be asked to enter the count of strings
        System.out.println("Enter the count of strings which you want to sort");
        count = scanner.nextInt();

        String str[] = new String[count];
        Scanner scanner1 = new Scanner(System.in);

        //User is entering the strings and they are stored in an array
        System.out.println("Enter the Strings One by one");
        for (int i=0; i<count; i++){
            str[i] = scanner1.nextLine();
        }
        scanner.close();
        scanner1.close();

        //Sorting the strings
        for (int i=0; i<count; i++){
            for (int j=i+1; j<count; j++){
                if (str[i].compareTo(str[j])>0){
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        //Displaying the strings after sorting them based on alphabetical order
        System.out.println("Strings in Sorted Order: ");
        for (int i=0; i<=count-1; i++){
            System.out.println(str[i]);
        }
    }

}
