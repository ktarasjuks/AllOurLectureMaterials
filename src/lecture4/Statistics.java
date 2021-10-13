package lecture4;

import java.util.Arrays;
import java.util.Random;

public class Statistics {

    int[] array;

    public void generateArray() {
        array = new int[25];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("My array " + Arrays.toString(array));
    }

    public void min() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min number from array = " + min);
    }

    public void max() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max number from array = " + max);
    }


    public void average() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double ave = (double) sum / (double) array.length;
        int ave1 = sum / array.length;
        System.out.println("Current sum is " + ave1);
    }
}



