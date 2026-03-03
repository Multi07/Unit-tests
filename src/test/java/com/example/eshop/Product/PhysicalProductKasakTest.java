package com.example.eshop.Product;

import com.example.eshop.product.PhysicalProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class PhysicalProductKasakTest {
    @Test
    @DisplayName("Should create a valid physical product with all attributes")
    void VerifyProductName() {
        String name = "Book about something Interesting";
        String description = "This is the description2";
        BigDecimal price = new BigDecimal(10);
        double weight = 10.0;
        BigDecimal shippingCost = new BigDecimal(10);
        PhysicalProduct product = new PhysicalProduct(name, description, price, weight, shippingCost);

        //Assert
        assertAll("Verify product attributes",
                () -> assertEquals(name, product.getName(), "Name should match"));
    }
    @Test
    @DisplayName("Should create a valid physical product with all attributes")
    void VerifyProductDescription() {
        String name = "Book about something Interesting";
        String description = "This is the description2";
        BigDecimal price = new BigDecimal(10);
        double weight = 10.0;
        BigDecimal shippingCost = new BigDecimal(10);
        PhysicalProduct product = new PhysicalProduct(name, description, price, weight, shippingCost);

        //Assert
        assertAll("Verify product attributes",
                () -> assertEquals(description, product.getDescription(), "Description should match"));
    }
    @Test
    @DisplayName("Should create a valid physical product with all attributes")
    void VerifyProductPrice() {
        String name = "Book about something Interesting";
        String description = "This is the description2";
        BigDecimal price = new BigDecimal(10);
        double weight = 10.0;
        BigDecimal shippingCost = new BigDecimal(10);
        PhysicalProduct product = new PhysicalProduct(name, description, price, weight, shippingCost);

        //Assert
        assertAll("Verify product attributes",

                () -> assertEquals(price, product.getPrice(), "Price should match"));
    }
    @Test
    @DisplayName("Should create a valid physical product with all attributes")
    void VerifyProductWeight() {
        String name = "Book about something Interesting";
        String description = "This is the description2";
        BigDecimal price = new BigDecimal(10);
        double weight = 10.0;
        BigDecimal shippingCost = new BigDecimal(10);
        PhysicalProduct product = new PhysicalProduct(name, description, price, weight, shippingCost);

        //Assert
        assertAll("Verify product attributes",


                () -> assertEquals(weight, product.getWeight(), "Weight should match"));
    }
    @Test
    @DisplayName("Should create a valid physical product with all attributes")
    void VerifyProductShippingCost() {
        String name = "Book about something Interesting";
        String description = "This is the description2";
        BigDecimal price = new BigDecimal(10);
        double weight = 10.0;
        BigDecimal shippingCost = new BigDecimal(10);
        PhysicalProduct product = new PhysicalProduct(name, description, price, weight, shippingCost);

        //Assert
        assertAll("Verify product attributes",
                () -> assertEquals(shippingCost, product.getShippingCost(), "Shipping cost should match"));
    }
    @Test
    @DisplayName("Should create a valid physical product with all attributes")
    void VerifyProductID() {
        String name = "Book about something Interesting";
        String description = "This is the description2";
        BigDecimal price = new BigDecimal(10);
        double weight = 10.0;
        BigDecimal shippingCost = new BigDecimal(10);
        PhysicalProduct product = new PhysicalProduct(name, description, price, weight, shippingCost);

        //Assert
        assertAll("Verify product attributes",
                () -> assertNotNull(product.getId(), "Product id should not be null"));
    }
}
