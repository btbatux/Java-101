package MetodUsHesaplama;

import java.util.Scanner;

public class Main {

    static int total = 1; // Sınıf Düzeyinde değişken

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Sayi Girisleri
        int taban, us; // Taban ve üs değiskeni

        System.out.print("Taban Değeri: ");
        taban = input.nextInt(); // Taban
        System.out.print("Üs Değeri: ");
        us = input.nextInt(); // Üs

        System.out.println("Sonuç: " + usHesapla(taban, us)); // taban ve üssü parametre olarka gönderdik ve sonucu
                                                              // yazdırdık

    }

    private static int usHesapla(int taban, int us) {

        for (int i = 1; i <= us; i++) {
            total *= taban; // tabanı üs miktarınca çarp
        }

        return total;
    }

}
