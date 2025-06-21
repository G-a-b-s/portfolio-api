package com.gabriel.portfolio.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String institution;
    private String course;
    @Column(columnDefinition = "TEXT")
    private String status;
    @Column(columnDefinition = "TEXT")
    private String description;
}
