package pe.edu.i202224763.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.i202224763.entity.Country;

public class JPARemove {

    public static void main(String[] args) {

        //Referanciar al EMF y EM
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world_per");
        EntityManager em = emf.createEntityManager();

        // Obtengo el Country
        Country country = em.find(Country.class, "ERT");


        em.getTransaction().begin();
        em.remove(country);
        em.getTransaction().commit();


    }

}
