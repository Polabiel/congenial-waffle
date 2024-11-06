package com.exercicio.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class SupplierModels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer SupplierID;

    @Column(nullable = false, length = 100)
    private String Name;

    @Column(nullable = false, length = 100)
    private String Address;

    @Column(nullable = false, length = 100)
    private String City;

    @Column(nullable = false, length = 100)
    private String State;

    @Column(nullable = false, length = 100)
    private String PostalCode;
}
