package com.carShop.CarShop.model;

import jakarta.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(length = 8, nullable = false)
    private String cep;

    @Column(length = 60, nullable = false)
    private String state;

    @Column(length = 60, nullable = false)
    private String city;

    @Column(length = 7, nullable = false)
    private String number;

    @Column(columnDefinition = "TEXT")
    private String complement;

    @OneToOne
    @JoinColumn(nullable = false, referencedColumnName = "id")
    private User user;
}
