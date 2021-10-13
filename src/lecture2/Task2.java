package lecture2;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber1 = random.nextInt(101); // chislo do 101, java schitaet s 0; nextInt - metod
        int randomNumber2 = random.nextInt(101);
        int sum = randomNumber1 + randomNumber2;
        System.out.println("this is random number 1: " + randomNumber1);
        System.out.println("this is random number 2: " + randomNumber2);
        System.out.println("this is a sum: " + sum);
    }
}
