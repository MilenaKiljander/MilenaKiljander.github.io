package kappale13;

import java.time.LocalDate;

public class Remontti {
    private int vuosi;
    private String kuvaus;
    
    // Parametriton konstruktori
    public Remontti() {
        this.vuosi = LocalDate.now().getYear(); // Asetetaan nykyinen vuosi
    }
    
    // Parametrillinen konstruktori
    public Remontti(int vuosi, String kuvaus) {
        this.vuosi = vuosi;
        this.kuvaus = kuvaus;
    }
    
    // Getterit ja setterit
    public int getVuosi() {
        return vuosi;
    }

    public boolean setVuosi(int vuosi) {
        if (vuosi <= LocalDate.now().getYear()) { // Tarkistetaan, ettei vuosi ole tulevaisuudessa
            this.vuosi = vuosi;
            return true;
        } else {
            return false;
        }
    }

    public String getKuvaus() {
        return kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        this.kuvaus = kuvaus;
    }
    
    // toString-metodi
    @Override
    public String toString() {
        return "Vuonna " + vuosi + " tehtiin remontti " + kuvaus;
    }
}
