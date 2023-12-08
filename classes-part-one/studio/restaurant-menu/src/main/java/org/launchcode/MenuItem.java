package org.launchcode;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private boolean newItem;

    public MenuItem(String aName, String aDescription, double aPrice, String aCategory, boolean isNewItem) {
        this.name = aName;
        this.description = aDescription;
        this.price = aPrice;
        this.category = aCategory;
        this.newItem = isNewItem;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }
}
