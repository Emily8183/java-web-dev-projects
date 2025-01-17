package org.launchcode;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private String name;

    public MenuItem(double p, String d, String c, boolean iN, String n) {
        this.price = p;
        this.description = d;
        this.category = c;
        this.isNew = iN;
        this.name = n;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return price;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }



    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory(){
        return category;
    }


    public void setNew(boolean aNew) {
        isNew = aNew;
        // this.isNew = isNew
    }

    public Boolean getNew(){
        return isNew; //is it right?
    }



    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
