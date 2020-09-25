package com.company;

public class TASK08 {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
        int m = centimetre / 100;
        return m;

    }
}
