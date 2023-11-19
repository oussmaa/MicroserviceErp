package com.example.erpserice1.Model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Data;

@Data
@Entity
public class Stock {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit Name_Produit;

    private Double Quantity_Produit;

}
