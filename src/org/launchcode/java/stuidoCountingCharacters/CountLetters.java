package org.launchcode.java.stuidoCountingCharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public class CountLetters {

    public static void countLetters(String args) {
        ArrayList<Character> arr = new ArrayList<>();
        HashMap<Character, Integer> outPut = new HashMap<>();
        String remove = args.replaceAll("[^a-zA-Z]", "");
        String input = args.toUpperCase();

        for (Character character : remove.toUpperCase().toCharArray()) {
            arr.add(character);
        }

        //Cycle through array with stored chars
        for (Character character : arr) {
            int count =0;
            //compare chars from array(arr) with string(args)
            for (Character seek : input.toCharArray()) {
                if (character.equals(seek)) {
                    count++;
                }
            }

            if (!outPut.containsKey(character)) {
                outPut.put(character, count);
            }

            count = 0;
        }

        for (Map.Entry<Character, Integer> total : outPut.entrySet()) {
            System.out.println(total.getKey() + ": " + total.getValue());
        }

    }
}
