package restaurant;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
   private String category;
   private Date date;

    public MenuItem(double price, String description,String category) {
        this.price = price;
        this.description = description;
        newItem = true;
        this.category = category;
    }

    boolean newItem;

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

    public boolean isNewItem() {
        return newItem;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDate() {
        return date;
    }
}
