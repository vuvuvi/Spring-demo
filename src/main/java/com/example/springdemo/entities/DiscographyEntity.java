package com.example.springdemo.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity(name = "Discography")
@Table(name = "discography")
@Data

public class DiscographyEntity {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private BandEntity bandEntity;

    private String album;
}
