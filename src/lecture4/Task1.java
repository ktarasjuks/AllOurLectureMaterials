package lecture4;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        int dice3;

        Random randomGenerator = new Random();

        do {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;
            dice3 = (int) (Math.random() * 6) + 1;

            System.out.println("Dice1 = " + dice1 + " Dice2 = " + dice2 + " Dice3 = " + dice3);

        }
        while ((dice1 != dice2) && (dice1 != dice3));


    }
}
