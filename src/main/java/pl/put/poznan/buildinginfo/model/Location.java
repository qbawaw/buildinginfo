package pl.put.poznan.buildinginfo.model;

import java.util.List;
/**
 * Klasa reprezentująca ogólną lokalizację w budynku.
 * Może być budynkiem, poziomem lub pomieszczeniem.
 */
public abstract class Location {

    /**
     * Unikalny identyfikator lokalizacji.
     */
    protected Long id;

     /**
     * Nazwa lokalizacji.
     */
    protected String name;

    public abstract double getArea();
    public abstract double getCube();
    public abstract double getHeating();
    public abstract double getLight();
    public abstract String type();
    public abstract List<Location> getChildren(); 

      /**
     * Zwraca identyfikator lokalizacji.
     */
    public Long getId() {
        return id;
    }

     /**
     * Zwraca nazwę lokalizacji.
     */
    public String getName() {
        return name;
    }

    /**
     * Ustawia identyfikator lokalizacji.
     */
    public void setId (long id) {
        this.id = id;
    }

    /**
     * Ustawia nazwę lokalizacji.
     */
    public void setName (String name){
        this.name = name;
    }
}
