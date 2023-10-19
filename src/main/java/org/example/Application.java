package org.example;

import com.github.javafaker.Faker;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestione_eventi");

    public static void main(String[] args) {
        Random rndm = new Random();
        Faker faker = new Faker();
        List<Eventi> list = new ArrayList<>();
        EntityManager em = emf.createEntityManager();
        PersonaDAO pd = new PersonaDAO(em);
        PartecipazioniDAO pa = new PartecipazioniDAO(em);
        EventoDAO ed = new EventoDAO(em);
        LocationDAO ld = new LocationDAO(em);
        LocalDate d1 = LocalDate.of(1990, 12, 12);
        try {

            // Persona p1 = new Persona("Mirco", "Massi", "email", d1, Sesso.M);
//            pd.save(p1);
            // Location l1 = new Location("stadio-olimpico", "Roma");
//            ld.save(l1);
            // Eventi e1 = new Eventi("concerto", d1, "ciao", tipoEvento.randomTipoEvento(), 350);
            //  ed.save(e1);
            // Partecipazioni par1 = new Partecipazioni(pers, event, Stato.CONFERMATO);
            // pa.save(par1);
            // Persona pers = pd.findById(57);
            //Eventi event = ed.findById(59);
            //Location loc = ld.findById(58);
            //event.setLocation(loc);
            //ed.save(event);
            //ed.findByIdAndDelete(59);

        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            // Ricordiamoci alla fine di tutto di chiudere sia entitymanager che entitymanager factory
            em.close();
            emf.close();
        }
    }
}
