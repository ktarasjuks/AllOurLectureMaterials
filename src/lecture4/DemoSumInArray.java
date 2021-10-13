package lecture4;

public class DemoSumInArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i]; // sum = sum + array[i];
            System.out.println("Current sum is " + sum);
        }
    }
}
