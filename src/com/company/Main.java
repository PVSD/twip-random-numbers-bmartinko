package com.company;

public class Main {

    public static void main(String[] args) {
        int turnAmount = 0;
        int numberFound = 0;
        int arrayPlace;
        int fullTimeRan = 0;
        int turnAmountTotal = 0;


        int bank[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
             21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
             41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,
             61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,
             81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};

    while (fullTimeRan != 100) {
        while (numberFound != 100) {
            int ranNumber = (int) (Math.random() * 100 + 1);
            turnAmount++;
            arrayPlace = ranNumber - 1;
            if (bank[arrayPlace] == ranNumber) {
                numberFound++;
                bank[arrayPlace] = 0;
            }
            if (numberFound == 100){
                fullTimeRan++;
                turnAmountTotal += turnAmount;
                numberFound = 0;
                turnAmount = 0;
                bank[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
                        21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,
                        41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,
                        61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,
                        81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100};

            }
        }
    }
        System.out.println("It took " + turnAmount + " times to generate every possible value from 1-100");
    }
}
