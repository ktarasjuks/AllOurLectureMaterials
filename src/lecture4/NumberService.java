package lecture4;

import java.util.Arrays;

public class NumberService {

    public int rangeSum(int start, int finish) {
        int sum = 0;
        int[] array = new int[0];
        if (start < finish) {
           array = new int[finish - start + 1];
            for (int i = 0; i < array.length; i++) {
                array[i] = start + i;
            }
            System.out.println("Newly created array is: " + Arrays.toString(array));

        } else if (start > finish) {
             array = new int[start - finish + 1];
            for (int i = 0; i < array.length; i++) {
                array[i] = start - i;
            }
            System.out.println("Newly created array is: " + Arrays.toString(array));

        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of range is: " + sum);
        return sum;
    }
}
