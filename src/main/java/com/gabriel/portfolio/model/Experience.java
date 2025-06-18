package com.gabriel.portfolio.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String role;
    private String startDate;
    private String endDate;
    @Column(columnDefinition = "TEXT")
    private String description;

}
