package org.launchcode.java.StudioRestaurantMenu;

import java.util.ArrayList;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {

        Menu theMenu = new Menu();

        MenuItem meal1 = new MenuItem("app", "Buffalo Cauliflower", "Fried cauliflower bathed in buffalo sauce", 10.99);
        MenuItem meal2 = new MenuItem("app", "Cheese Quesadilla", "A classic with a name that speaks for itself", 10.99);
        MenuItem meal3 = new MenuItem("main", "Veggie Pizza", "16 inches of delicious vegetarian pizza pie", 18.99);
        MenuItem meal4 = new MenuItem("main", "Ultimate veggie burrito", "Everything you want in a vegetarian burrito and more", 13.99);
        MenuItem meal5 = new MenuItem("main", "Spicy Black Bean Burger", "Delicious black bean burger a jalapenos", 12.99);
        MenuItem meal6 = new MenuItem("dessert", "Chocolate Cake", "Your favorite type of cake", 10.99);
        Menu.addItem(meal1);
        Menu.addItem(meal2);
        Menu.addItem(meal3);
        Menu.addItem(meal4);
        Menu.addItem(meal5);
        Menu.addItem(meal6);

        Scanner input = new Scanner(System.in);

        MenuItem meal;
        String category = "";
        String name = "";
        String description = "";
        double price = 0.0;
        theMenu.getMenu();

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
            Menu.addItem(meal);
            System.out.println("New item successfully added, here is the updated menu: \n");
        }

        while (1 == 1) {
            int choice;
            System.out.println("Please select from the following options...\n");
            System.out.println("0 - View the menu.\n1 - View item on the menu.\n2 - Remove item from the menu.");
            while (!input.hasNextInt()) {
                System.out.println("Please enter valid input.\n0 - View the menu.\n1 - View item on the menu.\n2 - remove item from the menu.");
                input.nextLine();
            }
            choice = input.nextInt();
            System.out.println(choice);

            if (choice == 0) {
                theMenu.getMenu();
                break;
            }

            if (choice == 1) {
                System.out.println("Please write the name of the item you wish to view.");
                String view = input.nextLine();
                if (theMenu.equals(view)) {

                }
            }


        }

    }
}
