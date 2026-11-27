package com.ecommerce.product_service.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class ProductRequest {

    @NotBlank(message = "Product name is mandatory")
    @Size(max = 100, message = "Product name character length must be <= 100")
    private String name;

    @Size(min = 5, max = 300, message = "Product description characters length must be between 5 and 300")
    private String description;

    @NotNull
    @DecimalMin(value = "1.00")
    @DecimalMax(value = "10000.00")
    @Digits(fraction = 2, integer = 5)
    private BigDecimal price;

    @NotNull
    @PositiveOrZero
    private Integer stockQuantity;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }
}
