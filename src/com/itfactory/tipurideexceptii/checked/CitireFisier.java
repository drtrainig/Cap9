package com.itfactory.tipurideexceptii.checked;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CitireFisier {
    public static void main(String[] args) {
        Path path = Paths.get("fileTest.txt");

        List<String> read = null;
        try {
            read = Files.readAllLines(path);
            System.out.println("Alt mesaj");
            System.out.println(read);
            System.out.println("Mesaj");
        } catch (IOException exception) {
            System.out.println("Fisierul nu este prezent");
            exception.printStackTrace();
        }
    }
}
