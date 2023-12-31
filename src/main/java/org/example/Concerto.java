package org.example;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Concerto extends Eventi {
    private genere genere;

    private boolean streaming;


    public Concerto() {
    }

    public Concerto(String titolo, LocalDate data_evento, String descrizione, tipoEvento tipo, int numero_massimo, org.example.genere genere, boolean straming) {
        super(titolo, data_evento, descrizione, tipo, numero_massimo);
        this.genere = genere;
        this.streaming = straming;
    }

    public org.example.genere getGenere() {
        return genere;
    }

    public void setGenere(org.example.genere genere) {
        this.genere = genere;
    }

    public boolean isStraming() {
        return streaming;
    }

    public void setStraming(boolean straming) {
        this.streaming = straming;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", straming=" + streaming +
                '}';
    }
}
