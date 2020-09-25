package com.company;

public class TASK07 {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        double fahrenhtit;
        fahrenhtit =  ((9/5.0)*celsius) +32;
        return fahrenhtit;

    }
}
