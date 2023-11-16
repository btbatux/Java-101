package SayılarıSırala;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SayiSiralama {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList<>();
        System.out.println("Sayı girişini bitirmek için Enter'a basın.");

        String girilenSayi;

        while (true)

        {
            System.out.println("Sayı Girin: ");
            girilenSayi = input.nextLine();

            if (girilenSayi.isEmpty()) {
                break;
            }

            try {
                int sayi = Integer.parseInt(girilenSayi);
                sayilar.add(sayi);
            }

            catch (Exception e) {
                System.out.println(e.getMessage() + " Hatalı Sayı..");
            }
        }
        siralaVeYazdir(sayilar);
        input.close();
    }

    private static void siralaVeYazdir(ArrayList<Integer> sayilar) {

        Collections.sort(sayilar);

        System.out.println("Sıralı Sayılar:");

        for (int sayi : sayilar) {
            System.out.print(sayi + " ");
        }

        System.out.println(); // Satır sonu
    }
}
