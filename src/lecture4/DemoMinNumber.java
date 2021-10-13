package lecture4;

public class DemoMinNumber {

    public static void main(String[] args) {

        int[] array = {1, -2, 23, 14, 51, 6, 21, 34, 8, 0};
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Minimal number " + max);
    }
}
