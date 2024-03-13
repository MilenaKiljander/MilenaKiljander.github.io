package kappale13;

public class Asunto {
    private String tyyppi;
    private String osoite;
    private double pintaAla;
    private double hinta;
    private String kuvaus;
    
    // Parametriton konstruktori
    public Asunto() {
        
    }
    
    // Parametrillinen konstruktori
    public Asunto(String tyyppi, String osoite, double pintaAla, double hinta, String kuvaus) {
        this.tyyppi = tyyppi;
        this.osoite = osoite;
        this.pintaAla = pintaAla;
        this.hinta = hinta;
        this.kuvaus = kuvaus;
    }
    
    // Getterit ja setterit
    public String getTyyppi() {
        return tyyppi;
    }

    public void setTyyppi(String tyyppi) {
        this.tyyppi = tyyppi;
    }

    public String getOsoite() {
        return osoite;
    }

    public void setOsoite(String osoite) {
        this.osoite = osoite;
    }

    public double getPintaAla() {
        return pintaAla;
    }

    public void setPintaAla(double pintaAla) {
        this.pintaAla = pintaAla;
    }

    public double getHinta() {
        return hinta;
    }

    public void setHinta(double hinta) {
        this.hinta = hinta;
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
        return "Tyyppi: " + tyyppi + "\n" +
               "Osoite: " + osoite + "\n" +
               "Pinta-ala: " + String.format("%.2f", pintaAla) + "\n" +
               "Hinta: " + String.format("%.2f", hinta) + " euroa\n" +
               "Kuvaus: " + kuvaus;
    }
}