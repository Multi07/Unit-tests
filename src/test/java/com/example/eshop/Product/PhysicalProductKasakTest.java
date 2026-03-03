package com.example.eshop.Product;

import com.example.eshop.product.PhysicalProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PhysicalProductKasakTest {
    @Test
    @DisplayName("Should create a valid physical product with all attributes")
    void createNewPhysicalProductKasakTest() {
        String name = "Book about something Interesting";
        String description = "This is the description2";
        BigDecimal price = new BigDecimal(10);
        double weight = 10.0;
        double weight2 = 20.0;
        BigDecimal shippingCost = new BigDecimal(10);
        BigDecimal shippingCost2 = new BigDecimal(20);
        PhysicalProduct product = new PhysicalProduct(name, description, price, weight, shippingCost);
        product.setWeight(weight2);
        product.setShippingCost(shippingCost2);

        //Assert
        assertAll("Verify product attributes",
                () -> assertEquals(name, product.getName(), "Name should match"),
                () -> assertEquals(description, product.getDescription(), "Description should match"),
                () -> assertEquals(price, product.getPrice(), "Price should match"),
                () -> assertEquals(weight2, product.getWeight(), "Weight should match"),
                () -> assertEquals(shippingCost2, product.getShippingCost(), "Shipping cost should match"),
                () -> assertNotNull(product.getId(), "Product id should not be null"));
    }
}
