package com.carShop.CarShop.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(length = 92, nullable = false)
    private String name;

    @Column(length = 62, nullable = false, unique = true)
    private String email;

    @Column(length = 11, nullable = false, unique = true)
    private  String cpf;

    @Column(length = 12, nullable = false, unique = true)
    private String phone;

    @Column(nullable = false)
    private Date birth;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String description;

    @Column(length = 120, nullable = false)
    private String password;

    @Column(columnDefinition = "DEFAULT COMPRADOR")
    private UserType type;
}
