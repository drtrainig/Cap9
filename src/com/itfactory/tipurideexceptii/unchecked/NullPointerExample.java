package com.itfactory.tipurideexceptii.unchecked;

import java.util.ArrayList;
import java.util.List;

public class NullPointerExample {
    public static void main(String[] args) {
        List<String> produse = new ArrayList<>();
        produse.add("carte");
        produse.add(null);
        produse.add("Haine");

        for (String s : produse) {
            if (s != null && s.equals("Haine")) {
                System.out.println("Am haine");
            }
        }
    }
}
