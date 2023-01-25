package org.launchcode.java.StudioRestaurantMenu;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class MenuItem {
        //All variables private
        public String category;
        public String name;
        public String description;
        public Double price;
        public final LocalDate dateAdded = LocalDate.now();
        public Boolean isItNew = false;
        private static int itemNumber = 1;
        private int itemID;


        public MenuItem(String category, String name, String description, Double price) {
            this.category = category;
            this.name = name;
            this.description = description;
            this.price = price;
            this.itemID = generateItemNumber();
        }


    private int generateItemNumber() {
        this.itemID = itemNumber;
        itemNumber++;
        return itemID;
    }



    public String menuItemInfo() {
        return "Item ID: " + this.itemID + "\nCategory: " + this.category + "\nName: " +this.name + "\nDescription: " + this.description + "\nPrice: " + this.price + "\n";
    }

    public boolean isNew() {
            LocalDate today = LocalDate.now();
            double daysBetween = dateAdded.until(today, ChronoUnit.DAYS);
            System.out.println("\nItem added: " + dateAdded + "\n" + daysBetween + " days since " + name + " was added.");
            if (daysBetween < 90) {
                this.isItNew = true;
            }
            return daysBetween < 90;
    }

    public Boolean contains(String arg) {
        return Objects.equals(this.name.toUpperCase(), arg.toUpperCase());
    }

    public void getName() {
        System.out.println(this.name);
    }

    public void getIDNum() {
        System.out.println(this.itemID);
    }

}
