package org.launchcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private String lastUpdated;
    private ArrayList<MenuItem> items = new ArrayList<>();

    public Menu(String date) {
        this.lastUpdated = date;
    }

    public void addMenuItem(MenuItem addedItem, String newDate){
        this.items.add(addedItem);
        this.lastUpdated = newDate;
    }

    public void removeMenuItem(ArrayList<MenuItem> removedItem, String newDate) {
        this.items.remove(this.items.indexOf(removedItem));
        this.lastUpdated = newDate;
    }

    public void printMenu() {
        for(MenuItem menuItem : this.items) {
            System.out.println(menuItem.toString());
        }

    }

    public void printMenuItem(MenuItem itemToPrint) {
        int index = this.items.indexOf(itemToPrint);
        System.out.println(this.items.get(index));
    }

    public void lastUpdatedDate () {
        System.out.println(this.lastUpdated);
    }



    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }


}


