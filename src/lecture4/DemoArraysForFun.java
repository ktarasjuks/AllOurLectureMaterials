package lecture4;

import java.util.Arrays;

public class DemoArraysForFun {

    public static void main(String[] args) {

        String[] alphabet = new String[5];

        alphabet[0] = "A";
        alphabet[1] = "B";
//        alphabet[2] = "C";
        alphabet[3] = "D";
        alphabet[4] = "E";

        System.out.println(Arrays.toString(alphabet));


        for (int i = 0; i < alphabet.length; i++){
            System.out.println("element with index " + i + " is " + alphabet[i]);
        }

        System.out.println("element with index  0 is " + alphabet[0]);
        System.out.println("element with index  1 is " + alphabet[1]);
        System.out.println("element with index  2 is " + alphabet[2]);
        System.out.println("element with index  3 is " + alphabet[3]);
        System.out.println("element with index  4 is " + alphabet[4]);
    }
}
