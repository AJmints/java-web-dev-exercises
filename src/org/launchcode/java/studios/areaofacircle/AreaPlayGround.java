package org.launchcode.java.studios.areaofacircle;

import java.sql.SQLOutput;
import java.util.Scanner;
public class AreaPlayGround {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.println("What is the radius of the circle?");

        //Infinite loop that prompts the user till all conditions are met
        while( 1== 1) {
            if (input.hasNextDouble()) {
                radius = input.nextDouble();
                if (radius > 0 ) {
                    break; //This is the only way to escape the loop is b y meeting all the conditions
                } else {
                    //If the number is lower than 0, then the loop resets
                    System.out.println("Please enter positive number: ");
                }
            } else {
                //If the input is anything other than a positive number, like a letter or symbol, the loop resets
                System.out.println("Please enter proper numerical answer: ");
                input.nextLine();
            }
        }
        //When you enter the correct input, the code can finish running.
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle of radius" + radius + " is: " + area);
        input.close();
    }
}
