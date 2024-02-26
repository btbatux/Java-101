package MinMaxBulma;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz? ");
        int adet = scanner.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println(max);
        int sayi;

        /*
         * Eğer girilen sayı, mevcut min değerinden küçükse, min değeri bu sayı olarak
         * güncellenir.
         * Eğer girilen sayı, mevcut max değerinden büyükse, max değeri bu sayı olarak
         * güncellenir.
         */

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            sayi = scanner.nextInt();

            if (sayi < min) {
                min = sayi;
            }
            if (sayi > max) {
                max = sayi;
            }
        }

        System.out.println("Girilen sayıların en küçüğü: " + min);
        System.out.println("Girilen sayıların en büyüğü: " + max);
    }

}
