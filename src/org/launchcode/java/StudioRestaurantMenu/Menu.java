package org.launchcode.java.StudioRestaurantMenu;

import java.util.ArrayList;

public class Menu {

    public static ArrayList<MenuItem> menu = new ArrayList<MenuItem>();

    public static void addItem(MenuItem obj) {
        menu.add(obj);
    }



    public static void getMenu() {
        System.out.println("\nCurrent menu consist of:");
        for (MenuItem item : menu) {
            System.out.println(item.menuItemInfo());
        }
    }

    public static void acquireName() {
        for (MenuItem item : menu) {
            int id = item.getIDNum();
            String name = item.getName();
            System.out.println("Item ID: " + id + " - Item Name: " + name);
        }
    }

    public static void removeItem(int obj) {
        for (MenuItem item : menu) {
            if (item.containsID(obj)) {
                System.out.println(item.menuItemInfo() + "\n\nThe selected item '" + item.getName() + "' has been removed");
                menu.remove(item);
                return;
            }
        }
        System.out.println("No items match your search.");
    }

    public static void containsItem(int arg) {
        for (MenuItem item : menu) {
            if (item.containsID(arg)) {
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

    public static Boolean isItDuplicate(MenuItem arg) {
        for (MenuItem item : menu) {
            if (item.containsName(arg.name)) {
                System.out.println("\nThere are other items with the same name, do you wish to proceed?\n0 - yes\n1 - no");
                return true;
            }
        }
        return false;
    }

}
