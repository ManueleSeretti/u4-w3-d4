package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class LocationDAO {

    private final EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Location e) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(e);
        transaction.commit();
        System.out.println("Nuova Location salvata correttamente");
    }

    public Location findById(int id) {
        // SELECT * FROM students WHERE students.id=1
        return em.find(Location.class, id);
    }

    public void findByIdAndDelete(int id) {
        Location e = em.find(Location.class, id);

        if (e != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(e);
            transaction.commit();
            System.out.println("La Location è stata cancellato correttamente");
        } else {
            System.err.println("La Location con l'id " + id + " non è stato trovato");
        }


    }
}
