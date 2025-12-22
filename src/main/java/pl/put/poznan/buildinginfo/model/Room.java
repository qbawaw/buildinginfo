package pl.put.poznan.buildinginfo.model;
import java.util.List;
public class Room extends Location {

    private double area;
    private double cube;
    private double heating;
    private double light;

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getCube() {
        return cube;
    }

    @Override
    public String type() {
        return "pomieszczenie";
    }

    @Override
    public double getHeating() {
        return heating;
    }

    @Override
    public double getLight() {
        return light;
    }

    @Override
    public List<Location> getChildren() {
        return List.of(); 
    }
    public void setArea(double area) {
        this.area = area;
    }

    public void setCube(double cube) {
        this.cube = cube;
    }

    public void setHeating(double heating) {
        this.heating = heating;
    }

    public void setLight(double light) {
        this.light = light;
    }



}
