package com.example.eshop;

import com.example.eshop.cart.Cart;
import com.example.eshop.cart.CartItem;
import com.example.eshop.order.Order;
import com.example.eshop.order.OrderStatus;
import com.example.eshop.product.DigitalProduct;
import com.example.eshop.product.PhysicalProduct;
import com.example.eshop.product.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Test
     */
    @Test
    @DisplayName("Should create a valid digital product with all attributes")
    void createNewDigitalProductTest() {
        String name = "E-book guide for JUnit 5";
        String description = "This is the description";
        BigDecimal price = new BigDecimal(10);
        String url = "https://www.google.com";
        DigitalProduct product = new DigitalProduct(name, description, price, url);

        //Assert
        assertAll("Verify product attributes",
                () -> assertEquals(name, product.getName(), "Name should match"),
                () -> assertEquals(description, product.getDescription(), "Description should match"),
                () -> assertEquals(price, product.getPrice(), "Price should match"),
                () -> assertEquals(url, product.getDownloadUrl(), "Download URL should match"));
    }
    @Test
    @DisplayName("Should create a valid physical product with all attributes")
    void createNewPhysicalProductTest() {
        String name = "Book about something Interesting";
        String description = "This is the description2";
        BigDecimal price = new BigDecimal(10);
        double weight = 10.0;
        BigDecimal shippingCost = new BigDecimal(10);
        PhysicalProduct product = new PhysicalProduct(name, description, price, weight, shippingCost);

        //Assert
        assertAll("Verify product attributes",
                () -> assertEquals(name, product.getName(), "Name should match"),
                () -> assertEquals(description, product.getDescription(), "Description should match"),
                () -> assertEquals(price, product.getPrice(), "Price should match"),
                () -> assertEquals(weight, product.getWeight(), "Weight should match"),
                () -> assertEquals(shippingCost, product.getShippingCost(), "Shipping cost should match"));
    }
    @Test
    @DisplayName("Should create new Cart Item")
    void CreateNewCartItemTest() {
        int quantity = 3;
        String name = "Book about something Interesting";
        String description = "This is the description2";
        BigDecimal price = new BigDecimal(10);
        double weight = 10.0;
        BigDecimal shippingCost = new BigDecimal(10);
        PhysicalProduct product = new PhysicalProduct(name, description, price, weight, shippingCost);
        CartItem cartItem = new CartItem(product, quantity);

        assertAll("Verify CartItem Attributes",
                () -> assertEquals(product, cartItem.getProduct(),  "Product should match"),
                () -> assertEquals(quantity, cartItem.getQuantity(), "Quantity should match"));
    }
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
                () -> assertEquals(cart.getItems(), order.getItems(), "Cart items should match order items"));
    }
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }
}
