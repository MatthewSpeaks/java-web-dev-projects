package org.launchcode;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, MenuItem> myMenuItems = new HashMap<>();
        myMenuItems.put("taco", new MenuItem("Fire Tacos", "The best fish tacos", 10.99, "entree", true ));



        Menu myMenu = new Menu("Main Menu", myMenuItems, "12/07/2023");

        myMenu.printMenu();
    }
}
