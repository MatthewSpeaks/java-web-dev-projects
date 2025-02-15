package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double aPrice, String aDescription, String aCategory, boolean isNew) {
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
        this.isNew = isNew;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}

