package kappale4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {

        Scanner lukijaHinnat = new Scanner(System.in);
        DecimalFormat ds = new DecimalFormat("0.00");
        System.out.print(ds.format("Anna pizzojen hinnat (3): "));
        double hinta1 = lukijaHinnat.nextDouble();
        double hinta2 = lukijaHinnat.nextDouble();
        double hinta3 = lukijaHinnat.nextDouble();

        double halvin = hinta1< hinta2 && hinta1 < hinta3? hinta1 : hinta2 < hinta1 && hinta2 < hinta3 ? hinta2 : hinta3;
  
        Scanner lukijaSumma = new Scanner(System.in);
        DecimalFormat ds2 = new DecimalFormat("0.00");
        double Summa = hinta1 + hinta2 + hinta3 - halvin;
        System.out.println("Maksettavaa: " + ds2.format(Summa));
    
        Scanner lukijaKeskihinta = new Scanner(System.in);
        DecimalFormat ds3 = new DecimalFormat("0.00");
        double Keskihinta = Summa / 3;
        System.out.println("Yksittäisen hinta: " + ds3.format(Keskihinta));

        lukijaHinnat.close();
        lukijaKeskihinta.close();
        lukijaSumma.close();
    }
}
