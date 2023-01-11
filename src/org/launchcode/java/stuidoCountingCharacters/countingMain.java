package org.launchcode.java.stuidoCountingCharacters;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class countingMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String testString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String user;

        System.out.println("Please enter a sentence you would like the characters counted in");
        user = input.nextLine();

        if (!user.equals(""))  {
            CountLetters.countLetters(user);
        } else {
            CountChar.count(testString);
        }
    }
}
