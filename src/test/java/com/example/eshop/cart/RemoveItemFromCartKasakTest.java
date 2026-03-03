package com.example.eshop.cart;

import com.example.eshop.order.Order;
import com.example.eshop.product.PhysicalProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class RemoveItemFromCartKasakTest {
    @Test
    @DisplayName("Should remove the newly create item from cart")
    void RemoveItemKasakTest() {
        Cart cart = new Cart();
        int quantity = 3;
        String name = "Book about something Interesting";
        String description = "This is the description2";
        BigDecimal price = new BigDecimal(10);
        double weight = 10.0;
        BigDecimal shippingCost = new BigDecimal(10);
        PhysicalProduct product = new PhysicalProduct(name, description, price, weight, shippingCost);
        cart.addItem(product, quantity);
        Order order = new Order(cart);
        cart.removeItem(product);

        assertAll("Verify Order Attributes",
                () -> assertNotEquals(cart.getItems(), order.getItems(), "Cart items should not match order items"),
                () -> assertNotEquals(cart.calculateTotal(), order.getTotalAmount(), "Total price should NOT match order price"));
    }
}
