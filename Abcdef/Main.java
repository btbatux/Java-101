package Abcdef;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] liste2 = { 15, 1, 99, 7, 7, -22, 11, 2, -49, 52 };

        Arrays.fill(liste2, 1, 1, 5);
        System.out.println(Arrays.toString(liste2));
    }
}
