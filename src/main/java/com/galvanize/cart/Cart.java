package com.galvanize.cart;

import java.util.ArrayList;
import java.util.HashSet;

public class Cart {
    public ArrayList<Item> cartItems = new ArrayList<Item>();
    public ArrayList<Integer> cartQuantities = new ArrayList<>();

    public void addItem(Item item, int quantity) {
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

    public int itemQuantities(){
        int quantities = 0;
        for(int num : cartQuantities) {
            System.out.println("num: " + num);
            quantities += num;
        }
        return quantities;
    }

    public HashSet<Item> onSaleItems(){
        HashSet<Item> saleItems = new HashSet<>();

        for (Item item : cartItems) {
            if (item.sale) {
                saleItems.add(item);
            }
        }
        return saleItems;
    }

}
