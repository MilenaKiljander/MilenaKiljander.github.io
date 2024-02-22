package kappale9;

public class Kello {
    private int tunnit;
    private int minuutit;

    public Kello(int tunnit, int minuutit) {
        if (tunnit < 0 || tunnit > 23 || minuutit < 0 || minuutit > 59) {
            throw new IllegalArgumentException("Virheellinen kellonaika");
        }
        this.tunnit = tunnit;
        this.minuutit = minuutit;
    }

    public int getTunnit() {
        return tunnit;
    }

    public void setTunnit(int tunnit) {
        if (tunnit < 0 || tunnit > 23) {
            throw new IllegalArgumentException("Virheellinen tuntiarvo");
        }
        this.tunnit = tunnit;
    }

    public int getMinuutit() {
        return minuutit;
    }

    public void setMinuutit(int minuutit) {
        if (minuutit < 0 || minuutit > 59) {
            throw new IllegalArgumentException("Virheellinen minuuttiarvo");
        }
        this.minuutit = minuutit;
    }

    public void lisaaMinuutit(int mins) {
        if (mins < 0) {
            throw new IllegalArgumentException("Virheellinen aikamäärä");
        }
        minuutit += mins;
        tunnit += minuutit / 60;
        minuutit %= 60;
        tunnit %= 24;
    }

    @Override
    public String toString() {
        return String.format("%d:%02d", tunnit, minuutit);
    }
}
