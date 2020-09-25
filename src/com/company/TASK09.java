package com.company;

public class TASK09 {
    public static void main(String[] args) {
        System.out.println (sumDigitsInNumber (546));
    }

    public static int sumDigitsInNumber(int number) {
       number = number % 10 + number %100 / 10 + number / 100;
        return number;
    }

}
