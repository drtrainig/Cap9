package com.itfactory.stocuri.servicii;

import com.itfactory.stocuri.exceptions.InvalidStockException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Categorii: imbracaminte, electronice
 */
public class Stocuri {
    private List<Produs> stockProduse;

    public Stocuri() {
        stockProduse = new ArrayList<>();
    }

    public void genereazaStockDeProduse(Map<Integer, String> categorii) throws InvalidStockException {
        for (Map.Entry<Integer, String> entry : categorii.entrySet()) {
            //Extrag cate o pereche din map
            int serie = entry.getKey();
            String categorie = entry.getValue();

            //Verific categoria: Trebuie sa fie doar imbracaminte sau electronice
            if (!(categorie.equals("imbracaminte") || categorie.equals("electronice")) ) {
                throw new InvalidStockException("Stoc invalid");
            }
            stockProduse.add(new Produs(serie, categorie, 123.5));
        }
    }

    public List<Produs> getStockProduse() {
        return stockProduse;
    }
}
