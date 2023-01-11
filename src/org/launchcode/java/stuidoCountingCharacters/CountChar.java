package org.launchcode.java.stuidoCountingCharacters;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class CountChar {
    public static void count(String args) {
        ArrayList<Character> arr = new ArrayList<>();
        HashMap<Character, Integer> outPut = new HashMap<>();

        for (char character : args.toCharArray()) {
                arr.add(character);
            }

        //Cycle through array with stored chars
        for (Character character : arr) {
            int count =0;
            //compare chars from array(arr) with string(args)
            for (char seek : args.toCharArray()) {
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
