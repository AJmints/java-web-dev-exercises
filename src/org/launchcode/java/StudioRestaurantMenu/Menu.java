package org.launchcode.java.StudioRestaurantMenu;

import java.util.ArrayList;

public class Menu {

    ArrayList<MenuItem> menu = new ArrayList<MenuItem>();
    MenuItem transfer;
    public void main(String args) {

    MenuItem meal1 = new MenuItem("app", "Buffalo Cauliflower", "Fried cauliflower bathed in buffalo sauce", 10.99);
    MenuItem meal2 = new MenuItem("app", "Cheese Quesadilla", "A classic with a name that speaks for itself", 10.99);
    MenuItem meal3 = new MenuItem("main", "Veggie Pizza", "16 inches of delicious vegetarian pizza pie", 18.99);
    MenuItem meal4 = new MenuItem("main", "Ultimate veggie burrito", "Everything you want in a vegetarian burrito and more", 13.99);
    MenuItem meal5 = new MenuItem("main", "Spicy Black Bean Burger", "Delicious black bean burger a jalapenos", 12.99);
    MenuItem meal6 = new MenuItem("dessert", "Chocolate Cake", "Your favorite type of cake", 10.99);

    menu.add(meal1);
    menu.add(meal2);
    menu.add(meal1);
    menu.add(meal2);
    menu.add(meal1);
    menu.add(meal2);
    }

    public void addItem(MenuItem obj) {
        transfer = obj;
        menu.add(transfer);
    }

    public void removeItem(MenuItem obj) {
        menu.remove(obj);
    }
}
