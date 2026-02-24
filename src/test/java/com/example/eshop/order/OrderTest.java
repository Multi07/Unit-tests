package com.example.eshop.order;

import com.example.eshop.cart.Cart;
import com.example.eshop.payment.CreditCardPaymentProcessor;
import com.example.eshop.payment.PaymentProcessor;
import com.example.eshop.product.PhysicalProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {
    @Test
    @DisplayName("Should Create a valid Order")
    void CreateNewOrderTest() {
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

        assertAll("Verify Order Attributes",
                () -> assertEquals(cart.getItems(), order.getItems(), "Cart items should match order items"),
                () -> assertEquals(cart.calculateTotal(), order.getTotalAmount(), "Total price should match order price"));
    }
}
