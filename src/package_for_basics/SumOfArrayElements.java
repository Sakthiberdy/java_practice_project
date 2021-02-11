package package_for_basics;

import java.util.Scanner;

public class SumOfArrayElements {

    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    //int[] arr = new int[3];
        System.out.println("Enter the no.of elements to do sum");
        int count = scanner.nextInt();
    int[] arr = new int[count];

        int sum=0;

        System.out.println("Enter the elements");
    for (int i=0; i<count; i++){
        arr[i] = scanner.nextInt();
    }
    scanner.close();
    for (int a: arr){
        sum = sum+a;
    }
        System.out.println("Sum of array elements is: "+sum);
    }
}

