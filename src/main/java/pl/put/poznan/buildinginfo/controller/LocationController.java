package pl.put.poznan.buildinginfo.controller;

import org.springframework.web.bind.annotation.*;
import pl.put.poznan.buildinginfo.model.Location;
import pl.put.poznan.buildinginfo.repository.LocationRepository;
import pl.put.poznan.buildinginfo.service.BuildingService;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    private final LocationRepository repository;
    private final BuildingService service;

    public LocationController(LocationRepository repository,
                              BuildingService service) {
        this.repository = repository;
        this.service = service;
    }



    @GetMapping("/{id}/children")
    public List<Long> getChildren(@PathVariable Long id) {
        Location location = repository.findById(id);
        return location.getChildren().stream()
                .map(Location::getId)
                .toList();
    }



    @GetMapping("/{id}/type")
    public Map<String, String>  type(@PathVariable Long id) {
        Location location = repository.findById(id);
        return Map.of("type", location.type());
    }
    @GetMapping("/all_id")
    public Map<String, StringBuilder> getAllIds() {
        StringBuilder  lista = new StringBuilder("");
        long i = 1;
        while (true) {
            Location loc = repository.findById(i);
            if (loc == null) break;
            lista.append(i).append(" ");
            i++;
        }
        return Map.of("all_id", lista);
    }

    @GetMapping("/{id}/area")
    public double getArea(@PathVariable Long id) {
        Location location = repository.findById(id);
        return location.getArea();
    }

    @GetMapping("/{id}/cube")
    public double getCube(@PathVariable Long id) {
        Location location = repository.findById(id);
        return location.getCube();
    }

    @GetMapping("/{id}/light-per-area")
    public double getLightPerArea(@PathVariable Long id) {
        Location location = repository.findById(id);
        return service.lightPerArea(location);
    }

    @GetMapping("/{id}/heating-per-cube")
    public double getHeatingPerCube(@PathVariable Long id) {
        Location location = repository.findById(id);
        return service.heatingPerCube(location);
    }
}


