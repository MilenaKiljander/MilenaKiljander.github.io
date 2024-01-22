package kappale1;

import java.util.Scanner;

public class Bitcoin {
public static void main(String[] args) {
    Scanner lukija = new Scanner(System.in);
    System.out.println("Anna Bitcoineihin investoidun rahan määrä: ");
    int Bitcoin = lukija.nextInt();
    double tuotto = Bitcoin * 15.06 - Bitcoin;
    System.out.println("Bitcoin tuotti vuodessa " + tuotto + " euroa");
    lukija.close();
}
}
