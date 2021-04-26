package com.galvanize.cart;

import com.galvanize.App;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

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



}
