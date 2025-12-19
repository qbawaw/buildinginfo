package pl.put.poznan.buildinginfo.repository;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;
import pl.put.poznan.buildinginfo.model.*;

import java.util.HashMap;
import java.util.Map;

@Repository
public class LocationRepository {

    private final Map<Long, Location> locations = new HashMap<>();

    @PostConstruct
    public void init() {

        Room room1 = new Room();
        room1.setId(1L);
        room1.setArea(50);
        room1.setCube(150);
        room1.setHeating(300);
        room1.setLight(500);

        Room room2 = new Room();
        room2.setId(2L);
        room2.setArea(40);
        room2.setCube(120);
        room2.setHeating(280);
        room2.setLight(400);

        Level level1 = new Level();
        level1.setId(3L);
        level1.getChildren().add(room1);
        level1.getChildren().add(room2);

        Building building = new Building();
        building.setId(4L);
        building.getChildren().add(level1);

        locations.put(room1.getId(), room1);
        locations.put(room2.getId(), room2);
        locations.put(level1.getId(), level1);
        locations.put(building.getId(), building);
    }

    public Location findById(Long id) {
        return locations.get(id);
    }
}

