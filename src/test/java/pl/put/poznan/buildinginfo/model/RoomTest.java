package pl.put.poznan.buildinginfo.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoomTest {
    private Room room;

    @BeforeEach
    void setUp () {
        room = new Room();
        room.setId(1L);
        room.setArea(20.0);
        room.setCube(50.0);
        room.setHeating(100.0);
        room.setLight(200.0);
    }

    /**
     * Test obliczania powierzchni
     */
    @Test
    void getAreaTest () {
        double area = room.getArea();
        assertEquals(20.0, area);
    }

    /**
     * Test obliczania kubatury dla pokoju
     */
    @Test
    void getCubeTest () {
        double cube = room.getCube();
        assertEquals(50.0, cube);
    }

    /**
     * Test obliczania zużycia ogrzewania dla pokoju
     */
    @Test
    void getHeatingTest () {
        double heating = room.getHeating();
        assertEquals(100.0, heating);
    }

    /**
     * Test obliczania mocy światła dla pokoju
     */
    @Test
    void getLightTest () {
        double light = room.getLight();
        assertEquals(200.0, light);
    }
}
