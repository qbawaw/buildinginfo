package pl.put.poznan.buildinginfo.model;

import java.util.ArrayList;
import java.util.List;

public class Level extends Location {

    protected List<Location> children = new ArrayList<>();

    @Override
    public double getArea() {
        return children.stream().mapToDouble(Location::getArea).sum();
    }

    @Override
    public double getCube() {
        return children.stream().mapToDouble(Location::getCube).sum();
    }

    @Override
    public double getHeating() {
        return children.stream().mapToDouble(Location::getHeating).sum();
    }

    @Override
    public double getLight() {
        return children.stream().mapToDouble(Location::getLight).sum();
    }

    public List<Location> getChildren() {
        return children;
    }
}

