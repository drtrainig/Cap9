package com.itfactory.arrays;

public class Arrays {
    public static void main(String[] args) throws Exception {
        int[] array = {1, 2, 3, 4};
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new Exception("S-a mers prea departe");
        } finally {
            System.out.println("Alt mesaj");
        }
    }
}
