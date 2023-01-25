package org.launchcode.java.StudioRestaurantMenu;

import java.util.ArrayList;

public class Menu {

    public static ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

    public static void addItem(MenuItem obj) {
        menu.add(obj);
    }

    public static void removeItem(String obj) {
        for (MenuItem item : menu) {
            if (item.name.equalsIgnoreCase(obj)) {
                System.out.println("The following items have been removed: \n\n" + item.menuItemInfo());
                menu.remove(item);
                break;
            }
        }
    }

    public static void getMenu() {
        System.out.println("\nCurrent menu consist of:\n");
        for (MenuItem item : menu) {
            System.out.println(item.menuItemInfo());
        }
    }

    public static void acquireName() {
        for (MenuItem item : menu) {
            item.getName();
        }
    }

    public static void acquireID() {
        for (MenuItem item : menu) {
            item.getIDNum();
        }
    }

    public static void containsItem(String arg) {
        for (MenuItem item : menu) {
            if (item.contains(arg)) {
                item.isNew();
                if (item.isItNew.equals(true)) {
                    System.out.println("\nNEW ITEM\n" + item.menuItemInfo());
                } else {
                    System.out.println("\n" + item.menuItemInfo());
                }
                return;
            }
        }
        System.out.println("No items match your search.");
    }

}
