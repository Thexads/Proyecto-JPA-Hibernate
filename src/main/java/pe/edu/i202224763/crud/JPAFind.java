package pe.edu.i202224763.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202224763.entity.Country;

public class JPAFind {

    public static void main(String[] args) {

        //Referanciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world_per");
        EntityManager em = emf.createEntityManager();

        // Obtengo el Country
        Country country = em.find(Country.class, "PER");

        // Mostramos los resultados

        em.getTransaction().begin();
        if (country != null && country.getCitys() != null) {
            country.getCitys().stream()
                    .filter(city -> city.getPopulation() > 700000) // Filtrar por población > 700k
                    .forEach(city -> System.out.println(city.getName())); // Imprimir nombres de las ciudades
        } else {
            System.out.println("No se encontraron ciudades para el país con código PER.");
        }
        em.getTransaction().commit();


    }

}
