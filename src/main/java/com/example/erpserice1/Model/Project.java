package com.example.erpserice1.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Project {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NameProject", nullable = false)
    private String NameProject;


}
