package com.core.banking.system.product.domain.core.entity;

import com.core.banking.system.domain.entity.AggregateRoot;
import com.core.banking.system.product.domain.core.valueobject.ProductId;

import java.util.Objects;

public class Product extends AggregateRoot<ProductId> {
    private  String name;

    public Product(ProductId productId, String name) {
        super.setId(productId);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
