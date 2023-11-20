package com.example.erpserice1.Controller;

import com.example.erpserice1.Model.Location;
import com.example.erpserice1.Model.Stock;
import com.example.erpserice1.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/LoactionController")
@CrossOrigin
public class LoactionController {

    @Autowired
    LocationService locationService;

    @RequestMapping(method = RequestMethod.PUT)
    public Location modifierLocation(@RequestBody Location a) {
        System.out.println("fff");
        return locationService.modifierLocation(a);
    }

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteLocation(@PathVariable("id") Long id){
        locationService.deleteLocation(id);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Location> getAllLocation() throws Exception{


        return locationService.getAllLocation();
    }


    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public Location getLocationById(@PathVariable("id") Long id) {
        return locationService.getLocationById(id);
    }
    @ExceptionHandler(Exception.class)
    @RequestMapping(method = RequestMethod.POST)
    public Location createLocation(@RequestBody Location a) {
        return locationService.createLocation(a);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {

        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred");
    }


}
