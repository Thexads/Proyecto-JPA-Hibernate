package pe.edu.i202224763.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "countrylanguage")
public class countrylanguage {

    @Id
    private String Language;

    @Enumerated(EnumType.STRING)
    @Column(name = "IsOfficial")
    private IsOfficial IsOfficial;

    private double Percentage;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name="CountryCode")
    private Country CountryCode;

    public countrylanguage() {
    }

    public countrylanguage(String language, pe.edu.i202224763.entity.IsOfficial isOfficial, double percentage, Country countryCode) {
        Language = language;
        IsOfficial = isOfficial;
        Percentage = percentage;
        CountryCode = countryCode;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public pe.edu.i202224763.entity.IsOfficial getIsOfficial() {
        return IsOfficial;
    }

    public void setIsOfficial(pe.edu.i202224763.entity.IsOfficial isOfficial) {
        IsOfficial = isOfficial;
    }

    public double getPercentage() {
        return Percentage;
    }

    public void setPercentage(double percentage) {
        Percentage = percentage;
    }

    public Country getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(Country countryCode) {
        CountryCode = countryCode;
    }
}
