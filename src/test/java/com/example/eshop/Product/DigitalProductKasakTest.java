package com.example.eshop.Product;

import com.example.eshop.product.DigitalProduct;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DigitalProductKasakTest {
    @Test
    @DisplayName("Should create a valid digital product with all attributes")
    void VerifyNewDigitalProductNameKasakTest() {
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
                () -> assertEquals(name2, product.getName(), "Name should match"));
    }
    @Test
    @DisplayName("Should create a valid digital product with all attributes")
    void VerifyNewDigitalProductDescriptionKasakTest() {
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
                () -> assertEquals(description2, product.getDescription(), "Description should match"));
    }
    @Test
    @DisplayName("Should create a valid digital product with all attributes")
    void VerifyNewDigitalProductPriceKasakTest() {
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
                () -> assertEquals(price2, product.getPrice(), "Price should match"));
    }
    @Test
    @DisplayName("Should create a valid digital product with all attributes")
    void VerifyNewDigitalProductUrlKasakTest() {
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

                () -> assertNotEquals(url, product.getDownloadUrl(), "Download URL should match"));
    }
    @Test
    @DisplayName("Should create a valid digital product with all attributes")
    void VerifyNewDigitalProductNotNullKasakTest() {
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
                () -> assertNotNull(product.getDownloadUrl()));
    }
    @ParameterizedTest(name = "Test {index}: Name={0}, Price={2}")
    @DisplayName("Should validate various digital product configurations")
    @CsvSource({
            "E-book JUnit 5, Master JUnit, 19.99, https://download.com/1",
            "Java Guide, Learn Java fast, 29.50, https://download.com/2",
            "Spring Boot Tips, Advanced Boot, 0.00, https://download.com/3"
    })
    void verifyMultipleDigitalProductsKasakTest(String name, String description, BigDecimal price, String url) {
        // Arrange & Act
        DigitalProduct product = new DigitalProduct(name, description, price, url);

        // Assert
        assertAll("Product integrity check",
                () -> assertEquals(name, product.getName()),
                () -> assertEquals(description, product.getDescription()),
                () -> assertEquals(price, product.getPrice()),
                () -> assertEquals(url, product.getDownloadUrl()),
                () -> assertNotNull(product.getDownloadUrl())
        );
    }
}
