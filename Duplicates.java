import java.util.*;

import javax.swing.text.Style;

public class Duplicates {

    public static void main(String ...args){
        System.out.println("Hello Duplicates");
        String word = "wooord";
        int number = countDuplicates(word);
        System.out.println("Duplicates found: " + number);
        Map<Character, Integer> result = countAllDuplicates(word);
        outputResults(result, word);
        System.out.println("End of program");
    }

    static int countDuplicates(String s){
        //trim the String so it contains no whitespace characters
        String str1 = s.trim();

        //convert the string into an array
        char[] array = str1.toCharArray();

        //sort the array 
        Arrays.sort(array);

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

    static void outputResults(Map<Character, Integer> results, String s){
        System.out.println("Here are the Results.....");
        System.out.println("The length of the String " + s.trim() + " is " + s.length());
        int numOfDuplicates = 0;

        for(Character c: results.keySet()){
            if (results.get(c) > 1){
                numOfDuplicates++;
                System.out.println("Charcter " + c + " has " + results.get(c) + " occurences");
            }
        }

        if (numOfDuplicates == 0){
            System.out.println("No characters had duplicates");
        }
        
    }
}