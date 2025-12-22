package pl.put.poznan.buildinginfo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Klasa reprezentująca poziom w budynku
 * Dziedziczy po klasie Location i dodaje szczegółowe parametry
 */
public class Level extends Location {

    /**
     * Lista pomieszczeń znajdujących się na kondygnacji
     */
    protected List<Location> children = new ArrayList<>();

    /**
     * Zwraca łączną powierzchnie kondygnacji w m^2
     */
    @Override
    public double getArea() {
        return children.stream().mapToDouble(Location::getArea).sum();
    }

    /**
     * Zwraca łączną kubaturę kondygnacji w m^3
     */
    @Override
    public double getCube() {
        return children.stream().mapToDouble(Location::getCube).sum();
    }

    /**
     * Zwraca rodzaj lokalizacji
     */
    @Override
    public String type() {
        return "poziom";
    }

    /**
     * Zwraca poziom zużycia energii ogrzewania dla kondygnacji
     */
    @Override
    public double getHeating() {
        return children.stream().mapToDouble(Location::getHeating).sum();
    }

    /**
     * Zwraca łączną moc oświetlenia na kondygnacji
     */
    @Override
    public double getLight() {
        return children.stream().mapToDouble(Location::getLight).sum();
    }

    /**
     * Zwraca listę pomieszczeń znajdujących się na kondygnacji
     */
    @Override
    public List<Location> getChildren() {
        return children;
    }
}

