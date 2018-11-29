package com.company;

public class Main {

    public static void main(String[] args) {
        int turnAmount = 0;
        int numberFound = 0;
        int arrayPlace;
        int turnAmountTotal = 0;
        double average = 0;
        int run = 10000;


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

            }
            while (numberFound == 100){
                turnAmountTotal += turnAmount;
                turnAmount = 0;
                numberFound = 0;
            }


        }
        average = turnAmountTotal / run;
        System.out.println("When running the generator " + run + " times, the average turn amount was " + average);


        System.out.println("When the loop is ran a larger amount of times, the average ends up being closer to the actual average, with a lesser variance. When ran 100 times, the average" +
                "ends up varying from around 505 turns to around 535 turns. When increasing the amount of times to 1000, the variance is around 5-7 turns. Finally, with 10000 times, the " +
                "variance would end up being 1-2. This happens because with more times ran, the possible range of different turn amounts would be seen, eventually resulting in a more " +
                "evened out result after dividing by the end result.  ");
    }
}
