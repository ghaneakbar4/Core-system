package com.core.banking.system.product.service.dataaccess.product.entity;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Table(name = "Tbl_Products")
@AllArgsConstructor
@Setter
@Getter
@Entity
@NoArgsConstructor
@Builder
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private UUID id;
}
