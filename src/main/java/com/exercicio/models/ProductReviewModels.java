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

public class ProductReviewModels {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ProductReviewID;

    @Column(nullable = false)
    private int ProductID;

    @Column(nullable = false, length = 100)
    private String ReviewerName;

    @Column(nullable = false)
    private LocalDateTime ReviewDate;

    @Column(nullable = false , length = 5)
    private int Rating;

    @Column(nullable = false, length = 250)
    private String comments;
}
