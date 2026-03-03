package com.example.eshop.Product;

import com.example.eshop.product.DigitalProduct;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class DIgitalProductKasakTest {
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
