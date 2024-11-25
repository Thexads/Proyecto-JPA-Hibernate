package pe.edu.i202224763.entity;

import jakarta.persistence.*;

@Entity
@Table(name ="city")
public class city {

    @Id
    private int id;
    private String name;
    private String District;
    private int Population;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name="CountryCode")
    private Country CountryCode;

    public city() {
    }

    public city(int id, String name, String district, int population, Country countryCode) {
        this.id = id;
        this.name = name;
        District = district;
        Population = population;
        CountryCode = countryCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return District;
    }

    public void setDistrict(String district) {
        District = district;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public Country getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(Country countryCode) {
        CountryCode = countryCode;
    }
}
