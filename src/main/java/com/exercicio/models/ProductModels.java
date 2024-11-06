package com.exercicio.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class ProductModels {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProductID;

    @Column(nullable = false)
    private int SupplierID;

    @Column(nullable = false)
    private int ProductCategoryID;

    @Column(nullable = false, length = 100)
    private String Name;

    @Column(nullable = false)
    private double UnitPrice;

    @Column(nullable = false)
    private int UnitsInStock;

    @Column(nullable = false)
    private boolean Discounted;
}
