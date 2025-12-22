package pl.put.poznan.buildinginfo.model;
import java.util.List;

/**
 * Klasa reprezentująca pomieszczenie w budynku.
 * Dziedziczy po Location i dodaje szczegółowe parametry.
 */
public class Room extends Location {

    /**
     * Powierzchnia pomieszczenia w m^2.
     */
    private double area;
    /**
     * Kubatura pomieszczenia w m^3.
     */    
    private double cube;
    /**
     * Poziom zużycia energii ogrzewania (float).
     */
    private double heating;
    /**
     * Łączna moc oświetlenia w pomieszczeniu.
     */
    private double light;

    /**
     * Zwraca powierzchnie pomieszczenia w m^2
     */
    @Override
    public double getArea() {
        return area;
    }

    /**
     * Zwraca kubaturę pomieszczenia w m^3
     */
    @Override
    public double getCube() {
        return cube;
    }

    /**
     * Zwraca rodzaj lokalizacji
     */
    @Override
    public String type() {
        return "pomieszczenie";
    }

    /**
     * Zwraca poziom zużycia energii ogrzewania
     */
    @Override
    public double getHeating() {
        return heating;
    }

    /**
     * Zwraca łączną moc oświetlenia w pomieszczeniu
     */
    @Override
    public double getLight() {
        return light;
    }

    /**
     * Zwraca podlokalizacje
     */
    @Override
    public List<Location> getChildren() {
        return List.of(); 
    }

    /**
     * Ustawia powierzchnie pomieszczenia
     * @param area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * Ustala kubaturę pomieszczenia
     * @param cube
     */
    public void setCube(double cube) {
        this.cube = cube;
    }

    /**
     * Ustala poziom zużycia energii ogrzewania
     * @param heating
     */
    public void setHeating(double heating) {
        this.heating = heating;
    }

    /**
     * Ustala łączną moc oświetlenia w pomieszczeniu
     * @param light
     */
    public void setLight(double light) {
        this.light = light;
    }

    
}
