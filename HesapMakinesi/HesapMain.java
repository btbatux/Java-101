package HesapMakinesi;

import java.util.ArrayList;
import java.util.Scanner;

public class HesapMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        DortIslem islem = new DortIslem();

        String secenek = "1- Toplama\n"
                + "2- Çıkarma\n"
                + "3- Çarpma\n"
                + "4- Bölme\n";

        System.out.println(secenek);
        byte secim = scan.nextByte();

        switch (secim) {

            // TOPLAMA
            case 1:
                islem.toplama();
                break;

            // ÇİKARMA
            case 2:
                islem.cikarma();
                break;

            // ÇARPMA
            case 3:
                ArrayList<Integer> sayilar = new ArrayList<>();
                System.out.print("Bir sayı girin veya Çıkmak için 0'a basın: ");
                while (true) {
                    int sayi = scan2.nextInt();

                    if (sayi == 0) {
                        break;
                    } else {
                        sayilar.add(sayi);
                    }
                }

                int sonuc = islem.carpma(sayilar);
                System.out.println("Çarpma Sonucu: " + sonuc);
        }

    }
}
