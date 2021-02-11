package package_for_basics;

public class MyJava {
    public static void main(String[] args) {
        try {
            /*
            //print the pattern
            for (int x=1; x<=5; x++) {
                for (int y=1; y<=x; y++) {
                    System.out.print(y+" ");
                }
                System.out.println();
            }*/

            /*
            //print Fibonacci Series up to count 10
            int a=0, b=1, count=10;
            System.out.print(a+" "+b);
            for (int i=2; i<count; i++) {
                int c = a+b;
                System.out.print(" "+c);
                a = b;
                b = c;
            }*/

            /* //reverse a String
            String str = "double";
            for (int i=str.length(); i>0; --i) {
                System.out.print(str.charAt(i-1));
            }*/

            /*//Find The Largest Value From The Given Array
            int[] arr = {28,3,56,9,17,4,23,2};
            int val = arr[0];
            for (int i=0; i<arr.length; i++) {
                if (arr[i] > val) {
                    val = arr[i];
                }
            }
            System.out.println("Largest number is "+val);*/

          /*  //display all the prime numbers between 1 and 100
                    String  primeNumbers = "";
                    for (int i = 1; i <= 100; i++){ 
                        int counter=0;
                        for(int num =i; num>=1; num--){
                            if(i%num==0){
                                counter = counter + 1;
                            }
                        }
                        if (counter ==2){
                            primeNumbers = primeNumbers + i + " ";
                        }
                    }
                    System.out.println("Prime numbers from 1 to 100 are :");
                    System.out.println(primeNumbers);*/

          /*  // find the given number is a prime number or not
            int flag = 0;
            System.out.print("Enter any number which you want to verify whether it is a prime number or not :");
            Scanner s = new Scanner(System.in);
            int j = s.nextInt();
            for(int i = 2; i < j; i++){
                if(j % i == 0){
                    flag = 0;
                    break;
                }
                else
                {
                    flag = 1;
                }
            }
            if(flag == 1){
                System.out.println(j+" is a prime number.");
            }
            else{
                System.out.println(+j+" is not a prime number.");
            }*/

            /*//print duplicate value from array
            int[] strArr = {1,1,1,6,5,2,3,4};
            int val;
            for (int i=0; i<strArr.length; i++) {
                for (int j=i+1; j<strArr.length; j++) {
                    if (strArr[i]==strArr[j]) {
                        System.out.println(strArr[i]);
                    }
                }
            }*/

           /* //Sorting
            int[] strArr = {1,1,1,6,5,2,3,4};
            Arrays.sort(strArr);
            System.out.println(Arrays.toString(strArr));

            ArrayList<String> al = new ArrayList<String>();
            al.add("Geeks For Geeks");
            al.add("Friends");
            al.add("Dear");
            al.add("Is");
            al.add("Superb");
            Collections.sort(al);
            System.out.println("List after the use of" +
                    " Collection.sort() :\n" +al);

            // To sort in reverse order user:
            Collections.sort(al, Collections.reverseOrder());
*/

            /*//count no. of 1s in an array
            int[] strArr = {1,1,1,6,5,5,7,5};
            int count = 0;
            int toCheck = 5;
            for (int i=0; i<strArr.length; i++) {
                if (strArr[i]==toCheck) {
                    count++;
                }
            }
            System.out.println(count);*/

            /*//find middle
            int x = 1235;
            String str = Integer.toString(x);
            if (str.length() % 2 == 0) {
                System.out.println("No middle");
            } else {
                System.out.println(str.charAt(str.length() / 2));
            }*/

            /*//print last digit
            int x = 1;
            int val = x % 10;
            System.out.println("Last digit is: "+val);*/

            /*//print first digit
            int x =10;
            while (x>=10) {
                x /=10;
            }
            System.out.println("First digit is: "+x);*/

            /*//find duplicate string in array
            String[] strArr = {"apple", "ball", "apple", "cat", "doll"};
            for (int i=0; i< strArr.length-1; i++) {
                for (int j=1; j< strArr.length; j++) {
                    if (strArr[i]==strArr[j] && (i != j)) {
                        System.out.println("Duplicate string is: "+strArr[j]);
                    }
                }
            }*/

            /*//is Anagram
            String word = "silent";
            String anagram = "listen";
            char[] wordToChar = word.toCharArray();
            char[] anagramToChar = anagram.toCharArray();
            Arrays.sort(wordToChar);
            Arrays.sort(anagramToChar);
            if (Arrays.equals(wordToChar, anagramToChar)) {
                System.out.println("Given input is anagram");
            }
            else {
                System.out.println("Given input is not anagram");
            }*/

            /*//find vowels and consonants
            String str = "programming";
            int vowels = 0;
            int consonants = 0;
            char[] ch = str.toCharArray();
            for (char c: ch) {
                if (Pattern.matches("[aeiou]", Character.toString(c))) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
            System.out.println("No. of vowels are: "+vowels);
            System.out.println("No. of consonants are: "+consonants);*/





        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
