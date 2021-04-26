package com.galvanize.cart;

import java.util.ArrayList;

public class Cart {
    public ArrayList<Item> cartItems = new ArrayList<Item>();

    public double getTotalPrice(){
        double total = 0;

        for (int i = 0; i < cartItems.size(); i++) {
            System.out.println(cartItems.get(i).name);
            total += cartItems.get(i).price;
        }
        return total;
    }

    public ArrayList<Item> itemizedList(){
        return cartItems;
    }
}
