package com.galvanize.cart;

import java.util.ArrayList;

public class Cart {
    public static ArrayList<Item> cartItems = new ArrayList<Item>();
    public static ArrayList<Integer> cartQuantities = new ArrayList<>();

    public static void addItem(Item item, int quantity) {
        cartItems.add(item);
        cartQuantities.add(quantity);
    }

    public double getTotalPrice(){
        double total = 0;

        for (int i = 0; i < cartItems.size(); i++) {
            total += cartItems.get(i).price * cartQuantities.get(i);
        }
        return total;
    }

    public ArrayList<Item> itemizedList(){
        return cartItems;
    }
}
