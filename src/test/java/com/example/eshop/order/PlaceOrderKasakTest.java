package com.example.eshop.order;

import com.example.eshop.cart.Cart;
import com.example.eshop.payment.CreditCardPaymentProcessor;
import com.example.eshop.product.PhysicalProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class PlaceOrderKasakTest {
    @Test
    @DisplayName("Should succesfully send an order")
    void OrderServiceKasakTest() {
        CreditCardPaymentProcessor creditCard = new CreditCardPaymentProcessor();
        creditCard.processPayment(new BigDecimal("100.00"));
        OrderService os = new OrderService(creditCard);
        Cart cart = new Cart();
        int quantity = 3;
        String name = "Book about something Interesting";
        String description = "This is the description2";
        BigDecimal price = new BigDecimal(10);
        double weight = 10.0;
        BigDecimal shippingCost = new BigDecimal(10);
        PhysicalProduct product = new PhysicalProduct(name, description, price, weight, shippingCost);
        cart.addItem(product, quantity);
        os.placeOrder(cart);
    }
}
