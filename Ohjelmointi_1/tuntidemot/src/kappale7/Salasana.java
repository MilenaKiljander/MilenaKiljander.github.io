package kappale7;

import java.util.Scanner;

public class Salasana {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna salasana:");
        String salasana = lukija.nextLine();

        boolean validPassword = checkPassword(salasana);

        if (validPassword) {
            System.out.println("Salasana kelpaa.");
        } else {
            System.out.println("Salasana ei käy.");
        }

        lukija.close();
    }

    public static boolean checkPassword(String password) {

        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = !password.equals(password.toLowerCase());
        boolean hasLowercase = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d.*");

        return hasUppercase && hasLowercase && hasDigit;
    }
}