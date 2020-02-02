package restaurant;

import java.util.Date;
import java.util.List;

public class Menu {
   private Date date;
   private List<MenuItem> menuItems;

    public Menu() {
        this.date = new Date();
    }

    public Menu(List<MenuItem> menuItems) {
        this.date = new Date();
        this.menuItems = menuItems;
    }

    public void addMenuItems(MenuItem menuItems) {
        this.menuItems.add(menuItems);
    }

    public Date getDate() {
        return date;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void display(){

        for(MenuItem item:menuItems){
            System.out.println("Price: "+ item.getPrice());
            System.out.println("Description: "+ item.getDescription());
            System.out.println("Category: "+ item.getCategory());
            if(item.isNewItem()){
                System.out.println("Item added on: " + item.getDate());
            }
        }
    }
}
