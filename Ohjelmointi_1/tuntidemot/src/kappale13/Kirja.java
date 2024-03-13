package kappale13;

public class Kirja {
    private String nimi;
    private String isbn;
    private double hinta;
    private int vuosi;

    // Parametriton konstruktori
    public Kirja() {

    }

    // Parametrillinen konstruktori
    public Kirja(String nimi, String isbn, double hinta, int vuosi) {
        this.nimi = nimi;
        this.isbn = isbn;
        this.hinta = hinta;
        this.vuosi = vuosi;
    }

    // Getterit ja setterit
    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getHinta() {
        return hinta;
    }

    public void setHinta(double hinta) {
        this.hinta = hinta;
    }

    public int getVuosi() {
        return vuosi;
    }

    public void setVuosi(int vuosi) {
        this.vuosi = vuosi;
    }

    // toString-metodi
    @Override
    public String toString() {
        return "Kirja [nimi=" + nimi + ", isbn=" + isbn + ", hinta=" + hinta + ", vuosi=" + vuosi + "]";
    }
}
