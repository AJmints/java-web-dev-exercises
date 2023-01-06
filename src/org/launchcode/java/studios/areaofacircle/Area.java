package org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How much radius would you like in your circle today?");

        if (!input.hasNextDouble()) {
            System.out.println("Wrong, wrong, wrong! Restart!");
        } else {

            double answer = 0;
            boolean valid = false;

            while (!valid) {
                answer = input.nextDouble();

                if (answer <= 0) {
                    System.out.println("That is the wrong input, please try again.");
                } else {
                    valid = true;
                }
            }
            input.close();
            Circle.getArea(answer);
        }
    }
}