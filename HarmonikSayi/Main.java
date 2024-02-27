package HarmonikSayi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        double result = 0.0;

        System.out.println("N Sayısını Giriniz: ");
        number = scanner.nextInt();

        for (double i = 1; i <= number; i++) {
            result += (1 / i);
        }
        System.out.println("Harmonik Sayi: " + result);
    }

}
