package com.ecommerce.api.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Product}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GetAllProductRequest implements Serializable {
    private String productName;
    private int lowPrice;
    private int highPrice;
    private String sku;
}