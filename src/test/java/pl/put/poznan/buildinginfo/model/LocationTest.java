package pl.put.poznan.buildinginfo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LocationTest {
    private Building building;
    private Level level1;
    private Room room1;
    private Room room2;

    @BeforeEach
    void setUp() {
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
     * Test obliczania powierzchni
     */
    @Test
    void getAreaTest () {
        double area = building.getArea();
        assertEquals(50.0, area);
    }

    /**
     * Test obliczania kubatury
     */
    @Test
    void getCubeTest () {
        double cube = building.getCube();
        assertEquals(125.0, cube);
    }

    /**
     * Test obliczania zużycia ogrzewania
     */
    @Test
    void getHeatingTest () {
        double heating = building.getHeating();
        assertEquals(250.0, heating);
    }

    /**
     * Test obliczania mocy światła
     */
    @Test
    void getLightTest () {
        double light = building.getLight();
        assertEquals(500.0, light);
    }
}
