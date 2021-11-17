package com.itfactory;

import com.itfactory.exceptii.ExceptiaMea;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Citeste cuvant: ");
        try {
            String text = citesteCuvant();
            System.out.println(text);
        } catch (ExceptiaMea exceptiaMea) {
            exceptiaMea.printStackTrace();
        }

    }

    public static String citesteCuvant() throws ExceptiaMea {
        Scanner scanner = new Scanner(System.in);
        String mesaj = scanner.nextLine();
        if (mesaj.isEmpty()) {
            throw new ExceptiaMea("Ati introdus un string gol");
        }
        System.out.println("Sunt in metoda citeste cuvant");
        return mesaj;
    }
}
