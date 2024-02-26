package TekSayılarınToplamınıProgram;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * Java döngüler ile tek bir sayı girilene kadar
         * kullanıcıdan girişleri kabul eden ve girilen değerlerden
         * çift ve 4'ün katları olan sayıları toplayıp ekrana basan
         * programı yazıyoruz.
         */

        Scanner input = new Scanner(System.in);
        int sayi, toplam = 0;

        while (true) {
            System.out.println("Sayi Giriniz: ");
            sayi = input.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
            if (sayi % 2 == 1) {
                break;
            }
        }
        System.out.println("Girilen sayılardan çift ve 4'ün  katları olan sayıları toplamı: " + toplam);

    }
}
