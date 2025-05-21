package org.example;

import javax.persistence.*;

/**
 * Classe Main per obrir la sessió amb ObjectDB i gestionar alumnes
 *
 * @author Yamila, Nikita i Andrea
 */
public class Main {
    public static void main(String[] args) {
        // Obrim la sessió amb ObjectDB
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("objectdb:alumnes.odb");
        EntityManager em = emf.createEntityManager();

        // Estructura TRY-CATCH per gestionar excepcions
        try{
            // Inciem la transacció i afegim alumnes
            em.getTransaction().begin();
            em.persist(new Alumne("12345678A", "Mauri", "Hidalgo"));
            em.persist(new Alumne("14559533P", "Fernando", "Alonso"));
            em.persist(new Alumne("12345678B", "Yamila", "Cazalla"));
            em.persist(new Alumne("12345678C", "Nikita", "Matvei"));
            em.persist(new Alumne("12345678D", "Andrea", "Esplugas"));
            em.persist(new Alumne("12345678E", "Juan", "Cuesta"));
            em.persist(new Alumne("12345678F", "Max", "Verstappen"));
            em.persist(new Alumne("12345678G", "Carlos", "Sainz Jr."));

            // Finalitzem la transacció (commit)
            em.getTransaction().commit();

            // Consultem i mostrem els alumnes
            TypedQuery<Alumne> query = em.createQuery("SELECT a FROM Alumne a", Alumne.class);
            for (Alumne a : query.getResultList()) {
                System.out.println(a);
            }
        } catch(Exception e){
            System.err.println(e.getMessage());
        }

        // Tancament de la sessió i del EntityManagerFactory
        em.close();
        emf.close();
    }
}