package package_for_basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDupCharsInString {

    public void countDupChas(String s) {
        //Create a HashMap
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        //Convert the String to char array
        char[] ch = s.toCharArray();

        /* logic: char are inserted as keys and their count
         * as values. If map contains the char already then
         * increase the value by 1
         */
        for (Character c : ch) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        //Obtaining set of keys
        Set<Character> keys = map.keySet();

        /* Display count of chars if it is
         * greater than 1. All duplicate chars would be
         * having value greater than 1.
         */
        for (Character c : keys) {
            if (map.get(c) > 1) {
                System.out.println("Char " + c + " " + map.get(c));
            }
        }
    }

    public static void main (String[] args){
        FindDupCharsInString obj = new FindDupCharsInString();
        System.out.println("String: cheerlessness");
        System.out.println("-------------------------");
        obj.countDupChas("cheerlessness");
        System.out.println("\nString: sleeplessness");
        System.out.println("-------------------------");
        obj.countDupChas("sleeplessness");

    }
}
