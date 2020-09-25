package com.company;

public class TASK13 {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        double gW = 0.17 * earthWeight;
        return gW;
    }
}
