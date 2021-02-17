package basic;

import basic.Bloc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Bloc blocB2 = new Bloc(4, "Scara 2");
        //Bloc blocD4 = new Bloc(3, "Scara 3", "E2");
        //String adresaA1 = blocA1.getAdresa();
        //String adresaB2 = blocB2.getAdresa();
        //System.out.println("Adresa lui A1: " + adresaA1);
        //System.out.println("Adresa lui B2: " + adresaB2);

        Bloc blocA1 = new Bloc(12, "Scara 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Care este numele blocului?");
        String numeBloc = scanner.nextLine();
        blocA1.setNumeBloc(numeBloc);
        String adresa = blocA1.getAdresa();
        System.out.println(adresa);

        System.out.println("Introduceti pretul pe etaj:");
        int pret = scanner.nextInt();
        scanner.nextLine();
        blocA1.setPretPeEtaj(pret);

        int total = blocA1.calculateTotalPrice();
        System.out.println("Te costa: " + total);
    }
}
