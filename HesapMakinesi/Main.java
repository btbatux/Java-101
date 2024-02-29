package HesapMakinesi;

import java.text.BreakIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        System.out.println("1- Toplama İşlemi \n" +
                "2- Çıkarma İşlemi \n" +
                "3- Çarpma İşlemi \n" +
                "4- Bölme İşlemi \n" +
                "5- Üslü Sayı Hesaplama \n" +
                "6- Mod Alma \n" +
                "7- Dikdörtgen Alan ve Çevre Hesabı \n" +
                "0- Çıkış Yap");
        select = input.nextInt();

        switch (select) {
            case 1:
                toplamaIslemi(); // toplama metodu
                break;

            case 2:
                cikarmaIslemi(); // cikarma metodu
                break;

            case 3:
                carpmaIslemi(); // carpma metodu
                break;

            case 4:
                bolmeIslemi(); // bolme metodu
                break;

            case 5:
                usluSayiHesapla(); // uslu sayı hesaplama metodu
                break;

            case 6:
                modAlma(); // mod alma metodu

            case 7:
                dikdortgenAlaniVeCevre(); // dikdortgen alan ve cevre hesaplama metodu

            default:
                break;

        }
    }

    private static void dikdortgenAlaniVeCevre() {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kısa kenarı giriniz: ");
        double kisaKenar = input.nextDouble();
        System.out.println("Lütfen uzun kenarı giriniz: ");
        double uzunKenar = input.nextDouble();

        double dikdortgenAlani = (kisaKenar + uzunKenar) * kisaKenar / 2;
        double dikdortgenCevresi = 2 * (kisaKenar + uzunKenar);

        System.out.printf("Dikdörtgenin alanı : %.2f\n", dikdortgenAlani);
        System.out.printf("Dikdörtgenin çevresi : %.2f", dikdortgenCevresi);

    }

    // Mod Alma Metodu...
    private static void modAlma() {
        int number, modDegeri, sonuc;
        Scanner input = new Scanner(System.in);

        System.out.println("Modu Alınacak Sayı: ");
        number = input.nextInt();
        if (number == 0) {
            return;
        }
        System.out.println("Mod Degeri : ");
        modDegeri = input.nextInt();
        sonuc = number % modDegeri;

        System.out.println("Sonuç : " + sonuc);
    }

    // Üslü Sayi Hesaplayan Metod...
    private static void usluSayiHesapla() {
        Scanner input = new Scanner(System.in);
        int taban, us, sonuc = 1;
        System.out.print("Taban Sayıyı Giriniz: ");
        taban = input.nextInt();
        System.out.print("Üssü Giriniz: ");
        us = input.nextInt();
        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }
        System.out.println("Sonuç : " + sonuc);
    }

    // Bölme İşlemi Yapan Metod...
    private static void bolmeIslemi() {
        Scanner input = new Scanner(System.in);
        double number = 0.0, firstNumber = 1.0;
        int i = 1;

        System.out.print("İlk Sayı: ");
        firstNumber = input.nextDouble();
        if (firstNumber == 0) {
            return;
        }

        while (true) {
            System.out.print(i++ + ". Sayıyı Griniz: ");
            number = input.nextDouble();
            if (number == 0) {
                break;
            }
            firstNumber /= number;

        }
        System.out.println("Bölme sonucu: " + firstNumber);
    }

    // Çarpma İşlemi Yapan Metod...
    private static void carpmaIslemi() {
        Scanner input = new Scanner(System.in);
        double number = 0.0, firstNumber = 1.0;
        int i = 1;

        System.out.print("İlk Sayı: ");
        firstNumber = input.nextDouble();
        if (firstNumber == 0) {
            return;
        }

        while (true) {
            System.out.print("Çarpılacak " + i++ + ". Sayıyı Griniz: ");
            number = input.nextDouble();
            if (number == 0) {
                break;
            }
            firstNumber *= number;

        }
        System.out.println("Çarpma sonucu: " + firstNumber);

    }

    // Çıkarma İşlemi Yapan Metod...
    private static void cikarmaIslemi() {
        Scanner input = new Scanner(System.in);
        double number = 0.0, firstNumber = 0.0;
        int i = 1;

        System.out.print("İlk Sayı: ");
        firstNumber = input.nextDouble();

        if (firstNumber == 0) {
            return;
        }

        while (true) {
            System.out.println("Çıkarılacak " + i++ + ". Sayıyı Griniz: ");
            number = input.nextDouble();
            if (number == 0) {
                break;
            }
            firstNumber -= number;

        }
        System.out.println("Çıkarma sonucu: " + firstNumber);

    }

    // Toplama İşlemi Yapan Metod...
    private static void toplamaIslemi() {
        Scanner input = new Scanner(System.in);
        double number, result = 0;
        int i = 1;
        while (true) {

            System.out.print(i++ + ".Sayıyı Giriniz :");
            number = input.nextDouble();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Toplama Sonucu: " + result);
    }

}
