package com.itfactory.tipurideexceptii.unchecked;

import java.util.Random;

public class DivizareaCu0 {
    public static void main(String[] args) {
        Random random = new Random();

        int random1 = random.nextInt(5);
        int random2 = random.nextInt(2);

        if (random2 != 0) {
            System.out.println(random1 / random2);
        }
    }
}
