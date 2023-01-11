package org.launchcode.java.chapterexercises.ch3controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class arrayPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numer = {1, 1, 2, 3, 5, 8};
        String suess = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] catInHat = suess.split(" ");
        String[] catInSentence = suess.split("\\.");

        //print odd numbers only
        for (int num : numer) {
            if (num % 2 != 0) {
                System.out.println(num);
            } else {
                System.out.println("nope");
            }
        }

        System.out.println(Arrays.toString(catInHat));
        System.out.println(Arrays.toString(catInSentence));


        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(21);
        nums.add(1);
        nums.add(27);
        nums.add(42);
        nums.add(90);
        nums.add(6);
        nums.add(79);
        nums.add(9);
        nums.add(5);

        for (Integer num : nums) {
            System.out.println(num);
            EvenSum.sumOfEven(num);
        }

        ArrayList<String> words = new ArrayList<>(Arrays.asList(catInHat));

        System.out.println(words);

        WordPrint.printWords(words);

    }

}