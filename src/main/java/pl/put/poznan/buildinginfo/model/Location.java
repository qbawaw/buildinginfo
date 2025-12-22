package pl.put.poznan.buildinginfo.model;

import java.util.List;

public abstract class Location {

    protected Long id;

    public abstract double getArea();
    public abstract double getCube();
    public abstract double getHeating();
    public abstract double getLight();
    public abstract String type();
    public abstract List<Location> getChildren(); // returns list of children

    public Long getId() {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }
}
