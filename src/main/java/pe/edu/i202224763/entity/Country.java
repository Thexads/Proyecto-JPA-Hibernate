package pe.edu.i202224763.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "country")
public class Country {

    @Id
    private String code;
    private String Name;

    @Enumerated(EnumType.STRING)
    @Column(name = "Continent")
    private Continent Continent;

    private String Region;
    private double SurfaceArea;
    private double IndepYear;
    private int Population;
    private double LifeExpectancy;
    private double GNP;
    private double GNPOld;
    private String LocalName;
    private String GovernmentForm;
    private String HeadOfState;
    private int Capital;
    private String Code2;


    @OneToMany(mappedBy = "CountryCode", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<city> citys;

    @OneToMany(mappedBy = "CountryCode", cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, orphanRemoval = true)
    private List<countrylanguage> countrylanguages;

    public Country() {
    }

    public Country(String code, String name, pe.edu.i202224763.entity.Continent continent, String region, double surfaceArea, double indepYear, int population, double lifeExpectancy, double GNP, double GNPOld, String localName, String governmentForm, String headOfState, int capital, String code2, List<city> citys, List<countrylanguage> countrylanguages) {
        this.code = code;
        Name = name;
        Continent = continent;
        Region = region;
        SurfaceArea = surfaceArea;
        IndepYear = indepYear;
        Population = population;
        LifeExpectancy = lifeExpectancy;
        this.GNP = GNP;
        this.GNPOld = GNPOld;
        LocalName = localName;
        GovernmentForm = governmentForm;
        HeadOfState = headOfState;
        Capital = capital;
        Code2 = code2;
        this.citys = citys;
        this.countrylanguages = countrylanguages;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public pe.edu.i202224763.entity.Continent getContinent() {
        return Continent;
    }

    public void setContinent(pe.edu.i202224763.entity.Continent continent) {
        Continent = continent;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public double getSurfaceArea() {
        return SurfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        SurfaceArea = surfaceArea;
    }

    public double getIndepYear() {
        return IndepYear;
    }

    public void setIndepYear(double indepYear) {
        IndepYear = indepYear;
    }

    public int getPopulation() {
        return Population;
    }

    public void setPopulation(int population) {
        Population = population;
    }

    public double getLifeExpectancy() {
        return LifeExpectancy;
    }

    public void setLifeExpectancy(double lifeExpectancy) {
        LifeExpectancy = lifeExpectancy;
    }

    public double getGNP() {
        return GNP;
    }

    public void setGNP(double GNP) {
        this.GNP = GNP;
    }

    public double getGNPOld() {
        return GNPOld;
    }

    public void setGNPOld(double GNPOld) {
        this.GNPOld = GNPOld;
    }

    public String getLocalName() {
        return LocalName;
    }

    public void setLocalName(String localName) {
        LocalName = localName;
    }

    public String getGovernmentForm() {
        return GovernmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        GovernmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return HeadOfState;
    }

    public void setHeadOfState(String headOfState) {
        HeadOfState = headOfState;
    }

    public int getCapital() {
        return Capital;
    }

    public void setCapital(int capital) {
        Capital = capital;
    }

    public String getCode2() {
        return Code2;
    }

    public void setCode2(String code2) {
        Code2 = code2;
    }

    public List<city> getCitys() {
        return citys;
    }

    public void setCitys(List<city> citys) {
        this.citys = citys;
    }

    public List<countrylanguage> getCountrylanguages() {
        return countrylanguages;
    }

    public void setCountrylanguages(List<countrylanguage> countrylanguages) {
        this.countrylanguages = countrylanguages;
    }
}
