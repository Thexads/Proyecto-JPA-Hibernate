package pe.edu.i202224763.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202224763.entity.*;

import java.util.Arrays;

public class JPAPersist {

    public static void main(String[] args) {

        //Referanciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world_per");
        EntityManager em = emf.createEntityManager();

        // CREO EL PAIS
        Country country = new Country("ERT","paisImaginario02", Continent.valueOf("Asia"),"South America",48511.00,1910,2124000,52.4,372.00,383.00,"Druk-Yul","Monarchy","Jigme Singye Wangchuk",192,"BT",null,null);

        // CREO LAS CIUDADES
        city city01 = new city(5001,"ciudad01","Kabol",1780000,country);
        city city02= new city(5002,"ciudad02","Kabol",1780000,country);
        city city03 = new city(5003,"ciudad03","Kabol",1780000,country);

        country.setCitys(Arrays.asList(city01,city02,city03));

        // CREO LAS LENGUAS
        countrylanguage countrylanguage01 = new countrylanguage("English01", IsOfficial.F,9.5,country);
        countrylanguage countrylanguage02 = new countrylanguage("English02",IsOfficial.T,9.5,country);

        country.setCountrylanguages(Arrays.asList(countrylanguage01,countrylanguage02));

        em.getTransaction().begin();
        em.persist(country);
        em.getTransaction().commit();

    }

}
