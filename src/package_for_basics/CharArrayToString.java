package package_for_basics;

public class CharArrayToString {

    public static void main(String[] args){
        // Method 1: Using String object
        char[] ch = {'a', 'b', 'c'};
        String str = new String(ch);
        System.out.println(str);

        // Method 2: Using valueOf method
        String str2 = String.valueOf(ch);
        System.out.println(str2);

    }
}
