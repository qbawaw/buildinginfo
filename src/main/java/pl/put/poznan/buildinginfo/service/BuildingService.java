package pl.put.poznan.buildinginfo.service;

import org.springframework.stereotype.Service;
import pl.put.poznan.buildinginfo.model.Location;

@Service
public class BuildingService {

    public double lightPerArea(Location location) {
        return location.getLight() / location.getArea();
    }

    public double heatingPerCube(Location location) {
        return location.getHeating() / location.getCube();
    }
}

