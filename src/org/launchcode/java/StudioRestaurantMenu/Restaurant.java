package org.launchcode.java.StudioRestaurantMenu;

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



        while (1 == 1) {
            int choice;
            System.out.println("\nPlease select from the following options...\n0 - View the menu.\n1 - View item on the menu.\n2 - Remove item from the menu.\n3 - Add Item.\n4 - Close app when finished.");

            while (!input.hasNextInt()) {

                System.out.println("\nPlease enter valid input.\n0 - View the menu.\n1 - View item on the menu.\n2 - remove item from the menu.\n3 - Add Item.\n4 - Close app when finished.\n");
                input.nextLine();

            }

            choice = input.nextInt();
            input.nextLine();

            if (choice == 0) {
                theMenu.getMenu();
            }

            if (choice == 1) {
                System.out.println("\nPlease input the ID number of the item you wish to view.\n");
                theMenu.acquireName();
                while (!input.hasNextInt()) {
                    System.out.println("Please enter valid number");
                    input.nextLine();
                }
                int view = input.nextInt();
                theMenu.containsItem(view);
            }

            if (choice == 2) {
                System.out.println("Please input the ID number of the item you wish to remove.\n");
                theMenu.acquireName();
                while (!input.hasNextInt()) {
                    System.out.println("Please enter valid number");
                    input.nextLine();
                }
                int remove = input.nextInt();
                theMenu.removeItem(remove);
            }

            if (choice == 3) {
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

                    if (theMenu.isItDuplicate(meal)){
                        input.nextLine();

                        while (!input.hasNextInt()) {
                            System.out.println("\nPlease enter 0 or 1");
                            input.nextLine();
                        }

                        int proceed = input.nextInt();

                        if (proceed == 0) {
                            System.out.println("\nItem added.");
                            Menu.addItem(meal);
                        }

                        if (proceed == 1) {
                            System.out.println("\nItem not added.");
                        }

                        if (proceed > 1 || proceed < 0) {
                            System.out.println("\nInvalid input, Item not added.");
                            //Temp solution, want to force user to input 1 or 0 in above while loop
                        }


                    } else {
                        Menu.addItem(meal);
                        theMenu.getMenu();
                        System.out.println("\nNew item successfully added, here is the updated menu.");
                    }
                }
            }

            if (choice == 4) {
                System.out.println("......\n....\n..\nGoodbye");
                break;
            }

        }

    }
}
