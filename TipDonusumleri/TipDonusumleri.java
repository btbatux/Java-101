package TipDonusumleri;

import java.util.Scanner;

public class TipDonusumleri {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir tam sayı girmesini iste
        System.out.print("Bir tam sayı giriniz: ");
        int tamSayi = scanner.nextInt();

        // Kullanıcıdan bir ondalıklı sayı girmesini iste
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double ondalikliSayi = scanner.nextDouble();

        // Tam sayıyı ondalıklı sayıya dönüştür
        double tamSayidanOndalikliya = (double) tamSayi;

        // Ondalıklı sayıyı tam sayıya dönüştür
        int ondalikliSayidanTama = (int) ondalikliSayi;

        // Sonuçları ekrana yazdır
        System.out.println("Tam sayının ondalıklı sayıya dönüştürülmesi: " + tamSayidanOndalikliya);
        System.out.println("Ondalıklı sayının tam sayıya dönüştürülmesi: " + ondalikliSayidanTama);
    }
}
