package com.example.erpserice1.Request;

import com.example.erpserice1.Model.Location;
import lombok.Data;


import java.util.ArrayList;

@Data
public class ProduitRequest {

    private String NameProduit;


    private Double Quanatity;


    private Double Price;


    private String Categorie;


    private String Description;


    private Integer Tax;


    private Integer Promotion;


    private ArrayList<String> Image;


    private long locationid;
}

