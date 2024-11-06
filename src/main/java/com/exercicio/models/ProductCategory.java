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

public class ProductCategory {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProductCategoryID;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, length = 205)
    private String Description;

}
