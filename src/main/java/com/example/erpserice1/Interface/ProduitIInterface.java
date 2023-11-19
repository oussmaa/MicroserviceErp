package com.example.erpserice1.Interface;

import com.example.erpserice1.Model.Produit;
import com.example.erpserice1.Model.Stock;

import java.util.List;
import java.util.Optional;

public interface ProduitIInterface {

    Produit modifierProduit(Produit produit);
    void deleteProduit(Long id);
    List<Produit> getAllProduit();
    Optional<Produit> getProduitById(Long id);
    Produit createProduit(Produit produit);


}
