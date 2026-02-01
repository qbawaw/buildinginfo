package pl.put.poznan.buildinginfo.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.put.poznan.buildinginfo.model.Building;
import pl.put.poznan.buildinginfo.model.Level;
import pl.put.poznan.buildinginfo.model.Room;

import static org.junit.jupiter.api.Assertions.*;


public class BuildingServiceTest {

    private BuildingService buildingService;
    private Building building;
    private Level level1;
    private Room room1;
    private Room room2;

    @BeforeEach
    void setUp() {
        buildingService = new BuildingService();

        room1 = new Room();
        room1.setId(1L);
        room1.setArea(20.0);
        room1.setCube(50.0);
        room1.setHeating(100.0);
        room1.setLight(200.0);

        room2 = new Room();
        room2.setId(2L);
        room2.setArea(30.0);
        room2.setCube(75.0);
        room2.setHeating(150.0);
        room2.setLight(300.0);

        level1 = new Level();
        level1.setId(1L);
        level1.getChildren().add(room1);
        level1.getChildren().add(room2);

        building = new Building();
        building.setId(100L);
        building.getChildren().add(level1);
    }

    /**
     * Test obliczania mocy oświetlenia na m²
     */
    @Test
    void lightPerAreaTest() {
        double lightPerArea = buildingService.lightPerArea(building);
        assertEquals(10.0, lightPerArea);
    }

    /**
     * Test obliczania zużycia ogrzewania na m³
     */
    @Test
    void heatingPerCubeTest() {
        double heatingPerCube = buildingService.heatingPerCube(building);
        assertEquals(2.0, heatingPerCube);
    }
}
