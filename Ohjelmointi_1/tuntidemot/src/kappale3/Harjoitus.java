package kappale3;

import java.util.Scanner;

public class Harjoitus {
public static void main(String[] args) {

    Scanner lukijaLuku1 = new Scanner(System.in);
    System.out.println("Anna luku1 " );
    int Luku1 = lukijaLuku1.nextInt();

    Scanner lukijaLuku2 = new Scanner(System.in);
    System.out.println("Anna luku2: " );
    int Luku2 = lukijaLuku2.nextInt();

    Scanner lukijaLuku3 = new Scanner(System.in);
    System.out.println("Anna luku3: " );
    int Luku3 = lukijaLuku3.nextInt();

  

   int Summa = Luku1 + Luku2 + Luku3;
   System.out.println("Lukujen summa on: " + Summa); 

   double Keskiarvo = (Luku1 + Luku2 + Luku3)/3 ; 
   System.out.println("Lukujen keskiarvo on: " + Keskiarvo);

   lukijaLuku1.close();
   lukijaLuku2.close();
   lukijaLuku3.close();
}
}
