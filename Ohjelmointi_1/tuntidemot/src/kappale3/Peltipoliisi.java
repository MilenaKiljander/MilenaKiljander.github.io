package kappale3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Peltipoliisi {
public static void main(String[] args) {
    
DecimalFormat ds = new DecimalFormat("0.00");

Scanner lukijaNopeus = new Scanner(System.in);
System.out.println("Anna nopeutesi: ");
double Nopeus = lukijaNopeus.nextDouble();

double Ylinopeus = Nopeus - 80;

if (Ylinopeus > 20) {
    System.out.println("Päiväsakko ");
    System.out.println("Anna nettokuukausitulosi: ");
    Scanner lukijaSakko = new Scanner(System.in);
    double Nettotulot = lukijaSakko.nextDouble();

    double sakko = (Nettotulot - 255) / 60;

    if ( sakko < 6) {
        sakko = 6;
    }
    System.out.println("Päiväsakon määrä on "+ ds.format(sakko) + " euroa");
    lukijaSakko.close();
}

else if (Ylinopeus > 0 && Ylinopeus < 20) {
    System.out.println("Rikesakko");
}
else{
    System.out.println("Ei sakkoa");
}

lukijaNopeus.close();

}
}
