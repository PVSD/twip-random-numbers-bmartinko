package com.company;

public class Main {

    public static void main(String[] args) {
        int turnAmount = 0;
        int numberFound = 0;
        int arrayPlace;
        int turnAmountTotal = 0;
        double average = 0;
        int run = 100;


        int bank[] = new int[100];

    for (int r = 0; r < run; r++) {
        for (int k = 0; k < bank.length; k++) {
            bank[k] = k + 1;

        }
        while (numberFound != 100) {
            int ranNumber = (int) (Math.random() * 100 + 1);
            turnAmount++;
            arrayPlace = ranNumber - 1;
            if (bank[arrayPlace] == ranNumber) {
                numberFound++;
                bank[arrayPlace] = 0;
            }
            turnAmountTotal += turnAmount;
            average = turnAmountTotal / run;
        }
    }

        System.out.println("It took " + turnAmount + " times to generate every possible value from 1-100");
        System.out.println("When running the generator " + run + " times, the average turn amount was " + average);
    }
}
