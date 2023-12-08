package org.launchcode;
import java.util.HashMap;
import java.time.LocalDate;

public class Menu {
    private String title;
    private HashMap<String, MenuItem> menuItems;

    private String date;

    private String specials;

    public Menu(String aTitle, HashMap<String, MenuItem> aMenuItem, String aDate){
        this.title = aTitle;
        this.menuItems = aMenuItem;
        this.date = aDate;
        this.specials = "$1 beers";
    }

    public void printMenu(Menu aMenu){
        System.out.println(aMenu);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public HashMap<String, MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(HashMap<String, MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSpecials() {
        return specials;
    }

    public void setSpecials(String specials) {
        this.specials = specials;
    }
}
