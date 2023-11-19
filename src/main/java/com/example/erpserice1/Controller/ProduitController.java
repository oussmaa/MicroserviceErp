package com.example.erpserice1.Controller;

import com.example.erpserice1.Exception.LocationNotFoundException;
import com.example.erpserice1.Model.Location;
import com.example.erpserice1.Model.Produit;
import com.example.erpserice1.Repository.LocationReposotory;
import com.example.erpserice1.Repository.ProduitRepostory;
import com.example.erpserice1.Request.ProduitRequest;
import com.example.erpserice1.Service.LocationService;
import com.example.erpserice1.Service.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ProduitController")
@CrossOrigin
public class ProduitController {

    @Autowired
    ProduitService produitService;

    @Autowired
    ProduitRepostory produitRepostory;
    @Autowired
    LocationService locationService;
    @RequestMapping(method = RequestMethod.PUT)
    public Produit modifierProduit(@RequestBody Produit a) {
        return produitService.modifierProduit(a);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteProduit(@PathVariable("id") Long id){
        produitService.deleteProduit(id);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Produit> getAllProduit() {
        return produitService.getAllProduit();
    }
    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public List<Produit> getProduitById(@PathVariable("id") String id) {

        return produitRepostory.findProduitByLocation_StorageArea(id);
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createProduit(@RequestBody ProduitRequest produit) {
        try {
            Location location = locationService.getLocationById(produit.getLocationid());
            if (location == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Location not found");
            }
            Produit prod = new Produit();
            prod.setNameProduit(produit.getNameProduit());
            prod.setQuanatity(produit.getQuanatity());
            prod.setPrice(produit.getPrice());
            prod.setCategorie(produit.getCategorie());
            prod.setDescription(produit.getDescription());
            prod.setTax(produit.getTax());
            prod.setPromotion(produit.getPromotion());
            prod.setImage(produit.getImage());
            prod.setLocation(location);

            Produit createdProduit = produitService.createProduit(prod);
            return ResponseEntity.ok(createdProduit);
        }  catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
        }
    }


}
