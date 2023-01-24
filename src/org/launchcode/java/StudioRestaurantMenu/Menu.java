package org.launchcode.java.StudioRestaurantMenu;

import java.util.ArrayList;
import java.util.Map;

public class Menu {

    public static ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

    public static void addItem(MenuItem obj) {
        menu.add(obj);
    }

    public static void removeItem(MenuItem obj) {
        menu.remove(obj);
    }

    public static void getMenu() {
        System.out.println("Current menu consist of:\n");
        for (MenuItem item : menu) {
            System.out.println(item.menuItemInfo());
        }
    }

}
