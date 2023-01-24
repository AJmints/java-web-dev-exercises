package org.launchcode.java.StudioRestaurantMenu;

import java.time.LocalDateTime;
import java.util.HashMap;
public class MenuItem {
        //All variables private
        public  String category;
        public String name;
        public String description;
        public Double price;
        public final LocalDateTime itemCreated = LocalDateTime.now();
        public Boolean newItem = true;

        public static int itemNumber = 1;


        public MenuItem(String category, String name, String description, Double price) {
            this.category = category;
            this.name = name;
            this.description = description;
            this.price = price;
            itemNumber = generateItemNumber();
        }


    private static int generateItemNumber() {
            itemNumber++;
            return itemNumber;
    }



    public String menuItemInfo() {
        return "(Currently broken) Menu Item: " + this.itemNumber + "\nCategory: " + this.category + "\nName: " +this.name + "\nDescription: " + this.description + "\nPrice: " + this.price + "\n";
    }
}
