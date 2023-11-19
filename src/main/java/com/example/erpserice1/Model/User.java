package com.example.erpserice1.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @Size(max = 20)
    private String username;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotBlank
    @Size(max = 120)
    private String password;


    private String Numero;

    private String Image;

    private String Roles;



    public User() {
    }

    public User(String username, String email, String password, String numero, String image, String roles) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.Numero = numero;
        this.Image = image;
        this.Roles = roles;
    }


}