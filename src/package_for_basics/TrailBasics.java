package package_for_basics;

public class TrailBasics {

    public void display() {
        System.out.println("Method of Trail class");
    }

    public void te() {
        display();
    }


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


/*            System.setProperty("webdriver.gecko.driver", "/home/sakthi/IdeaProjects/healthi-tests/src/main/resources/geckodriver");
            WebDriver fxdriver = new FirefoxDriver();
            //WebDriver chdriver = new ChromeDriver();
            //fxdriver.get("https:www.healthi.in");
            fxdriver.navigate().to("https:www.healthi.in");
            //fxdriver.close();
            fxdriver.quit();*/

            
            /*String str = "abcd";
            for (int i=str.length()-1; i>=0; i--) {
                System.out.print(str.charAt(i));
            }

            System.out.println();

            StringBuilder stringBuilder = new StringBuilder();
            for (int i=str.length()-1; i>=0; i--) {
                stringBuilder.append(str.charAt(i));
            }
            System.out.print(stringBuilder);*/


            /* find length of string
            String str = "abcd";
            char[] ch = str.toCharArray();
            int count=0;
            for (char c: ch
                 ) {
                     count++;
            }
            System.out.println("Length of given string is: "+count);*/


            /* //print all subrstings of a string
            String str = "abbc";
            for (int i=0; i<str.length(); i++) {
                for (int j=i; j<=str.length(); j++) {
                    System.out.println(str.substring(i,j));
                }
            }*/


            /*//Find first non repeated character in a String
            // Need to understand lastIndexOf
            String str = "analogy";
            char[] ch = str.toCharArray();
            char f = ' ';
            for (int i=0; i<str.length(); i++) {
                if (str.lastIndexOf(ch[i])==str.indexOf(ch[i])) {
                    f = ch[i];
                    break;
                }
            }
            System.out.println(f);*/


            /*// palindrome
            String str = "madam";
            StringBuilder reversedString = new StringBuilder();
            for (int i=str.length()-1; i>=0; i--) {
                reversedString.append(str.charAt(i));
            }
            if (str.equals(reversedString.toString())) {
                System.out.println("It is a palindrome");
            } else{
                System.out.println("It is not a palindrome");
            }*/

           /* //if duplicate exists and its count
            String str = "madam";
            int count = 0;
            HashMap map = new HashMap();
            for (int i=0; i<str.length(); i++) {
                if (map.containsValue(str.charAt(i))) {
                    count++;
                }
                map.put(i, str.charAt(i));
            }
            if (count>0) {
                System.out.println("String contains duplicate");
            } else System.out.println("String does not contain duplicate");*/


           /* //find duplicate character in a string
            String str = "madam";
            int count = 0;
            System.out.print("Duplicate char is: ");
            for (int i=0; i<str.length(); i++) {
                for (int j=i+1; j<str.length(); j++) {
                    if (str.charAt(i)==str.charAt(j)) {
                        System.out.print(str.charAt(i)+" ");
                    }
                }
            }*/


        /*    //find duplicate character in a string and its count
            String str = "madam";
            Map<Character, Integer> baseMap = new HashMap<Character, Integer>();
            char[] charArray = str.toCharArray();
            for (Character ch : charArray) {
                if (baseMap.containsKey(ch)) {
                    baseMap.put(ch, baseMap.get(ch) + 1);
                } else {
                    baseMap.put(ch, 1);
                }
            }
            Set<Character> keys = baseMap.keySet();
            for (Character ch : keys) {
                if (baseMap.get(ch) > 1) {
                    System.out.println(ch + "  is " + baseMap.get(ch) + " times");
                }
            }
            */

        /*    //Understand for each loop
            String str = "liked";
            StringBuilder sb = new StringBuilder();
            char[] ch = str.toCharArray();
            for (Character c: ch) {
                sb.append(c);
            }
            System.out.println("String of appended String builder using for each loop is: "+sb.toString());*/

        /*    //Manual toCharArray()
            String str = "manual";
            int length = str.length();
            char[] ch = new char[length];
            for (int i=0; i<length; i++) {
                ch[i] = str.charAt(i);
            }
            String s = new String(ch);
            System.out.println("String of char array: "+s);*/


        /*    //Different ways to iterate a list in java
            ArrayList<String> list = new ArrayList<>();
            list.add("a");
            list.add("b");
            list.add("c");
            list.add("d");

            System.out.print("When iterating Array list using for loop: ");
            for (int i=0; i<list.size(); i++) {
                System.out.print(list.get(i));
            }
            System.out.println();

            System.out.print("When iterating Array list using for each loop: ");
            for (String s: list) {
                System.out.print(s);
            }
            System.out.println();

            System.out.print("When iterating Array list using for while loop: ");
            int i=0;
            while (i<list.size()) {
                System.out.print(list.get(i));
                i++;
            }
            System.out.println();


            System.out.print("When iterating Array list using iterator: ");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                System.out.print(it.next());
            }
            System.out.println();
*/

        /*    //Find smallest and largest element in array (using 2 diff ways)
            int[] givenArray = {2,3,1,4,8,6,5,7};
            int[] arr = givenArray;
            Arrays.sort(arr);
            System.out.println("Smallest number found using sort is: "+arr[0]);
            System.out.println("Largest number found using sort is: "+arr[arr.length-1]);

            int smallest = givenArray[0];
            int largest = givenArray[0];
            for (int i=0; i< givenArray.length-1; i++) {
                if (smallest>givenArray[i+1]) {
                    smallest = givenArray[i+1];
                }
            }
            for (int i=0; i< givenArray.length-1; i++) {
                if (largest<givenArray[i+1]) {
                    largest = givenArray[i+1];
                }
            }
            System.out.println("Smallest number found using manual iteration is: "+smallest);
            System.out.println("Largest number found using manual iteration is: "+largest);
*/

        /*    // Manually sorting the array
            int[] arr = {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};
            for (int i=0; i<arr.length; i++) {
                for (int j=i+1; j<arr.length; j++) {
                      int tmp=0;
                      if (arr[i]>arr[j]) {
                          tmp = arr[i];
                          arr[i] = arr[j];
                          arr[j] = tmp;
                      }
                }
                System.out.println(arr[i]);
            }
*/
        /*    // Find missing number in array
            int N = 5;
            int A[] = {1,2,3,5};
            int no = N-1;
            int total = (no+1) * (no+2) / 2;
            for(int i=0; i<no; i++) {
                total -= A[i];
            }
            System.out.println("Missing number is: "+total);
*/
        /*    // Find missing number in Collection
            ArrayList<Integer> arr = new ArrayList<>();
            int A[] = {1,2,3,5};
            int n = A.length;
            for (int i=0; i<n; i++) {
                arr.add(A[i]);
            }
            int total = (n+1) * (n+2) / 2;
            for(int i=0; i<n; i++) {
                total -= arr.get(i);
            }
            System.out.println("Missing number is: "+total);
*/

        /*    // Convert integer to binary string
            int n = 10;
            StringBuilder sb = new StringBuilder();
            while(n > 0){
                int r = n%2;
                sb.append(r);
                n = n/2;
            }
            System.out.println("Binary string of "+n+"is: "+sb.reverse());*/


        /*    // Challenge of Convert integer to binary string
            int n = 13;
            String op = "1";
            StringBuilder sb = new StringBuilder();
            while(n > 0){
                int r = n%2;
                sb.append(r);
                n = n/2;
            }
            String tmp = sb.reverse().toString();
            op = tmp;
            System.out.println("Binary string of "+n+"is: "+op);*/

        /*    // Find Longest Common Prefix in an array of Strings
            String[] strArr = {"java2blog", "javaworld", "javabean", "javatemp"};
            String shortestString = strArr[0];
            for (int i=1; i<strArr.length; i++) {
                if (strArr[i].length()<shortestString.length()) {
                    shortestString = strArr[i];
                }
            }
            int count = 0;
            for (int i=0; i<strArr.length;i++) {
                for (int j=0; j<shortestString.length();j++) {
                    if (shortestString.charAt(j)!=strArr[i].charAt(j)) {
                        break;
                    }
                    if (j<shortestString.length()) {
                        count = j;
                    }
                }
            }
            System.out.println("Longest Common Prefix is: "+shortestString.substring(0,count+1));
*/

           /* // Find second largest number in array
            int arr[] = {7,1,8,2,3,4,5,6};
            int highest=0, secondHighest = 0;
            for (int i=0; i<arr.length; i++) {
                if (arr[i]>highest) {
                    secondHighest = highest;
                    highest =arr[i];
                } else if (arr[i]>secondHighest) {
                    secondHighest = arr[i];
                }
            }
            System.out.println("Highest no is: "+highest);
            System.out.println("Second highest no is: "+secondHighest);*/


        /*    //Separate 0s and 1s in an array
            int arr[] = {1,1,0,0,1,0,0,1,0};
            int zeros=0, ones=0;
            for (int i=0; i<arr.length; i++) {
                if (arr[i]==0) {
                    zeros++;
                }
                if (arr[i]==1) {
                    ones++;
                }
            }
            int[] nArr = new int[arr.length];
            for (int i=0; i<zeros;i++) {
                nArr[i] = 0;
            }
            for (int i=zeros; i< arr.length;i++) {
                nArr[i] = 1;
            }
            System.out.println(Arrays.toString(nArr));*/

        /*    //Separate odd and even numbers in an array
            int[] arr = {12, 17, 70, 15, 22, 65, 21, 90};
            int left=0, right= arr.length-1;
            for (int i: arr) {
                if (arr[left]%2==0) {
                    left++;
                }
                if (arr[right]%2==1) {
                    right--;
                }
                if (left<right) {
                    int tmp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = tmp;
                }
            }
            System.out.println(Arrays.toString(arr));*/


        /*    //Find the number odd numbers in an array
            int[] arr = {9, 12, 17, 70, 15, 22, 65, 21, 90};
            int count=0;
            for (int i=0; i< arr.length; i++) {
                if (arr[i]%2==1) {
                    count++;
                }
            }
            System.out.println("No of odd nos. are: "+count);*/


        /*    //Find the number odd numbers in an array
            int[] arr = {20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
            int result = 0;
            for (int i = 0; i < arr.length; i++)
            {
                // XOR operation
                result = result ^ arr[i];
            }
            System.out.println("Number which occurs odd number of times is : "+result);*/

        /*    //Swap 2 number without using temp variables:
            int a=5;
            int b=10;
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("a is: "+a);
            System.out.println("b is: "+b);*/


        /*    //program to check prime number
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number to check if prime or not:");
            int num = sc.nextInt();
            boolean flag = true;
            for (int i=2; i<Math.sqrt(num); i++) {
                if (num%i==0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Given no. is a prime number");
            }
            else {
                System.out.println("Given no. is non prime number");
            }*/


        /*    //Fibonacci series
            int num = 10;
            int prev=0, next=1;
            System.out.println("Fibonacci series: ");
            System.out.print(prev+" "+next);
            int sum;
            for (int i=2; i<num; i++) {
                sum=prev+next;
                System.out.print(" "+sum);
                prev=next;
                next=sum;
            }*/

         /*   //Print first occuring duplicate character
            int[] a = {8, 4, 6, 2, 6, 4, 7, 9, 5, 8};
            int tmp=-1;
            boolean flag = false;
            int index=Integer.MAX_VALUE;
            for(int i=0; i<a.length; i++) {
                for(int j=i+1; j<a.length; j++) {
                    if(a[i]==a[j]) {
                        if(index>i) {
                            flag = true;
                            index  = j;
                            break;
                        }
                    }
                }
            }
            if(flag) {
                System.out.println(a[index]);
            } else {
                System.out.println(tmp);
            }
*/
          /*  Trail t = new Trail();
            //t.display();
            t.te();*/

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}


