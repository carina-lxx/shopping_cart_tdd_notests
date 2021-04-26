package com.galvanize.cart;

import com.galvanize.App;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CartTest {
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
// Test #1
    @Test
        public void cartStartsEmpty() {
         // setup
        double expected = 0;
        Cart cartTest = new Cart();

        // execution
        double actual = cartTest.cartItems.size();
        assertEquals(expected, actual);

    }
// Test #2
    @Test
    public void testTotalPrice() {
        //setup
        Cart cartTest = new Cart();
        double expectedTotalPrice = 10;
        Item item1 = new Item("apple", 5.00);
        Item item2 = new Item("milk", 3.00);
        Item item3 = new Item("cereal", 2.00);

        cartTest.cartItems.add(item1);
        cartTest.cartItems.add(item2);
        cartTest.cartItems.add(item3);

        //execution
        double actual = cartTest.getTotalPrice();

        //assert
         assertEquals(expectedTotalPrice, actual);

        //teardown
    }

    @Test
    public void testAddToItemizedList(){
        //setup
        Cart cartTest = new Cart();
        Item item1 = new Item("apple", 5.00);
        Item item2 = new Item("milk", 3.00);
        Item item3 = new Item("cereal", 2.00);
//        cartTest.cartItems.add(item1);
//        cartTest.cartItems.add(item2);
//        cartTest.cartItems.add(item3);

        ArrayList<Item> expected = new ArrayList<Item>(Arrays.asList(item1, item2, item3));

        //execution
        ArrayList<Item> actual = cartTest.itemizedList();

        //assert
        assertEquals(expected, actual);
    }


}
