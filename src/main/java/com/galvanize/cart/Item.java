package com.galvanize.cart;

public class Item {
    public String name;
    public double price;
    public boolean sale;
    public Item(String name, double price, boolean sale){
        this.name = name;
        this.price = price;
        this.sale = sale;
    }
}
