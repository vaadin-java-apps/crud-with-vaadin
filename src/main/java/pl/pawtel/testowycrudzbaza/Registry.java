package pl.pawtel.testowycrudzbaza;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registry {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String river;
    private String place;
    private String species;

    public Registry() {
    }

    public Registry(String river, String place, String species){
        this.river=river;
        this.place=place;
        this.species=species;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRiver() {
        return river;
    }

    public void setRiver(String river) {
        this.river = river;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Registry{" +
                "id=" + id +
                ", river='" + river + '\'' +
                ", place='" + place + '\'' +
                ", species='" + species + '\'' +
                '}';
    }
}
