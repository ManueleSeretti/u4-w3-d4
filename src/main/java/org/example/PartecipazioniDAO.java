package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PartecipazioniDAO {

    private final EntityManager em;

    public PartecipazioniDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Partecipazioni e) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(e);
        transaction.commit();
        System.out.println("Nuova Partecipazione salvata correttamente");
    }

    public Partecipazioni findById(int id) {
        // SELECT * FROM students WHERE students.id=1
        return em.find(Partecipazioni.class, id);
    }

    public void findByIdAndDelete(int id) {
        Partecipazioni e = em.find(Partecipazioni.class, id);

        if (e != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(e);
            transaction.commit();
            System.out.println("La LPartecipazione è stata cancellato correttamente");
        } else {
            System.err.println("La Partecipazione con l'id " + id + " non è stato trovato");
        }


    }
}
