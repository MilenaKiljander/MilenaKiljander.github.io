package kappale1;

import java.util.Scanner;

public class Pikavippi {
public static void main(String[] args) {
    Scanner lukijaMäärä = new Scanner(System.in);
    System.out.println("Anna pikavipin määrä euroissa: ");
    double määrä = lukijaMäärä.nextDouble();
    
    Scanner lukijaVuosi = new Scanner(System.in);
    System.out.println("Moneksiko vuodeksi raha halutaan (1 tai 2): ");
    double vuosi = lukijaVuosi.nextDouble();
    
    Scanner lukijaVuosikorko = new Scanner(System.in);
    System.out.println("Lainakorko kahdesta yleisestä (41% tai 37%): ");
    double vuosikorko = lukijaVuosikorko.nextDouble();
    
    double korko = (määrä * vuosikorko * vuosi)/100;

    System.out.println("Lainatut rahat maksavat eli korko " + korko);
    
    lukijaMäärä.close();
    lukijaVuosi.close();
    lukijaVuosikorko.close();
}
}
