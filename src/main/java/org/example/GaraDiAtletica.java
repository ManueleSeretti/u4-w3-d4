package org.example;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class GaraDiAtletica extends Eventi {
    @ManyToMany
    @JoinTable(name = "Persona_Gara",
            joinColumns = @JoinColumn(name = "id_evento"),
            inverseJoinColumns = @JoinColumn(name = "id_persona"))
    private Set<Persona> atleti;
    @ManyToOne
    @JoinColumn(name = "id_persona")
    private Persona vincitore;


    public GaraDiAtletica() {
    }

    public GaraDiAtletica(String titolo, LocalDate data_evento, String descrizione, tipoEvento tipo, int numero_massimo, Set<Persona> atleti) {
        super(titolo, data_evento, descrizione, tipo, numero_massimo);
        this.atleti = atleti;
        
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
