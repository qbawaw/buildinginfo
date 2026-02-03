package pl.put.poznan.buildinginfo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class LevelJMockTest {
    private Level level;

    @Mock Location room1;
    @Mock Location room2;
    @Mock Location room3;

    @BeforeEach
    void setUp() {
        level = new Level();
        MockitoAnnotations.initMocks(this);

        when(room1.getArea()).thenReturn(20.0);
        when(room1.getCube()).thenReturn(60.0);
        when(room1.getHeating()).thenReturn(100.0);
        when(room1.getLight()).thenReturn(200.0);

        when(room2.getArea()).thenReturn(30.0);
        when(room2.getCube()).thenReturn(90.0);
        when(room2.getHeating()).thenReturn(150.0);
        when(room2.getLight()).thenReturn(250.0);

        when(room3.getArea()).thenReturn(25.0);
        when(room3.getCube()).thenReturn(75.0);
        when(room3.getHeating()).thenReturn(120.0);
        when(room3.getLight()).thenReturn(180.0);

        level.getChildren().add(room1);
        level.getChildren().add(room2);
        level.getChildren().add(room3);
    }

    @Test
    void GetAreaTest() {
        assertEquals(75, level.getArea());

        verify(room1, times(1)).getArea();
        verify(room2, times(1)).getArea();
        verify(room3, times(1)).getArea();
    }

    @Test
    void GetCubeTest() {
        assertEquals(225, level.getCube());

        verify(room1, times(1)).getCube();
        verify(room2, times(1)).getCube();
        verify(room3, times(1)).getCube();
    }

    @Test
    void GetHeatingTest() {
        assertEquals(370, level.getHeating());

        verify(room1, times(1)).getHeating();
        verify(room2, times(1)).getHeating();
        verify(room3, times(1)).getHeating();
    }

    @Test
    void GetLightTest() {
        assertEquals(630, level.getLight());

        verify(room1, times(1)).getLight();
        verify(room2, times(1)).getLight();
        verify(room3, times(1)).getLight();
    }
}
