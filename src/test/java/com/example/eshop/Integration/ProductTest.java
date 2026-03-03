package com.example.eshop.Integration;

import com.example.eshop.product.DigitalProduct;
import com.example.eshop.product.PhysicalProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
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
    @Test
    @DisplayName("Should create a valid digital product with all attributes")
    void createNewDigitalProductKasakTest() {
        String name = "E-book guide for JUnit 5";
        String description = "This is the description";
        BigDecimal price = new BigDecimal(10);
        String url = "https://www.google.com";
        DigitalProduct product = new DigitalProduct(name, description, price, url);
        product.setDownloadUrl("https://www.seznam.cz");
        String name2 = "E-book guide for JUnit 5";
        product.setName(name2);
        String description2 = "This was the description";
        product.setDescription(description2);
        BigDecimal price2 = new BigDecimal(20);
        product.setPrice(price2);

        //Assert
        assertAll("Verify product attributes",
                () -> assertEquals(name2, product.getName(), "Name should match"),
                () -> assertEquals(description2, product.getDescription(), "Description should match"),
                () -> assertEquals(price2, product.getPrice(), "Price should match"),
                () -> assertNotEquals(url, product.getDownloadUrl(), "Download URL should match"),
                () -> assertNotNull(product.getDownloadUrl()));
    }
}
