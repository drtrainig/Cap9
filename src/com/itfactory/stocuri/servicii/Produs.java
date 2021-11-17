package com.itfactory.stocuri.servicii;

public class Produs {
    private int serie;
    private String categorie;
    private double pret;

    public Produs(int serie, String categorie, double pret) {
        this.serie = serie;
        this.categorie = categorie;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Produs{" +
                "serie=" + serie +
                ", categorie='" + categorie + '\'' +
                ", pret=" + pret +
                '}';
    }
}
