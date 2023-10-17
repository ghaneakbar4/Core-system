package com.core.banking.system.product.domain.core.valueobject;

import java.util.UUID;

public class ProductId extends BaseId<UUID> {
    public ProductId(UUID value){
        super(value);
    }
}
