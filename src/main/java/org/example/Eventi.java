package org.example;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Eventi {
    @Id
    @GeneratedValue
    private int id;

    private String titolo;
    private LocalDate data_evento;
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private tipoEvento tipo;

    private int numero_massimo;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.REMOVE)
    private Set<Partecipazioni> partecipazioni;
    @OneToOne
    @JoinColumn(name = "id_location")
    private Location location;

    public Eventi() {
    }

    public Eventi(String titolo, LocalDate data_evento, String descrizione, tipoEvento tipo, int numero_massimo) {
        this.titolo = titolo;
        this.data_evento = data_evento;
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.numero_massimo = numero_massimo;
    }

    public Set<Partecipazioni> getPartecipazioni() {
        return partecipazioni;
    }

    public void setPartecipazioni(Set<Partecipazioni> partecipazioni) {
        this.partecipazioni = partecipazioni;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData_evento() {
        return data_evento;
    }

    public void setData_evento(LocalDate data_evento) {
        this.data_evento = data_evento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public tipoEvento getTipo() {
        return tipo;
    }

    public void setTipo(tipoEvento tipo) {
        this.tipo = tipo;
    }

    public int getNumero_massimo() {
        return numero_massimo;
    }

    public void setNumero_massimo(int numero_massimo) {
        this.numero_massimo = numero_massimo;
    }

    @Override
    public String toString() {
        return "Eventi{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", data_evento=" + data_evento +
                ", descrizione='" + descrizione + '\'' +
                ", tipo=" + tipo +
                ", numero_massimo=" + numero_massimo +
                '}';
    }
}
