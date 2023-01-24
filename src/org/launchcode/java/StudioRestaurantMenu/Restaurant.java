package org.launchcode.java.StudioRestaurantMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    public void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MenuItem meal;
        String category = "";
        String name = "";
        String description = "";
        Double price = 0.0;

        System.out.println("What category is this meal? Enter app, main, or dessert");
        category = input.nextLine();
        System.out.println("What is the name of this dish?");
        name = input.nextLine();
        System.out.println("How would you describe this dish on the menu?");
        description = input.nextLine();
        System.out.println("How much does this item cost?");
        price = input.nextDouble();

        if (category != "" && name != "" && description != "" && price != 0.0) {
            meal = new MenuItem(category, name, description, price);
//            Menu.addItem(meal);
        }

        //newaddmethod for items
        //create item and add to array

    }
}
