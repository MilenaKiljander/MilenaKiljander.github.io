package kappale1;

import java.util.Scanner;

public class Juhlat {
public static void main(String[] args) {

    System.out.println("Anna juhliin tulevien aikuisten määrä: ");
    Scanner lukijaMäärä = new Scanner(System.in);
    double Määrä = lukijaMäärä.nextDouble();


    int Pullot = (int) (Math.ceil(Määrä / 7));
    System.out.println("Pulloja tarvitaan " + Pullot +" kappaletta");

    int Jäljellä = (int) (Math.ceil(7 * Pullot - Määrä));
    System.out.println("Viimeisestä pullosta jää " + Jäljellä + " lasia");

    lukijaMäärä.close();
   
}
}
