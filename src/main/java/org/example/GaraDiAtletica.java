package org.example;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class GaraDiAtletica extends Eventi {

    private Set<Persona> atleti;

    private Persona vincitore;


    public GaraDiAtletica() {
    }

    public GaraDiAtletica(String titolo, LocalDate data_evento, String descrizione, tipoEvento tipo, int numero_massimo, Set<Persona> atleti, Persona vincitore) {
        super(titolo, data_evento, descrizione, tipo, numero_massimo);
        this.atleti = atleti;
        this.vincitore = vincitore;
    }

    public Set<Persona> getAtleti() {
        return atleti;
    }

    public void setAtleti(Set<Persona> atleti) {
        this.atleti = atleti;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }
}
