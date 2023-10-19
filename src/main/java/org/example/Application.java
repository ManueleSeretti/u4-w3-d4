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
//
//            Persona p1 = new Persona("Mirco", "Massi", "email", d1, Sesso.M);
//            Persona p2 = new Persona("Mario", "Longo", "email", d1, Sesso.M);
//            Persona p3 = new Persona("Luca", "Palla", "email", d1, Sesso.M);
//            Persona p4 = new Persona("Anna", "Matri", "email", d1, Sesso.F);
//            Persona p5 = new Persona("Mara", "Lucca", "email", d1, Sesso.F);
//            Persona p6 = new Persona("Alessio", "Doni", "email", d1, Sesso.M);
//            Persona p7 = new Persona("Gino", "Ianni", "email", d1, Sesso.M);
//            Persona p8 = new Persona("Carmine", "Loris", "email", d1, Sesso.M);
            //  pd.save(p1); pd.save(p2); pd.save(p3); pd.save(p4);pd.save(p5);pd.save(p6);pd.save(p7); pd.save(p8);

//            Set<Persona> partecipanti = new HashSet<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8));

//            Location l1 = new Location("stadio-olimpico", "Roma");
//            ld.save(l1);
//            Location l2 = new Location("stadio dei marmi", "Roma");
//            ld.save(l2);
//            Location l3 = new Location("L'arena", "Verona");
//            ld.save(l3);
            //          Location l4 = new Location("stadio", "Milano");
//            ld.save(l4);
            //          Location l5 = new Location("stadio", "Torino");
////            ld.save(l5);
//            GaraDiAtletica g1 = new GaraDiAtletica("100m", d1, "ciao", tipoEvento.randomTipoEvento(), 350, partecipanti);
//            GaraDiAtletica g2 = new GaraDiAtletica("400m", d1, "ciao", tipoEvento.randomTipoEvento(), 350, partecipanti);
//            GaraDiAtletica g3 = new GaraDiAtletica("800m", d1, "ciao", tipoEvento.randomTipoEvento(), 350, partecipanti);
//            GaraDiAtletica g4 = new GaraDiAtletica("1000m", d1, "ciao", tipoEvento.randomTipoEvento(), 350, partecipanti);

            //    ed.save(g1);ed.save(g2);ed.save(g3);ed.save(g4);

//            Eventi g5 = ed.findById(79);
//            g5.setLocation(ld.findById(64));
//            ed.save(g5);
//            Eventi g6 = ed.findById(80);
//            g6.setLocation(ld.findById(65));
//            ed.save(g6);
//            Eventi g7 = ed.findById(81);
//            g7.setLocation(ld.findById(67));
//            ed.save(g7);
//            Eventi g8 = ed.findById(82);
//            g8.setLocation(ld.findById(68));
//            ed.save(g8);

//            GaraDiAtletica g10 = (GaraDiAtletica) g5;
//            ((GaraDiAtletica) g5).setVincitore(pd.findById(72));
//            ed.save(g10);
//            GaraDiAtletica g11 = (GaraDiAtletica) g6;
//            ((GaraDiAtletica) g6).setVincitore(pd.findById(76));
//            ed.save(g11);
//            GaraDiAtletica g12 = (GaraDiAtletica) g7;
//            ((GaraDiAtletica) g7).setVincitore(pd.findById(72));
//            ed.save(g12);
//            GaraDiAtletica g13 = (GaraDiAtletica) g8;
//            ((GaraDiAtletica) g8).setVincitore(pd.findById(75));
//            ed.save(g13);


//            Concerto c1 = new Concerto("Vasco", d1, "ciao", tipoEvento.randomTipoEvento(), 10000, genere.ROCK, true);
//            c1.setLocation(ld.findById(64));
//            ed.save(c1);
//            Concerto c2 = new Concerto("Musica Classica", d1, "ciao", tipoEvento.randomTipoEvento(), 10000, genere.CLASSICO, true);
//            c2.setLocation(ld.findById(65));
//            ed.save(c2);
//            Concerto c3 = new Concerto("Metal", d1, "ciao", tipoEvento.randomTipoEvento(), 10000, genere.ROCK, true);
//            c3.setLocation(ld.findById(67));
//            ed.save(c3);
//            Concerto c4 = new Concerto("Rap", d1, "ciao", tipoEvento.randomTipoEvento(), 10000, genere.POP, true);
//            c4.setLocation(null);
//            ed.save(c4);
            // Partecipazioni par1 = new Partecipazioni(pers, event, Stato.CONFERMATO);
            // pa.save(par1);


//            PartitaDiCalcio par1 = new PartitaDiCalcio("partita di calcio", d1, "ciao", tipoEvento.randomTipoEvento(), 60000, "Napoli", "Fiorentina", "Napoli", 3, 1);
//            ed.save(par1);
//            PartitaDiCalcio par2 = new PartitaDiCalcio("partita di calcio", d1, "ciao", tipoEvento.randomTipoEvento(), 60000, "Torino", "Atalanta", "Torino", 3, 1);
//            ed.save(par2);
//            PartitaDiCalcio par3 = new PartitaDiCalcio("partita di calcio", d1, "ciao", tipoEvento.randomTipoEvento(), 60000, "Juve", "Lazio", "Lazio", 0, 2);
//            ed.save(par3);


            List<Concerto> c = ed.findConcertStreaming();
            if (c.size() > 0) {
                c.forEach(x -> System.out.println(x));
            } else {
                System.out.println("nessun concerto trovato");
            }


        } catch (Exception ex) {
            System.err.println(ex);
        } finally {
            // Ricordiamoci alla fine di tutto di chiudere sia entitymanager che entitymanager factory
            em.close();
            emf.close();
        }
    }
}
