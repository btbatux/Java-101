package SayininBasamaklariToplami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        int basamakToplami = basamaklarToplamiHesapla(sayi);
        System.out.println("Girilen sayının basamaklarının toplamı: " + basamakToplami);
    }

    public static int basamaklarToplamiHesapla(int sayi) {
        int toplam = 0;
        while (sayi != 0) {
            toplam += sayi % 10; // Son basamağı toplama ekler
            sayi /= 10; // Sayıyı 10'a bölerek bir sonraki basamağa geçer
        }
        return toplam;
    }
}
