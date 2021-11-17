package com.itfactory.stocuri;

import com.itfactory.stocuri.exceptions.InvalidStockException;
import com.itfactory.stocuri.servicii.Stocuri;

import java.util.Map;

public class Main {
    public static void main(String[] args)  {
        Stocuri stocuri = new Stocuri();
        try {
            Map<Integer, String> stock = Map.of(101, "electronice", 102, "electronice", 103, "imbracaminte");
            stocuri.genereazaStockDeProduse(stock);
        } catch (InvalidStockException e) {
            e.printStackTrace();
        }
        System.out.println(stocuri.getStockProduse());
    }
}
