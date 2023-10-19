package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import java.util.List;

public class EventoDAO {

    private final EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Eventi e) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(e);
        transaction.commit();
        System.out.println("Nuovo evento salvato correttamente");
    }

    public Eventi findById(int id) {
        // SELECT * FROM students WHERE students.id=1
        return em.find(Eventi.class, id);
    }

    public void findByIdAndDelete(int id) {
        Eventi e = em.find(Eventi.class, id);

        if (e != null) {
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(e);
            transaction.commit();
            System.out.println("Lo studente è stato cancellato correttamente");
        } else {
            System.err.println("Lo studente con l'id " + id + " non è stato trovato");
        }


    }

    public List<Concerto> findConcertStreaming() {
        TypedQuery<Concerto> lista = em.createQuery("SELECT c FROM Concerto c WHERE c.streaming = true", Concerto.class);
        return lista.getResultList();
    }

    public List<Concerto> getConcertiPerGenere(genere g) {
        TypedQuery<Concerto> lista = em.createQuery("SELECT c FROM Concerto c WHERE c.genere = :genere", Concerto.class);
        lista.setParameter("genere", g);
        return lista.getResultList();
    }
}
