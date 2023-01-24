package org.launchcode.java.StudioRestaurantMenu;

import java.time.LocalDateTime;

public class MenuItem {
        //All variables private
        public  String category;
        public String name;
        public String description;
        public Double price;
        public final LocalDateTime itemCreated = LocalDateTime.now();
        public Boolean newItem = true;


        public MenuItem(String category, String name, String description, Double price) {
            this.category = category;
            this.name = name;
            this.description = description;
            this.price = price;
        }


}
