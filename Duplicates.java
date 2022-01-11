import java.util.*;

public class Duplicates {

    public static void main(String ...args){
        System.out.println("Hello Duplicates");
        int number = countDuplicates("wooord");
        System.out.println("Duplicates found: " + number);
        Map<Character, Integer> result = countAllDuplicates("wooooord");
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
    
    static Map<Character, Integer> countAllDuplicates(String s){
        
        //HashMap to hold the results
        Map<Character, Integer> d = new HashMap<>();

        //convert the String into a char array
        String trimmed = s.trim();
        char[] wordArray = trimmed.toCharArray();
        
        //loop through char array
        //Add key-value pair to map if there isnt one for that key
        //if there is, increment the value by 1
        for (Character c: wordArray){
            d.compute(c, (k, v) -> (v == null)? 1 : v + 1);
        }

        System.out.println(d.toString());

        return d;
    }
}