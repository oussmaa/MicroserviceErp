package com.example.erpserice1.Interface;

import com.example.erpserice1.Model.Location;

import java.util.List;

public interface LocationInterface {

    Location modifierLocation(Location location);
    void deleteLocation(Long id);
    List<Location> getAllLocation();
    Location getLocationById(Long id);
    Location createLocation(Location location);

}
