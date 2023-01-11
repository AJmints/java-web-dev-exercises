package org.launchcode.java.chapterexercises.ch3controlflowandcollections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();

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


    }
}
