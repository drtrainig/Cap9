package com.itfactory.divizare;

import java.util.Random;

public class Divizare {

    public static void main(String[] args) {

        try {
            System.out.println(impartireSafe(10, 2));
            System.out.println(impartireSafe(10, 0));
            System.out.println("Am trecut fara nicio eroare");
        } catch (DivideBy0Exception e) {
            e.printStackTrace();
        }
    }

    public static int impartireSafe(int numar1, int numar2) throws DivideBy0Exception {
        System.out.println("Execut impartirea");
        if (numar2 == 0) {
            throw new DivideBy0Exception("S-a incercat divizarea la 0");
        }
        return numar1 / numar2;
    }
}
