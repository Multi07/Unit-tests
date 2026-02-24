package com.example.eshop.Product;

import com.example.eshop.product.PhysicalProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhysicalProductKasakTest {
    @Test
    @DisplayName("Should create a valid physical product with all attributes")
    void createNewPhysicalProductKasakTest() {
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
}
