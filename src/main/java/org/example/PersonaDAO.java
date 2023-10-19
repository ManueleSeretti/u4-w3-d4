package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PersonaDAO {

    private final EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Persona e) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(e);
        transaction.commit();
        System.out.println("Nuova Persona salvata correttamente");
    }

    public Persona findById(int id) {
        // SELECT * FROM students WHERE students.id=1
        return em.find(Persona.class, id);
    }

    public void findByIdAndDelete(int id) {
        Persona e = em.find(Persona.class, id);

        if (e != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(e);
            transaction.commit();
            System.out.println("La Persona è stata cancellato correttamente");
        } else {
            System.err.println("La Persona con l'id " + id + " non è stato trovato");
        }


    }
}
