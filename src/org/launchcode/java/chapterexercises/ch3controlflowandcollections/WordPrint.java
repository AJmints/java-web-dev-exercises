package org.launchcode.java.chapterexercises.ch3controlflowandcollections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
public class WordPrint {
    public static void printWords(ArrayList<String> args) {
        int val;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number above 1 to look for a word with that length.");

        while (1 == 1) {
            if (input.hasNextInt()) {
                val = input.nextInt();
                if (val > 1) {
                    break;
                } else {
                    System.out.println("Please enter a number above 1.");
                }
            } else {
                System.out.println("Please enter a number above 1.");
                input.nextLine();
            }
        }


        for (String word : args) {
            if (word.length() == val) {
                System.out.println(word + " has " + val + " characters in it.");
            } else {
                count++;
            }
        }

        System.out.println(count + " words did not have the length you specified.");
    }
}