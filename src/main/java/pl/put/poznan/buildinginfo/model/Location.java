package pl.put.poznan.buildinginfo.model;

public abstract class Location {

    protected Long id;

    public abstract double getArea();
    public abstract double getCube();
    public abstract double getHeating();
    public abstract double getLight();

    public Long getId() {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }
}
