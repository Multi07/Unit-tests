package com.example.eshop.cart;

import com.example.eshop.product.PhysicalProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartKasakTest {
    @Test
    @DisplayName("Should create new Cart Item")
    void CreateNewCartItemKasakTest() {
        int quantity = 3;
        String name = "Book about something Interesting";
        String description = "This is the description2";
        BigDecimal price = new BigDecimal(10);
        double weight = 10.0;
        BigDecimal shippingCost = new BigDecimal(10);
        PhysicalProduct product = new PhysicalProduct(name, description, price, weight, shippingCost);
        CartItem cartItem = new CartItem(product, quantity);
        cartItem.setQuantity(2);

        assertAll("Verify CartItem Attributes",
                () -> assertEquals(product, cartItem.getProduct(),  "Product should match"),
                () -> assertEquals(2, cartItem.getQuantity(), "Quantity should match"),
                () -> assertEquals(product.getPrice().multiply(BigDecimal.valueOf(2)), cartItem.getTotalPrice(), "Price should match"));
    }

}
