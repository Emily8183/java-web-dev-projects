package org.launchcode;

import java.util.ArrayList;


public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items = new ArrayList<>();

    @Override
    public String toString(){
        StringBuilder allMenuItemsInfo = new StringBuilder();
        for (MenuItem menuItem : items ) {
            allMenuItemsInfo.append(menuItem.toString());
            allMenuItemsInfo.append("\n---------------\n");
        }
        return "\nWelcome to our restaurant!\n\n" +
                "View our full menu\n" +
                "-------------------\n" +
                allMenuItemsInfo;

    }

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}
