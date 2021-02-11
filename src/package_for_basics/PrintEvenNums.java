package package_for_basics;

public class PrintEvenNums {
    public static void main(String[] args){
    int n=10;
        System.out.println("Even number from 1 to "+n+ "are: ");
        for (int i=1; i<=n; i++){
            //if number%2 == 0 it means its an even number
            if (i%2 == 0){
                System.out.println(i+" ");
            }
        }
    }
}
