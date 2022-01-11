import java.util.*;

public class Duplicates {

    public static void main(String ...args){
        System.out.println("Hello Duplicates");
        int number = countDuplicates("woord");
        System.out.println("Duplicates found: " + number);
    }

    static int countDuplicates(String s){
        //trim the String so it contains no whitespace characters
        String str1 = s.trim();

        //convert the string into an array
        char[] array = str1.toCharArray();

        //print out array for debugging purposes
        System.out.println(Arrays.toString(array));

        return 0;
    }
}