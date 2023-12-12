package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //public MenuItem(double p, String d, String c, boolean iN)

        MenuItem tacos = new MenuItem(10.99, "The greatest tacos you will ever have", "Entree", true);
        MenuItem nachos = new MenuItem(11.99, "Our famous homemade Nachos smothered in beef and cheese", "Entree", true);


        Menu restaurantMenu = new Menu("12/11/2023");

        restaurantMenu.addMenuItem(tacos, "12/11/2023");
        restaurantMenu.printMenu();
        restaurantMenu.addMenuItem(nachos, "12/12/2023");
        restaurantMenu.printMenu();
        restaurantMenu.lastUpdatedDate();
        restaurantMenu.printMenuItem(nachos);


    }
}
