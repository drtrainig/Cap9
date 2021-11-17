package com.itfactory.tipurideexceptii.unchecked;

import java.util.ArrayList;
import java.util.List;

public class CitireNumere {
    public static void main(String[] args) {
        List<String> numereStrings = new ArrayList<>();
        numereStrings.add("1");
        numereStrings.add("3");
        numereStrings.add("6");
        numereStrings.add("1a");

        List<Integer> numereTransformate = new ArrayList<>();
        for (String numereString : numereStrings) {
            numereTransformate.add(Integer.parseInt(numereString));
        }
        System.out.println(numereTransformate);
    }
}
