import java.util.*;

public class Duplicates {

    public static void main(String ...args){
        System.out.println("Hello Duplicates");
        int number = countDuplicates("wooord");
        System.out.println("Duplicates found: " + number);
    }

    static int countDuplicates(String s){
        //trim the String so it contains no whitespace characters
        String str1 = s.trim();

        //convert the string into an array
        char[] array = str1.toCharArray();

        //print out array for debugging purposes
        System.out.println(Arrays.toString(array));

        //sort the array 
        Arrays.sort(array);

        //print out array for debugging purposes
        System.out.println(Arrays.toString(array));

        //count duplicates
        int count = 0;
        for(int i = 0; i < array.length - 1; i++){
            if (array[i] == array[i+1]){
                count++;
            }
        }

        return count;
    }
}