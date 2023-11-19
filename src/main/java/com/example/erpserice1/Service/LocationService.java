package com.example.erpserice1.Service;

import com.example.erpserice1.Interface.LocationInterface;
import com.example.erpserice1.Model.Location;
import com.example.erpserice1.Repository.LocationReposotory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService implements LocationInterface {

    @Autowired
    LocationReposotory locationReposotory;

    @Override
    public Location modifierLocation(Location location) {
        return locationReposotory.save(location);
    }

    @Override
    public void deleteLocation(Long id) {
        locationReposotory.deleteById(id);
    }

    @Override
    public List<Location> getAllLocation() {
        return locationReposotory.findAll();
    }

    @Override
    public Location getLocationById(Long id) {
         return locationReposotory.findById(id).orElse(null);
    }

    @Override
    public Location createLocation(Location location) {

        return locationReposotory.save(location);
    }
}
