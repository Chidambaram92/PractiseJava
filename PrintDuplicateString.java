package com.testpack.three;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateString {
	public static void main(String args[]) {
        printDuplicateCharacters("Programming Java Programming");
//        printDuplicateCharacters("Combination");
//        printDuplicateCharacters("Java");
    }

    /*
     * Find all duplicate characters in a String and print each of them.
     */
    public static void printDuplicateCharacters(String word) {
        String[] characters = word.split(" ");

        // build HashMap with character and number of times they appear in String
        Map<String, Integer> charMap = new HashMap<String, Integer>();
        for (String ch : characters) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        // Iterate through HashMap to print all duplicate characters of String
        Set<Map.Entry<String, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", word);
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }
    }


}
