package org.example;

import javax.persistence.*;

@Entity
public class Partecipazioni {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "evento_id")
    private Eventi evento;
    private Stato stato;

    public Partecipazioni() {
    }

    public Partecipazioni(Persona persona, Eventi evento, Stato stato) {
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }

    public int getId() {
        return id;
    }


    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Eventi getEvento() {
        return evento;
    }

    public void setEvento(Eventi evento) {
        this.evento = evento;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }
}
