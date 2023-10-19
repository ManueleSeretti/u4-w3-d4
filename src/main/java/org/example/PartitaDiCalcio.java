package org.example;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class PartitaDiCalcio extends Eventi {
    private String squadra_casa;
    private String squadra_ospite;
    private String vincitore;
    private int goal_casa;
    private int goal_ospite;

    public PartitaDiCalcio() {
    }

    public PartitaDiCalcio(String titolo, LocalDate data_evento, String descrizione, tipoEvento tipo, int numero_massimo, String squadra_casa, String squadra_ospite, String vincitore, int goal_casa, int goal_ospite) {
        super(titolo, data_evento, descrizione, tipo, numero_massimo);
        this.squadra_casa = squadra_casa;
        this.squadra_ospite = squadra_ospite;
        this.vincitore = vincitore;
        this.goal_casa = goal_casa;
        this.goal_ospite = goal_ospite;
    }

    public String getSquadra_casa() {
        return squadra_casa;
    }

    public void setSquadra_casa(String squadra_casa) {
        this.squadra_casa = squadra_casa;
    }

    public String getSquadra_ospite() {
        return squadra_ospite;
    }

    public void setSquadra_ospite(String squadra_ospite) {
        this.squadra_ospite = squadra_ospite;
    }

    public String getVincitore() {
        return vincitore;
    }

    public void setVincitore(String vincitore) {
        this.vincitore = vincitore;
    }

    public int getGoal_casa() {
        return goal_casa;
    }

    public void setGoal_casa(int goal_casa) {
        this.goal_casa = goal_casa;
    }

    public int getGoal_ospite() {
        return goal_ospite;
    }

    public void setGoal_ospite(int goal_ospite) {
        this.goal_ospite = goal_ospite;
    }
}
